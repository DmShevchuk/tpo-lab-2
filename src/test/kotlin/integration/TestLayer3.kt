package integration

import functions.BasicFunctions
import functions.FunctionCalculator
import integration.TestUtilities.Companion.assertBigDouble
import org.junit.jupiter.api.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import kotlin.math.PI

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestLayer3 {
    private lateinit var calculator: FunctionCalculator
    private val PERIOD = 2 * Math.PI
    private val EPS = 1e-10

    @BeforeAll
    fun init() {
        calculator = FunctionCalculator()
        val basicFunctions = BasicFunctions();

            println(basicFunctions.sin(-0.8867))
            println(basicFunctions.sin(-3.529))
            println(basicFunctions.sin(-5.724))
            println(basicFunctions.sin(-5.913))
            println(basicFunctions.sin(-3.14011))
            println(basicFunctions.sin(-4.7124))
            println(basicFunctions.sin(-0.8867 + PI /2))
            println(basicFunctions.sin(-3.529 + PI /2))
            println(basicFunctions.sin(-5.724 + PI /2))
            println(basicFunctions.sin(-5.913 + PI /2))
            println(basicFunctions.sin(-3.14011 + PI /2))
            println(basicFunctions.sin(-4.7124 + PI /2))

    }

    @ParameterizedTest
    @ValueSource(ints = [1, 3, 5, 100, 200])
    fun checkFunctionForPeriod(periodNum: Int) {

        assertBigDouble(143.94112885380136, calculator.calculate(-78.4768766159879));
        assertBigDouble(0.012402666087860152, calculator.calculate(-5.771033540968432));
        assertBigDouble(-0.08017686285702783, calculator.calculate(-56.011662071992085));
        assertBigDouble(Double.NaN, calculator.calculate(-83.63140037147643));
        assertBigDouble(3.6103361029664036, calculator.calculate(-16.575791201423968));
        assertBigDouble(Double.NaN, calculator.calculate(-71.00935809846433));
        assertBigDouble(2536.193248337651, calculator.calculate(-40.85448161128262));
        assertBigDouble(0.7179814403205295, calculator.calculate(-74.67388110604549));
        assertBigDouble(Double.NaN, calculator.calculate(-23.654025410872137));
        assertBigDouble(-4.906569526366578, calculator.calculate(-44.709579012060615));
        assertBigDouble(Double.NaN, calculator.calculate(-96.15609399777273));
        assertBigDouble(0.06410749662387662, calculator.calculate(-24.62991650009137));
        assertBigDouble(1.5086232664201482, calculator.calculate(-27.86036822896014));
        assertBigDouble(Double.NaN, calculator.calculate(-98.97517933437508));
        assertBigDouble(62.726091377191594, calculator.calculate(-78.44220220246164));
        assertBigDouble(Double.NaN, calculator.calculate(-42.65946086963063));
        assertBigDouble(Double.NaN, calculator.calculate(-13.967126888204206));
        assertBigDouble(76.62989768070948, calculator.calculate(-9.33697496057539));
        assertBigDouble(625.1921971432755, calculator.calculate(-62.64111839435503));
        assertBigDouble(7.556691611244261, calculator.calculate(-60.77153431827534));
        assertBigDouble(60.21704827187816, calculator.calculate(-47.20305358212036));
        assertBigDouble(-18.851864863214054, calculator.calculate(-75.75130871413687));

        assertBigDouble(143.94112885380136, calculator.calculate(-78.4768766159879 - periodNum * PERIOD));
        assertBigDouble(0.012402666087860152, calculator.calculate(-5.771033540968432 - periodNum * PERIOD));
        assertBigDouble(-0.08017686285702783, calculator.calculate(-56.011662071992085 - periodNum * PERIOD));
        assertBigDouble(Double.NaN, calculator.calculate(-83.63140037147643 - periodNum * PERIOD));
        assertBigDouble(3.6103361029664036, calculator.calculate(-16.575791201423968 - periodNum * PERIOD));
        assertBigDouble(Double.NaN, calculator.calculate(-71.00935809846433 - periodNum * PERIOD));
        assertBigDouble(2536.193248337651, calculator.calculate(-40.85448161128262 - periodNum * PERIOD));
        assertBigDouble(0.7179814403205295, calculator.calculate(-74.67388110604549 - periodNum * PERIOD));
        assertBigDouble(Double.NaN, calculator.calculate(-23.654025410872137 - periodNum * PERIOD));
        assertBigDouble(-4.906569526366578, calculator.calculate(-44.709579012060615 - periodNum * PERIOD));
        assertBigDouble(Double.NaN, calculator.calculate(-96.15609399777273 - periodNum * PERIOD));
        assertBigDouble(0.06410749662387662, calculator.calculate(-24.62991650009137 - periodNum * PERIOD));
        assertBigDouble(1.5086232664201482, calculator.calculate(-27.86036822896014 - periodNum * PERIOD));
        assertBigDouble(Double.NaN, calculator.calculate(-98.97517933437508 - periodNum * PERIOD));
        assertBigDouble(62.726091377191594, calculator.calculate(-78.44220220246164 - periodNum * PERIOD));
        assertBigDouble(Double.NaN, calculator.calculate(-42.65946086963063 - periodNum * PERIOD));
        assertBigDouble(Double.NaN, calculator.calculate(-13.967126888204206 - periodNum * PERIOD));
        assertBigDouble(76.62989768070948, calculator.calculate(-9.33697496057539 - periodNum * PERIOD));
        assertBigDouble(625.1921971432755, calculator.calculate(-62.64111839435503 - periodNum * PERIOD));
        assertBigDouble(7.556691611244261, calculator.calculate(-60.77153431827534 - periodNum * PERIOD));
        assertBigDouble(60.21704827187816, calculator.calculate(-47.20305358212036 - periodNum * PERIOD));
        assertBigDouble(-18.851864863214054, calculator.calculate(-75.75130871413687 - periodNum * PERIOD));
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


}