package integration

import Functions
import functions.System
import org.apache.commons.csv.CSVFormat
import org.apache.commons.csv.CSVRecord
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.mockito.Mockito
import org.mockito.Mockito.`when`
import java.io.FileReader
import java.io.IOException
import java.io.Reader

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestLayer1 {
    private lateinit var calculator: System
    private val PERIOD = 2 * Math.PI
    private val EPS = 1e-6
    private val mock = Mockito.mock(Functions::class.java)
    private val PERIOD_NUM = 200;

    @BeforeAll
    fun initMock() {
        calculator = System(mock)
        mockSinFromFile()
        mockCosFromFile()
        mockSecFromFile()
        mockCscFromFile()
        mockTanFromFile()
        mockCotFromFile()

        mockLnFromFile()
        mockLog2FromFile()
        mockLog3FromFile()
        mockLog10FromFile()
    }

    @Test
    fun checkFunction() {
        TestUtilities.assertBigDouble(143.94112885380136, calculator.calculate(-78.4768766159879));
        TestUtilities.assertBigDouble(0.012402666087860152, calculator.calculate(-5.771033540968432));
        TestUtilities.assertBigDouble(-0.08017686285702783, calculator.calculate(-56.011662071992085));
        TestUtilities.assertBigDouble(Double.NaN, calculator.calculate(-83.63140037147643));
        TestUtilities.assertBigDouble(3.764227754339249, calculator.calculate(-16.575791201423968));
        TestUtilities.assertBigDouble(-6.807312499050177, calculator.calculate(-71.00935809846433));
        TestUtilities.assertBigDouble(2535.9230132249145, calculator.calculate(-40.85448161128262));
        TestUtilities.assertBigDouble(0.7292054282971835, calculator.calculate(-74.67388110604549));
        TestUtilities.assertBigDouble(110.15847358691634, calculator.calculate(-23.654025410872137));
        TestUtilities.assertBigDouble(-4.959104781193707, calculator.calculate(-44.709579012060615));
        TestUtilities.assertBigDouble(-6.171294654077158, calculator.calculate(-96.15609399777273));
        TestUtilities.assertBigDouble(0.06538299304533586, calculator.calculate(-24.62991650009137));
        TestUtilities.assertBigDouble(1.5020538259688463, calculator.calculate(-27.86036822896014));
        TestUtilities.assertBigDouble(4374.339663362848, calculator.calculate(-98.97517933437508));
        TestUtilities.assertBigDouble(62.72707557301656, calculator.calculate(-78.44220220246164));
        TestUtilities.assertBigDouble(15.606645253262398, calculator.calculate(-42.65946086963063));
        TestUtilities.assertBigDouble(-39.06820010910529, calculator.calculate(-13.967126888204206));
        TestUtilities.assertBigDouble(76.63047987710021, calculator.calculate(-9.33697496057539));
        TestUtilities.assertBigDouble(625.1980247066958, calculator.calculate(-62.64111839435503));
        TestUtilities.assertBigDouble(7.632544141048997, calculator.calculate(-60.77153431827534));
        TestUtilities.assertBigDouble(60.21790634610144, calculator.calculate(-47.20305358212036));
        TestUtilities.assertBigDouble(-18.85890950852433, calculator.calculate(-75.75130871413687));
    }

    @Test
    fun checkFunctionOn200Period() {
        TestUtilities.assertBigDouble(
            143.94112885380136,
            calculator.calculate(-78.4768766159879 - PERIOD_NUM * PERIOD)
        );
        TestUtilities.assertBigDouble(
            0.012402666087860152,
            calculator.calculate(-5.771033540968432 - PERIOD_NUM * PERIOD)
        );
        TestUtilities.assertBigDouble(
            -0.08017686285702783,
            calculator.calculate(-56.011662071992085 - PERIOD_NUM * PERIOD)
        );
        TestUtilities.assertBigDouble(Double.NaN, calculator.calculate(-83.63140037147643 - PERIOD_NUM * PERIOD));
        TestUtilities.assertBigDouble(
            3.764227754339249,
            calculator.calculate(-16.575791201423968 - PERIOD_NUM * PERIOD)
        );
        TestUtilities.assertBigDouble(
            -6.807312499050177,
            calculator.calculate(-71.00935809846433 - PERIOD_NUM * PERIOD)
        );
        TestUtilities.assertBigDouble(
            2535.9230132249145,
            calculator.calculate(-40.85448161128262 - PERIOD_NUM * PERIOD)
        );
        TestUtilities.assertBigDouble(
            0.7292054282971835,
            calculator.calculate(-74.67388110604549 - PERIOD_NUM * PERIOD)
        );
        TestUtilities.assertBigDouble(
            110.15847358691634,
            calculator.calculate(-23.654025410872137 - PERIOD_NUM * PERIOD)
        );
        TestUtilities.assertBigDouble(
            -4.959104781193707,
            calculator.calculate(-44.709579012060615 - PERIOD_NUM * PERIOD)
        );
        TestUtilities.assertBigDouble(
            -6.171294654077158,
            calculator.calculate(-96.15609399777273 - PERIOD_NUM * PERIOD)
        );
        TestUtilities.assertBigDouble(
            0.06538299304533586,
            calculator.calculate(-24.62991650009137 - PERIOD_NUM * PERIOD)
        );
        TestUtilities.assertBigDouble(
            1.5020538259688463,
            calculator.calculate(-27.86036822896014 - PERIOD_NUM * PERIOD)
        );
        TestUtilities.assertBigDouble(
            4374.339663362848,
            calculator.calculate(-98.97517933437508 - PERIOD_NUM * PERIOD)
        );
        TestUtilities.assertBigDouble(
            62.72707557301656,
            calculator.calculate(-78.44220220246164 - PERIOD_NUM * PERIOD)
        );
        TestUtilities.assertBigDouble(
            15.606645253262398,
            calculator.calculate(-42.65946086963063 - PERIOD_NUM * PERIOD)
        );
        TestUtilities.assertBigDouble(
            -39.06820010910529,
            calculator.calculate(-13.967126888204206 - PERIOD_NUM * PERIOD)
        );
        TestUtilities.assertBigDouble(76.63047987710021, calculator.calculate(-9.33697496057539 - PERIOD_NUM * PERIOD));
        TestUtilities.assertBigDouble(
            625.1980247066958,
            calculator.calculate(-62.64111839435503 - PERIOD_NUM * PERIOD)
        );
        TestUtilities.assertBigDouble(
            7.632544141048997,
            calculator.calculate(-60.77153431827534 - PERIOD_NUM * PERIOD)
        );
        TestUtilities.assertBigDouble(
            60.21790634610144,
            calculator.calculate(-47.20305358212036 - PERIOD_NUM * PERIOD)
        );
        TestUtilities.assertBigDouble(
            -18.85890950852433,
            calculator.calculate(-75.75130871413687 - PERIOD_NUM * PERIOD)
        );
    }

    @Test
    fun checkExtrema() {
        TestUtilities.assertBigDouble(-4.171706585706972, calculator.calculate(-0.8867));
        TestUtilities.assertBigDouble(-1.9037867889534492, calculator.calculate(-3.529));
        TestUtilities.assertBigDouble(-0.10516922134184849, calculator.calculate(-5.724));
        TestUtilities.assertBigDouble(1.5293043291759962, calculator.calculate(-5.913));
        TestUtilities.assertBigDouble(228334.63270438314, calculator.calculate(-3.14011));
        TestUtilities.assertBigDouble(8.234975917213657E9, calculator.calculate(-4.7124));
    }

    @Test
    fun checkExtremaOn200Period() {
        TestUtilities.assertBigDouble(-4.171706585706972, calculator.calculate(-0.8867 - PERIOD_NUM * PERIOD));
        TestUtilities.assertBigDouble(-1.9037867889534492, calculator.calculate(-3.529 - PERIOD_NUM * PERIOD));
        TestUtilities.assertBigDouble(-0.10516922134184849, calculator.calculate(-5.724 - PERIOD_NUM * PERIOD));
        TestUtilities.assertBigDouble(1.5293043291759962, calculator.calculate(-5.913 - PERIOD_NUM * PERIOD));
        TestUtilities.assertBigDouble(228334.63270438314, calculator.calculate(-3.14011 - PERIOD_NUM * PERIOD));
        TestUtilities.assertBigDouble(8.234975917213657E9, calculator.calculate(-4.7124 - PERIOD_NUM * PERIOD));
    }

    @Test
    fun checkAsymptotes() {
        TestUtilities.assertBigDouble(147.77133060925362, calculator.calculate(-1.9999999999995866));
        TestUtilities.assertBigDouble(Double.NaN, calculator.calculate(0.0));
        TestUtilities.assertBigDouble(-2.4101480458459206E7, calculator.calculate(-1.571));
        TestUtilities.assertBigDouble(1.87652794026798E7, calculator.calculate(-3.763099999999999));
    }

    @Test
    fun checkAsymptotesOn200Period() {
        TestUtilities.assertBigDouble(
            147.77133060925362,
            calculator.calculate(-1.9999999999995866 - PERIOD_NUM * PERIOD)
        );
        TestUtilities.assertBigDouble(Double.NaN, calculator.calculate(0 - PERIOD_NUM * PERIOD));
        TestUtilities.assertBigDouble(-2.4101480458459206E7, calculator.calculate(-1.571 - PERIOD_NUM * PERIOD));
        TestUtilities.assertBigDouble(
            1.87652794026798E7,
            calculator.calculate(-3.763099999999999 - PERIOD_NUM * PERIOD)
        );
    }

    @Test
    fun checkAsymptotesForRightPart() {
        TestUtilities.assertBigDouble(6.939868112424287E10, calculator.calculate(EPS));
    }

    @Test
    fun checkExtremaForRightPart() {
        TestUtilities.assertBigDouble(-103954.87056398246, calculator.calculate(0.02));
        TestUtilities.assertBigDouble(576837.1958115611, calculator.calculate(215.3380200004247));
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

    fun mockCosFromFile() {
        try {
            val sinIn = FileReader("src/test/resources/cos.csv")
            val records = getRecords(sinIn)
            for (record in records) {
                `when`(mock.cos(record[0].toDouble()))
                    .thenReturn(record[1].toDouble())
            }

        } catch (exception: IOException) {
            println("Не удалось считать данные!");
        }
    }

    fun mockSecFromFile() {
        try {
            val sinIn = FileReader("src/test/resources/sec.csv")
            val records = getRecords(sinIn)
            for (record in records) {
                `when`(mock.sec(record[0].toDouble()))
                    .thenReturn(record[1].toDouble())
            }

        } catch (exception: IOException) {
            println("Не удалось считать данные!");
        }
    }

    fun mockCscFromFile() {
        try {
            val sinIn = FileReader("src/test/resources/csc.csv")
            val records = getRecords(sinIn)
            for (record in records) {
                `when`(mock.csc(record[0].toDouble()))
                    .thenReturn(record[1].toDouble())
            }

        } catch (exception: IOException) {
            println("Не удалось считать данные!");
        }
    }

    fun mockCotFromFile() {
        try {
            val sinIn = FileReader("src/test/resources/cot.csv")
            val records = getRecords(sinIn)
            for (record in records) {
                `when`(mock.cot(record[0].toDouble()))
                    .thenReturn(record[1].toDouble())
            }

        } catch (exception: IOException) {
            println("Не удалось считать данные!");
        }
    }

    fun mockTanFromFile() {
        try {
            val sinIn = FileReader("src/test/resources/tan.csv")
            val records = getRecords(sinIn)
            for (record in records) {
                `when`(mock.tan(record[0].toDouble()))
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

    fun mockLog2FromFile() {
        try {
            val sinIn = FileReader("src/test/resources/log2.csv")
            val records = getRecords(sinIn)
            for (record in records) {
                `when`(mock.log2(record[0].toDouble()))
                    .thenReturn(record[1].toDouble())
            }

        } catch (exception: IOException) {
            println("Не удалось считать данные!");
        }
    }

    fun mockLog3FromFile() {
        try {
            val sinIn = FileReader("src/test/resources/log3.csv")
            val records = getRecords(sinIn)
            for (record in records) {
                `when`(mock.log3(record[0].toDouble()))
                    .thenReturn(record[1].toDouble())
            }

        } catch (exception: IOException) {
            println("Не удалось считать данные!");
        }
    }

    fun mockLog10FromFile() {
        try {
            val sinIn = FileReader("src/test/resources/log10.csv")
            val records = getRecords(sinIn)
            for (record in records) {
                `when`(mock.log10(record[0].toDouble()))
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