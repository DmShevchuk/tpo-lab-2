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

    private val mock = Mockito.mock(BasicFunctions::class.java)
    private lateinit var calculator: FunctionCalculator

    private val PERIOD = 2 * Math.PI
    private val EPS = 1e-6
    private val PERIOD_NUM = 200;

    @BeforeAll
    fun initMock() {
        calculator = FunctionCalculator(Functions(mock))
        mockSin()
        mockLn()
    }

    private fun mockSin() {
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
        `when`(mock.sin(-0.8867 + PI / 2)).thenReturn(0.6319729315408945);
        `when`(mock.sin(-3.529 + PI / 2)).thenReturn(-0.9258916470628091);
        `when`(mock.sin(-5.724 + PI / 2)).thenReturn(0.8476875833754641);
        `when`(mock.sin(-5.913 + PI / 2)).thenReturn(0.9322603196634922);
        `when`(mock.sin(-3.14011 + PI / 2)).thenReturn(-0.9999989008694107);
        `when`(mock.sin(-4.7124 + PI / 2)).thenReturn(1.101961548021488E-5);
        `when`(mock.sin(-78.4768766159879)).thenReturn(-0.06289817699065442)
        `when`(mock.sin(-5.771033540968432)).thenReturn(0.4900540574224449)
        `when`(mock.sin(-56.011662071992085)).thenReturn(0.5115654472217117)
        `when`(mock.sin(-83.63140037147643)).thenReturn(-0.9289629066159499)
        `when`(mock.sin(-16.575791201423968)).thenReturn(0.7629265289664479)
        `when`(mock.sin(-71.00935809846433)).thenReturn(-0.9481211868155247)
        `when`(mock.sin(-40.85448161128262)).thenReturn(0.013776678783173079)
        `when`(mock.sin(-74.67388110604549)).thenReturn(0.6626432209873704)
        `when`(mock.sin(-23.654025410872137)).thenReturn(0.9957635845222013)
        `when`(mock.sin(-44.709579012060615)).thenReturn(-0.6648416869850924)
        `when`(mock.sin(-96.15609399777273)).thenReturn(-0.9435794548493197)
        `when`(mock.sin(-24.62991650009137)).thenReturn(0.48190255520373504)
        `when`(mock.sin(-27.86036822896014)).thenReturn(-0.4022431673715233)
        `when`(mock.sin(-98.97517933437508)).thenReturn(0.9998873408631237)
        `when`(mock.sin(-78.44220220246164)).thenReturn(-0.09745919141516621)
        `when`(mock.sin(-42.65946086963063)).thenReturn(0.9694150979937904)
        `when`(mock.sin(-13.967126888204206)).thenReturn(-0.9855779898660006)
        `when`(mock.sin(-9.33697496057539)).thenReturn(-0.08769022608379741)
        `when`(mock.sin(-62.64111839435503)).thenReturn(0.18958030030128345)
        `when`(mock.sin(-60.77153431827534)).thenReturn(0.8825575163285769)
        `when`(mock.sin(-47.20305358212036)).thenReturn(0.07908111888193373)
        `when`(mock.sin(-75.75130871413687)).thenReturn(-0.3457941622172371)
        `when`(mock.sin(-78.4768766159879 - PERIOD_NUM * PERIOD)).thenReturn(-0.06289817699052654)
        `when`(mock.sin(-5.771033540968432 - PERIOD_NUM * PERIOD)).thenReturn(0.4900540574224715)
        `when`(mock.sin(-56.011662071992085 - PERIOD_NUM * PERIOD)).thenReturn(0.5115654472216695)
        `when`(mock.sin(-83.63140037147643 - PERIOD_NUM * PERIOD)).thenReturn(-0.9289629066159026)
        `when`(mock.sin(-16.575791201423968 - PERIOD_NUM * PERIOD)).thenReturn(0.762926528966476)
        `when`(mock.sin(-71.00935809846433 - PERIOD_NUM * PERIOD)).thenReturn(-0.9481211868154794)
        `when`(mock.sin(-40.85448161128262 - PERIOD_NUM * PERIOD)).thenReturn(0.013776678783215403)
        `when`(mock.sin(-74.67388110604549 - PERIOD_NUM * PERIOD)).thenReturn(0.6626432209873704)
        `when`(mock.sin(-23.654025410872137 - PERIOD_NUM * PERIOD)).thenReturn(0.9957635845221842)
        `when`(mock.sin(-44.709579012060615 - PERIOD_NUM * PERIOD)).thenReturn(-0.6648416869851668)
        `when`(mock.sin(-96.15609399777273 - PERIOD_NUM * PERIOD)).thenReturn(-0.9435794548492726)
        `when`(mock.sin(-24.62991650009137 - PERIOD_NUM * PERIOD)).thenReturn(0.4819025552036249)
        `when`(mock.sin(-27.86036822896014 - PERIOD_NUM * PERIOD)).thenReturn(-0.4022431673714453)
        `when`(mock.sin(-98.97517933437508 - PERIOD_NUM * PERIOD)).thenReturn(0.9998873408631235)
        `when`(mock.sin(-78.44220220246164 - PERIOD_NUM * PERIOD)).thenReturn(-0.09745919141509554)
        `when`(mock.sin(-42.65946086963063 - PERIOD_NUM * PERIOD)).thenReturn(0.9694150979937528)
        `when`(mock.sin(-13.967126888204206 - PERIOD_NUM * PERIOD)).thenReturn(-0.985577989865996)
        `when`(mock.sin(-9.33697496057539 - PERIOD_NUM * PERIOD)).thenReturn(-0.08769022608374069)
        `when`(mock.sin(-62.64111839435503 - PERIOD_NUM * PERIOD)).thenReturn(0.18958030030117004)
        `when`(mock.sin(-60.77153431827534 - PERIOD_NUM * PERIOD)).thenReturn(0.8825575163286173)
        `when`(mock.sin(-47.20305358212036 - PERIOD_NUM * PERIOD)).thenReturn(0.07908111888207571)
        `when`(mock.sin(-75.75130871413687 - PERIOD_NUM * PERIOD)).thenReturn(-0.34579416221735704)
        `when`(mock.sin(-78.4768766159879 + PI / 2)).thenReturn(-0.9980199493653822)
        `when`(mock.sin(-5.771033540968432 + PI / 2)).thenReturn(0.8716920447061501)
        `when`(mock.sin(-56.011662071992085 + PI / 2)).thenReturn(0.8592443152031926)
        `when`(mock.sin(-83.63140037147643 + PI / 2)).thenReturn(-0.3701728219791895)
        `when`(mock.sin(-16.575791201423968 + PI / 2)).thenReturn(-0.6464851981285414)
        `when`(mock.sin(-71.00935809846433 + PI / 2)).thenReturn(-0.3179091302739892)
        `when`(mock.sin(-40.85448161128262 + PI / 2)).thenReturn(-0.9999050970576225)
        `when`(mock.sin(-74.67388110604549 + PI / 2)).thenReturn(0.748935218613803)
        `when`(mock.sin(-23.654025410872137 + PI / 2)).thenReturn(0.09195044175665132)
        `when`(mock.sin(-44.709579012060615 + PI / 2)).thenReturn(0.7469842911649098)
        `when`(mock.sin(-96.15609399777273 + PI / 2)).thenReturn(-0.33114620998335864)
        `when`(mock.sin(-24.62991650009137 + PI / 2)).thenReturn(0.8762248154944668)
        `when`(mock.sin(-27.86036822896014 + PI / 2)).thenReturn(-0.9155328690457739)
        `when`(mock.sin(-98.97517933437508 + PI / 2)).thenReturn(0.015010182593325115)
        `when`(mock.sin(-78.44220220246164 + PI / 2)).thenReturn(-0.9952395219286228)
        `when`(mock.sin(-42.65946086963063 + PI / 2)).thenReturn(0.24542690924355395)
        `when`(mock.sin(-13.967126888204206 + PI / 2)).thenReturn(0.16922182450822962)
        `when`(mock.sin(-9.33697496057539 + PI / 2)).thenReturn(-0.9961477923728923)
        `when`(mock.sin(-62.64111839435503 + PI / 2)).thenReturn(0.9818652197412449)
        `when`(mock.sin(-60.77153431827534 + PI / 2)).thenReturn(-0.4702044559257232)
        `when`(mock.sin(-47.20305358212036 + PI / 2)).thenReturn(-0.996868184183171)
        `when`(mock.sin(-75.75130871413687 + PI / 2)).thenReturn(0.9383103950053551)
        `when`(mock.sin(-78.4768766159879 - PERIOD_NUM * PERIOD + PI / 2)).thenReturn(-0.9980199493653938)
        `when`(mock.sin(-5.771033540968432 - PERIOD_NUM * PERIOD + PI / 2)).thenReturn(0.8716920447061666)
        `when`(mock.sin(-56.011662071992085 - PERIOD_NUM * PERIOD + PI / 2)).thenReturn(0.8592443152032513)
        `when`(mock.sin(-83.63140037147643 - PERIOD_NUM * PERIOD + PI / 2)).thenReturn(-0.37017282197936113)
        `when`(mock.sin(-16.575791201423968 - PERIOD_NUM * PERIOD + PI / 2)).thenReturn(-0.6464851981284613)
        `when`(mock.sin(-71.00935809846433 - PERIOD_NUM * PERIOD + PI / 2)).thenReturn(-0.3179091302741778)
        `when`(mock.sin(-40.85448161128262 - PERIOD_NUM * PERIOD + PI / 2)).thenReturn(-0.9999050970576209)
        `when`(mock.sin(-74.67388110604549 - PERIOD_NUM * PERIOD + PI / 2)).thenReturn(0.7489352186138398)
        `when`(mock.sin(-23.654025410872137 - PERIOD_NUM * PERIOD + PI / 2)).thenReturn(0.09195044175687127)
        `when`(mock.sin(-44.709579012060615 - PERIOD_NUM * PERIOD + PI / 2)).thenReturn(0.7469842911648041)
        `when`(mock.sin(-96.15609399777273 - PERIOD_NUM * PERIOD + PI / 2)).thenReturn(-0.3311462099835464)
        `when`(mock.sin(-24.62991650009137 - PERIOD_NUM * PERIOD + PI / 2)).thenReturn(0.8762248154945581)
        `when`(mock.sin(-27.86036822896014 - PERIOD_NUM * PERIOD + PI / 2)).thenReturn(-0.9155328690458341)
        `when`(mock.sin(-98.97517933437508 - PERIOD_NUM * PERIOD + PI / 2)).thenReturn(0.015010182593424227)
        `when`(mock.sin(-78.44220220246164 - PERIOD_NUM * PERIOD + PI / 2)).thenReturn(-0.9952395219286352)
        `when`(mock.sin(-42.65946086963063 - PERIOD_NUM * PERIOD + PI / 2)).thenReturn(0.24542690924376084)
        `when`(mock.sin(-13.967126888204206 - PERIOD_NUM * PERIOD + PI / 2)).thenReturn(0.16922182450819004)
        `when`(mock.sin(-9.33697496057539 - PERIOD_NUM * PERIOD + PI / 2)).thenReturn(-0.9961477923729029)
        `when`(mock.sin(-62.64111839435503 - PERIOD_NUM * PERIOD + PI / 2)).thenReturn(0.9818652197412778)
        `when`(mock.sin(-60.77153431827534 - PERIOD_NUM * PERIOD + PI / 2)).thenReturn(-0.4702044559255917)
        `when`(mock.sin(-47.20305358212036 - PERIOD_NUM * PERIOD + PI / 2)).thenReturn(-0.9968681841831548)
        `when`(mock.sin(-75.75130871413687 - PERIOD_NUM * PERIOD + PI / 2)).thenReturn(0.9383103950052911)
        `when`(mock.sin(-1.9999999999995866)).thenReturn(-0.9092974268258128)
        `when`(mock.sin(0.0)).thenReturn(0.0)
        `when`(mock.sin(-1.571)).thenReturn(-0.9999999792586565)
        `when`(mock.sin(-3.763099999999999)).thenReturn(0.5822612967595258)
        `when`(mock.sin(-1.9999999999995866 + PI / 2)).thenReturn(-0.4161468365467638)
        `when`(mock.sin(0.0 + PI / 2)).thenReturn(1.0000000000000437)
        `when`(mock.sin(-1.571 + PI / 2)).thenReturn(-2.036732036952391E-4)
        `when`(mock.sin(-3.763099999999999 + PI / 2)).thenReturn(-0.8130017111267944)
        `when`(mock.sin(-1.9999999999995866 - PERIOD_NUM * PERIOD)).thenReturn(-0.9092974268258066)
        `when`(mock.sin(-1.571 - PERIOD_NUM * PERIOD)).thenReturn(-0.9999999792586565)
        `when`(mock.sin(-3.763099999999999 - PERIOD_NUM * PERIOD)).thenReturn(0.5822612967594886)
        `when`(mock.sin(-1.9999999999995866 - PERIOD_NUM * PERIOD + PI / 2)).thenReturn(-0.41614683654683454)
        `when`(mock.sin(0.0 - PERIOD_NUM * PERIOD + PI / 2)).thenReturn(0.9999999999999116)
        `when`(mock.sin(-1.571 - PERIOD_NUM * PERIOD + PI / 2)).thenReturn(-2.0367320372699147E-4)
        `when`(mock.sin(-3.763099999999999 - PERIOD_NUM * PERIOD + PI / 2)).thenReturn(-0.8130017111267858)
        `when`(mock.sin(-0.8867 - PERIOD_NUM * PERIOD)).thenReturn(-0.77499046045734)
        `when`(mock.sin(-3.529 - PERIOD_NUM * PERIOD)).thenReturn(0.37778917123081346)
        `when`(mock.sin(-5.724 - PERIOD_NUM * PERIOD)).thenReturn(0.5304957690606096)
        `when`(mock.sin(-5.913 - PERIOD_NUM * PERIOD)).thenReturn(0.3617881927059663)
        `when`(mock.sin(-3.14011 - PERIOD_NUM * PERIOD)).thenReturn(-0.0014826530463084486)
        `when`(mock.sin(-4.7124 - PERIOD_NUM * PERIOD)).thenReturn(0.999999999939195)
        `when`(mock.sin(-0.8867 - PERIOD_NUM * PERIOD + PI / 2)).thenReturn(0.6319729315413316)
        `when`(mock.sin(-3.529 - PERIOD_NUM * PERIOD + PI / 2)).thenReturn(-0.9258916470627655)
        `when`(mock.sin(-5.724 - PERIOD_NUM * PERIOD + PI / 2)).thenReturn(0.8476875833754904)
        `when`(mock.sin(-5.913 - PERIOD_NUM * PERIOD + PI / 2)).thenReturn(0.9322603196635392)
        `when`(mock.sin(-3.14011 - PERIOD_NUM * PERIOD + PI / 2)).thenReturn(-0.9999989008694107)
        `when`(mock.sin(-4.7124 - PERIOD_NUM * PERIOD + PI / 2)).thenReturn(1.1019615487858221E-5)
    }

    private fun mockLn() {
        `when`(mock.ln(EPS)).thenReturn(-13.815510534473498);
        `when`(mock.ln(0.02)).thenReturn(-3.91202300542697);
        `when`(mock.ln(215.3380200004247)).thenReturn(5.372208979580273);

        `when`(mock.ln(2.0)).thenReturn(0.6931471805598399);
        `when`(mock.ln(3.0)).thenReturn(1.0986122886679865);
        `when`(mock.ln(10.0)).thenReturn(2.3025850929937857);
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


}