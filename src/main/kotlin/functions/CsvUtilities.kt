package functions

import java.io.File
import java.io.FileNotFoundException
import java.io.PrintWriter
import kotlin.math.PI

class Utilities(private val calculator: System) {

    private val log2 = calculator.f::log2
    private val log3 = calculator.f::log3
    private val log10 = calculator.f::log10
    private val ln = calculator.f::ln
    private val sin = calculator.f::sin
    private val cos = calculator.f::cos
    private val tan = calculator.f::tan
    private val cot = calculator.f::cot
    private val sec = calculator.f::sec
    private val csc = calculator.f::csc

    private val PERIOD = 2 * Math.PI
    private val PERIOD_NUM = 200

    fun createSinCsv(xValues: List<Double>) {
        try {
            PrintWriter(File("src/test/resources/sin.csv")).use { writer ->
                for (x in xValues) {
                    writer.println("$x, ${sin(x)}")
                    val xWithPeriod = x + PI / 2;
                    writer.println("$xWithPeriod, ${sin(xWithPeriod)}")
                    val xWithPeriodNum = x - PERIOD * PERIOD_NUM;
                    writer.println("$xWithPeriodNum, ${sin(xWithPeriodNum)}")
                    val xWithPeriodNumAndPeriod = x - PERIOD * PERIOD_NUM + PI / 2;
                    writer.println("$xWithPeriodNumAndPeriod, ${sin(xWithPeriodNumAndPeriod)}")
                }
            }
        } catch (e: FileNotFoundException) {
            e.printStackTrace()
        }
    }

    fun createLog2Csv(xValues: List<Double>) {
        try {
            PrintWriter(File("src/test/resources/log2.csv")).use { writer ->
                for (x in xValues) {
                    writer.println("$x, ${log2(x)}")
                }
            }
        } catch (e: FileNotFoundException) {
            e.printStackTrace()
        }
    }


    fun createLog3Csv(xValues: List<Double>) {
        try {
            PrintWriter(File("src/test/resources/log3.csv")).use { writer ->
                for (x in xValues) {
                    writer.println("$x, ${log3(x)}")
                }
            }
        } catch (e: FileNotFoundException) {
            e.printStackTrace()
        }
    }

    fun createLog10Csv(xValues: List<Double>) {
        try {
            PrintWriter(File("src/test/resources/log10.csv")).use { writer ->
                for (x in xValues) {
                    writer.println("$x, ${log10(x)}")
                }
            }
        } catch (e: FileNotFoundException) {
            e.printStackTrace()
        }
    }

    fun createLnCsv(xValues: List<Double>) {
        try {
            PrintWriter(File("src/test/resources/ln.csv")).use { writer ->
                for (x in xValues) {
                    writer.println("$x, ${ln(x)}")
                }
            }
        } catch (e: FileNotFoundException) {
            e.printStackTrace()
        }
    }

    fun createCosCsv(xValues: List<Double>) {
        try {
            PrintWriter(File("src/test/resources/cos.csv")).use { writer ->
                for (x in xValues) {
                    writer.println("$x, ${cos(x)}")
                    val xWithPeriod = x + PERIOD;
                    writer.println("$xWithPeriod, ${cos(xWithPeriod)}")
                    val xWithPeriodNum = x - PERIOD * PERIOD_NUM;
                    writer.println("$xWithPeriodNum, ${cos(xWithPeriodNum)}")
                    val xWithPeriodNumAndPeriod = x - PERIOD * PERIOD_NUM + PI / 2;
                    writer.println("$xWithPeriodNumAndPeriod, ${cos(xWithPeriodNumAndPeriod)}")
                }
            }
        } catch (e: FileNotFoundException) {
            e.printStackTrace()
        }
    }

    fun createTanCsv(xValues: List<Double>) {
        try {
            PrintWriter(File("src/test/resources/tan.csv")).use { writer ->
                for (x in xValues) {
                    writer.println("$x, ${tan(x)}")
                    val xWithPeriod = x + PERIOD;
                    writer.println("$xWithPeriod, ${tan(xWithPeriod)}")
                    val xWithPeriodNum = x - PERIOD * PERIOD_NUM;
                    writer.println("$xWithPeriodNum, ${tan(xWithPeriodNum)}")
                    val xWithPeriodNumAndPeriod = x - PERIOD * PERIOD_NUM + PI / 2;
                    writer.println("$xWithPeriodNumAndPeriod, ${tan(xWithPeriodNumAndPeriod)}")
                }
            }
        } catch (e: FileNotFoundException) {
            e.printStackTrace()
        }
    }

