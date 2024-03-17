package integration

import functions.BasicFunctions
import functions.FunctionCalculator
import integration.TestUtilities.Companion.assertBigDouble
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestLayer3 {
    private lateinit var calculator: FunctionCalculator
    private val PERIOD = 2 * Math.PI
    private val EPS = 1e-6

    @BeforeAll
    fun init() {
        calculator = FunctionCalculator()
        val basicFunctions = BasicFunctions();
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
        val periodNum = 200;
        assertBigDouble(143.94112885380136, calculator.calculate(-78.4768766159879 - periodNum * PERIOD));
        assertBigDouble(0.012402666087860152, calculator.calculate(-5.771033540968432 - periodNum * PERIOD));
        assertBigDouble(-0.08017686285702783, calculator.calculate(-56.011662071992085 - periodNum * PERIOD));
        assertBigDouble(Double.NaN, calculator.calculate(-83.63140037147643 - periodNum * PERIOD));
        assertBigDouble(3.764227754339249, calculator.calculate(-16.575791201423968 - periodNum * PERIOD));
        assertBigDouble(-6.807312499050177, calculator.calculate(-71.00935809846433 - periodNum * PERIOD));
        assertBigDouble(2535.9230132249145, calculator.calculate(-40.85448161128262 - periodNum * PERIOD));
        assertBigDouble(0.7292054282971835, calculator.calculate(-74.67388110604549 - periodNum * PERIOD));
        assertBigDouble(110.15847358691634, calculator.calculate(-23.654025410872137 - periodNum * PERIOD));
        assertBigDouble(-4.959104781193707, calculator.calculate(-44.709579012060615 - periodNum * PERIOD));
        assertBigDouble(-6.171294654077158, calculator.calculate(-96.15609399777273 - periodNum * PERIOD));
        assertBigDouble(0.06538299304533586, calculator.calculate(-24.62991650009137 - periodNum * PERIOD));
        assertBigDouble(1.5020538259688463, calculator.calculate(-27.86036822896014 - periodNum * PERIOD));
        assertBigDouble(4374.339663362848, calculator.calculate(-98.97517933437508 - periodNum * PERIOD));
        assertBigDouble(62.72707557301656, calculator.calculate(-78.44220220246164 - periodNum * PERIOD));
        assertBigDouble(15.606645253262398, calculator.calculate(-42.65946086963063 - periodNum * PERIOD));
        assertBigDouble(-39.06820010910529, calculator.calculate(-13.967126888204206 - periodNum * PERIOD));
        assertBigDouble(76.63047987710021, calculator.calculate(-9.33697496057539 - periodNum * PERIOD));
        assertBigDouble(625.1980247066958, calculator.calculate(-62.64111839435503 - periodNum * PERIOD));
        assertBigDouble(7.632544141048997, calculator.calculate(-60.77153431827534 - periodNum * PERIOD));
        assertBigDouble(60.21790634610144, calculator.calculate(-47.20305358212036 - periodNum * PERIOD));
        assertBigDouble(-18.85890950852433, calculator.calculate(-75.75130871413687 - periodNum * PERIOD));
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
        val periodNum = 200;

        assertBigDouble(-4.171706585706972, calculator.calculate(-0.8867 - periodNum * PERIOD));
        assertBigDouble(-1.9037867889534492, calculator.calculate(-3.529 - periodNum * PERIOD));
        assertBigDouble(-0.10516922134184849, calculator.calculate(-5.724 - periodNum * PERIOD));
        assertBigDouble(1.5293043291759962, calculator.calculate(-5.913 - periodNum * PERIOD));
        assertBigDouble(228334.63270438314, calculator.calculate(-3.14011 - periodNum * PERIOD));
        assertBigDouble(8.234975917213657E9, calculator.calculate(-4.7124 - periodNum * PERIOD));
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
        val periodNum = 200;

        assertBigDouble(147.77133060925362, calculator.calculate(-1.9999999999995866 - periodNum * PERIOD));
        assertBigDouble(Double.NaN, calculator.calculate(0 - periodNum * PERIOD));
        assertBigDouble(-2.4101480458459206E7, calculator.calculate(-1.571 - periodNum * PERIOD));
        assertBigDouble(1.87652794026798E7, calculator.calculate(-3.763099999999999 - periodNum * PERIOD));
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

}