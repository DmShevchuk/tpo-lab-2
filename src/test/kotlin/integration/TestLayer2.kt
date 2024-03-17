package integration

import Functions
import functions.BasicFunctions
import functions.FunctionCalculator
import integration.TestUtilities.Companion.assertBigDouble
import org.junit.jupiter.api.*
import org.mockito.Mockito
import org.mockito.Mockito.`when`
import kotlin.math.PI

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestLayer2 {
    private lateinit var calculator: FunctionCalculator
    private val PERIOD = 2 * Math.PI
    private val EPS = 1e-10

    @BeforeAll
    fun initMock() {
        val mock = Mockito.mock(BasicFunctions::class.java)
        calculator = FunctionCalculator(Functions(mock))

        `when`(mock.sin(-78.4768766159879)).thenReturn(-0.06289817699065442)
        `when`(mock.sin(-78.4768766159879 + PI / 2)).thenReturn(-0.998019949365362)
        `when`(mock.sin(-5.771033540968432 + PI / 2)).thenReturn(0.8716920447060184)
        `when`(mock.sin(-5.771033540968432)).thenReturn(0.49005405742248564)
        `when`(mock.sin(-0.8867)).thenReturn(-0.774990460457292);
        `when`(mock.sin(-3.529)).thenReturn(0.37778917123076483);
        `when`(mock.sin(-5.724)).thenReturn(0.5304957690605994);
        `when`(mock.sin(-5.913)).thenReturn(0.36178819270602913);
        `when`(mock.sin(-3.14011)).thenReturn(-0.0014826530464143784);
        `when`(mock.sin(-4.7124)).thenReturn(0.9999999999391981);
        `when`(mock.sin(-0.8867 + PI /2)).thenReturn(0.6319729315408945);
        `when`(mock.sin(-3.529 + PI /2)).thenReturn(-0.9258916470628091);
        `when`(mock.sin(-5.724 + PI /2)).thenReturn(0.8476875833754641);
        `when`(mock.sin(-5.913 + PI /2)).thenReturn(0.9322603196634922);
        `when`(mock.sin(-3.14011 + PI /2)).thenReturn(-0.9999989008694107);
        `when`(mock.sin(-4.7124 + PI /2)).thenReturn(1.101961548021488E-5);
    }


    @Test
    fun checkFunctionForPeriod() {
        assertBigDouble(143.94112885380136, calculator.calculate(-78.4768766159879));
        assertBigDouble(0.012402666087860152, calculator.calculate(-5.771033540968432));
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

}