    fun createCotCsv(xValues: List<Double>) {
        try {
            PrintWriter(File("src/test/resources/cot.csv")).use { writer ->
                for (x in xValues) {
                    writer.println("$x, ${cot(x)}")
                    val xWithPeriod = x + PERIOD;
                    writer.println("$xWithPeriod, ${cot(xWithPeriod)}")
                    val xWithPeriodNum = x - PERIOD * PERIOD_NUM;
                    writer.println("$xWithPeriodNum, ${cot(xWithPeriodNum)}")
                    val xWithPeriodNumAndPeriod = x - PERIOD * PERIOD_NUM + PI / 2;
                    writer.println("$xWithPeriodNumAndPeriod, ${cot(xWithPeriodNumAndPeriod)}")
                }
            }
        } catch (e: FileNotFoundException) {
            e.printStackTrace()
        }
    }

    fun createSecCsv(xValues: List<Double>) {
        try {
            PrintWriter(File("src/test/resources/sec.csv")).use { writer ->
                for (x in xValues) {
                    writer.println("$x, ${sec(x)}")
                    val xWithPeriod = x + PERIOD;
                    writer.println("$xWithPeriod, ${sec(xWithPeriod)}")
                    val xWithPeriodNum = x - PERIOD * PERIOD_NUM;
                    writer.println("$xWithPeriodNum, ${sec(xWithPeriodNum)}")
                    val xWithPeriodNumAndPeriod = x - PERIOD * PERIOD_NUM + PI / 2;
                    writer.println("$xWithPeriodNumAndPeriod, ${sec(xWithPeriodNumAndPeriod)}")
                }
            }
        } catch (e: FileNotFoundException) {
            e.printStackTrace()
        }
    }

    fun createCscCsv(xValues: List<Double>) {
        try {
            PrintWriter(File("src/test/resources/csc.csv")).use { writer ->
                for (x in xValues) {
                    writer.println("$x, ${csc(x)}")
                    val xWithPeriod = x + PERIOD;
                    writer.println("$xWithPeriod, ${csc(xWithPeriod)}")
                    val xWithPeriodNum = x - PERIOD * PERIOD_NUM;
                    writer.println("$xWithPeriodNum, ${csc(xWithPeriodNum)}")
                    val xWithPeriodNumAndPeriod = x - PERIOD * PERIOD_NUM + PI / 2;
                    writer.println("$xWithPeriodNumAndPeriod, ${csc(xWithPeriodNumAndPeriod)}")
                }
            }
        } catch (e: FileNotFoundException) {
            e.printStackTrace()
        }
    }

}

fun main() {
    val lst = listOf(
        2.0,
        3.0,
        10.0,
        -3.76309999999999,
        -1.571,
        -44.709579012060615,
        -5.913,
        -16.575791201423968,
        -40.85448161128262,
        -23.654025410872137,
        -96.15609399777273,
        -3.763099999999999,
        -62.64111839435503,
        -83.63140037147643,
        -0.8867,
        -13.967126888204206,
        -1.9999999999995866,
        -4.7124,
        -42.65946086963063,
        -3.529,
        -60.77153431827534,
        -5.771033540968432,
        -47.20305358212036,
        -78.44220220246164,
        -27.86036822896014,
        -56.011662071992085,
        -9.33697496057539,
        -5.724,
        -3.14011,
        -74.67388110604549,
        -98.97517933437508,
        -71.00935809846433,
        -75.75130871413687,
        -78.4768766159879,
        -24.62991650009137,
        0.0
    )

    Utilities(System()).createSinCsv(lst)
    Utilities(System()).createCosCsv(lst)
    Utilities(System()).createTanCsv(lst)
    Utilities(System()).createCotCsv(lst)
    Utilities(System()).createSecCsv(lst)
    Utilities(System()).createCscCsv(lst)


    val lstLog = listOf(2.0, 3.0, 10.0, 1e-6, 0.02, 215.3380200004247)

    Utilities(System()).createLog10Csv(lstLog)
    Utilities(System()).createLnCsv(lstLog)
    Utilities(System()).createLog2Csv(lstLog)
    Utilities(System()).createLog3Csv(lstLog)

}