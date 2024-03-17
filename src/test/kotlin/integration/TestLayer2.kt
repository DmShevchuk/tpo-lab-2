package integration

import Functions
import functions.InitialFunctions
import functions.System
import integration.TestUtilities.Companion.assertBigDouble
import org.apache.commons.csv.CSVFormat
import org.apache.commons.csv.CSVRecord
import org.junit.jupiter.api.*
import org.mockito.Mockito
import org.mockito.Mockito.`when`
import java.io.FileReader
import java.io.IOException
import java.io.Reader

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestLayer2 {

    private val mock = Mockito.mock(InitialFunctions::class.java)
    private lateinit var calculator: System

    private val PERIOD = 2 * Math.PI
    private val EPS = 1e-6
    private val PERIOD_NUM = 200;

    @BeforeAll
    fun initMock() {
        calculator = System(Functions(mock))
        mockSinFromFile()
        mockLnFromFile()
    }

    @Test
    fun checkFunction() {
        assertBigDouble(143.94112885380136, calculator.calculate(-78.4768766159879));
        assertBigDouble(0.012402666087860152, calculator.calculate(-5.771033540968432));
        assertBigDouble(-0.08017686285702783, calculator.calculate(-56.011662071992085));
        assertBigDouble(Double.NaN, calculator.calculate(-83.63140037147643));
        assertBigDouble(3.764227754339249, calculator.calculate(-16.575791201423968));
        assertBigDouble(-6.807312499050177, calculator.calculate(-71.00935809846433));
        assertBigDouble(2535.9230132249145, calculator.calculate(-40.85448161128262));
        assertBigDouble(0.7292054282971835, calculator.calculate(-74.67388110604549));
        assertBigDouble(110.15847358691634, calculator.calculate(-23.654025410872137));
        assertBigDouble(-4.959104781193707, calculator.calculate(-44.709579012060615));
        assertBigDouble(-6.171294654077158, calculator.calculate(-96.15609399777273));
        assertBigDouble(0.06538299304533586, calculator.calculate(-24.62991650009137));
        assertBigDouble(1.5020538259688463, calculator.calculate(-27.86036822896014));
        assertBigDouble(4374.339663362848, calculator.calculate(-98.97517933437508));
        assertBigDouble(62.72707557301656, calculator.calculate(-78.44220220246164));
        assertBigDouble(15.606645253262398, calculator.calculate(-42.65946086963063));
        assertBigDouble(-39.06820010910529, calculator.calculate(-13.967126888204206));
        assertBigDouble(76.63047987710021, calculator.calculate(-9.33697496057539));
        assertBigDouble(625.1980247066958, calculator.calculate(-62.64111839435503));
        assertBigDouble(7.632544141048997, calculator.calculate(-60.77153431827534));
        assertBigDouble(60.21790634610144, calculator.calculate(-47.20305358212036));
        assertBigDouble(-18.85890950852433, calculator.calculate(-75.75130871413687));
    }

    @Test
    fun checkFunctionOn200Period() {
        assertBigDouble(143.94112885380136, calculator.calculate(-78.4768766159879 - PERIOD_NUM * PERIOD));
        assertBigDouble(0.012402666087860152, calculator.calculate(-5.771033540968432 - PERIOD_NUM * PERIOD));
        assertBigDouble(-0.08017686285702783, calculator.calculate(-56.011662071992085 - PERIOD_NUM * PERIOD));
        assertBigDouble(Double.NaN, calculator.calculate(-83.63140037147643 - PERIOD_NUM * PERIOD));
        assertBigDouble(3.764227754339249, calculator.calculate(-16.575791201423968 - PERIOD_NUM * PERIOD));
        assertBigDouble(-6.807312499050177, calculator.calculate(-71.00935809846433 - PERIOD_NUM * PERIOD));
        assertBigDouble(2535.9230132249145, calculator.calculate(-40.85448161128262 - PERIOD_NUM * PERIOD));
        assertBigDouble(0.7292054282971835, calculator.calculate(-74.67388110604549 - PERIOD_NUM * PERIOD));
        assertBigDouble(110.15847358691634, calculator.calculate(-23.654025410872137 - PERIOD_NUM * PERIOD));
        assertBigDouble(-4.959104781193707, calculator.calculate(-44.709579012060615 - PERIOD_NUM * PERIOD));
        assertBigDouble(-6.171294654077158, calculator.calculate(-96.15609399777273 - PERIOD_NUM * PERIOD));
        assertBigDouble(0.06538299304533586, calculator.calculate(-24.62991650009137 - PERIOD_NUM * PERIOD));
        assertBigDouble(1.5020538259688463, calculator.calculate(-27.86036822896014 - PERIOD_NUM * PERIOD));
        assertBigDouble(4374.339663362848, calculator.calculate(-98.97517933437508 - PERIOD_NUM * PERIOD));
        assertBigDouble(62.72707557301656, calculator.calculate(-78.44220220246164 - PERIOD_NUM * PERIOD));
        assertBigDouble(15.606645253262398, calculator.calculate(-42.65946086963063 - PERIOD_NUM * PERIOD));
        assertBigDouble(-39.06820010910529, calculator.calculate(-13.967126888204206 - PERIOD_NUM * PERIOD));
        assertBigDouble(76.63047987710021, calculator.calculate(-9.33697496057539 - PERIOD_NUM * PERIOD));
        assertBigDouble(625.1980247066958, calculator.calculate(-62.64111839435503 - PERIOD_NUM * PERIOD));
        assertBigDouble(7.632544141048997, calculator.calculate(-60.77153431827534 - PERIOD_NUM * PERIOD));
        assertBigDouble(60.21790634610144, calculator.calculate(-47.20305358212036 - PERIOD_NUM * PERIOD));
        assertBigDouble(-18.85890950852433, calculator.calculate(-75.75130871413687 - PERIOD_NUM * PERIOD));
    }

    @Test
    fun checkExtrema() {
        assertBigDouble(-4.171706585706972, calculator.calculate(-0.8867));
        assertBigDouble(-1.9037867889534492, calculator.calculate(-3.529));
        assertBigDouble(-0.10516922134184849, calculator.calculate(-5.724));
        assertBigDouble(1.5293043291759962, calculator.calculate(-5.913));
        assertBigDouble(228334.63270438314, calculator.calculate(-3.14011));
        assertBigDouble(8.234975917213657E9, calculator.calculate(-4.7124));
    }

    @Test
    fun checkExtremaOn200Period() {
        assertBigDouble(-4.171706585706972, calculator.calculate(-0.8867 - PERIOD_NUM * PERIOD));
        assertBigDouble(-1.9037867889534492, calculator.calculate(-3.529 - PERIOD_NUM * PERIOD));
        assertBigDouble(-0.10516922134184849, calculator.calculate(-5.724 - PERIOD_NUM * PERIOD));
        assertBigDouble(1.5293043291759962, calculator.calculate(-5.913 - PERIOD_NUM * PERIOD));
        assertBigDouble(228334.63270438314, calculator.calculate(-3.14011 - PERIOD_NUM * PERIOD));
        assertBigDouble(8.234975917213657E9, calculator.calculate(-4.7124 - PERIOD_NUM * PERIOD));
    }

    @Test
    fun checkAsymptotes() {
        assertBigDouble(147.77133060925362, calculator.calculate(-1.9999999999995866));
        assertBigDouble(Double.NaN, calculator.calculate(0.0));
        assertBigDouble(-2.4101480458459206E7, calculator.calculate(-1.571));
        assertBigDouble(1.87652794026798E7, calculator.calculate(-3.763099999999999));
    }

    @Test
    fun checkAsymptotesOn200Period() {
        assertBigDouble(147.77133060925362, calculator.calculate(-1.9999999999995866 - PERIOD_NUM * PERIOD));
        assertBigDouble(Double.NaN, calculator.calculate(0 - PERIOD_NUM * PERIOD));
        assertBigDouble(-2.4101480458459206E7, calculator.calculate(-1.571 - PERIOD_NUM * PERIOD));
        assertBigDouble(1.87652794026798E7, calculator.calculate(-3.763099999999999 - PERIOD_NUM * PERIOD));
    }

    @Test
    fun checkAsymptotesForRightPart() {
        assertBigDouble(6.939868112424287E10, calculator.calculate(EPS));
    }

    @Test
    fun checkExtremaForRightPart() {
        assertBigDouble(-103954.87056398246, calculator.calculate(0.02));
        assertBigDouble(576837.1958115611, calculator.calculate(215.3380200004247));
    }

    fun mockSinFromFile() {
        try {
            val sinIn = FileReader("src/test/resources/sin.csv")
            val records = getRecords(sinIn)
            for (record in records) {
                `when`(mock.sin(record[0].toDouble()))
                    .thenReturn(record[1].toDouble())
            }

        } catch (exception: IOException) {
            println("Не удалось считать данные!");
        }
    }

    fun mockLnFromFile() {
        try {
            val sinIn = FileReader("src/test/resources/ln.csv")
            val records = getRecords(sinIn)
            for (record in records) {
                `when`(mock.ln(record[0].toDouble()))
                    .thenReturn(record[1].toDouble())
            }

        } catch (exception: IOException) {
            println("Не удалось считать данные!");
        }
    }

    private fun getRecords(source: Reader): Iterable<CSVRecord> {
        return CSVFormat.DEFAULT.parse(source)
    }

}