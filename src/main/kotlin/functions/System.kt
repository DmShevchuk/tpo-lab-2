package functions

import Functions
import kotlin.math.pow

open class System(val f: Functions = Functions()) {
    private val log2 = f::log2
    private val log3 = f::log3
    private val log10 = f::log10
    private val ln = f::ln
    private val sin = f::sin
    private val cos = f::cos
    private val tan = f::tan
    private val cot = f::cot
    private val sec = f::sec
    private val csc = f::csc

    fun calculate(x: Double) =
        if (x <= 0) ((((((((((((((((cos(x).pow(2)) + (sec(x) / sin(x))) / cos(x)).pow(2)) - csc(x)) + cos(x)) / sec(x)) - cot(x)) + cos(x)) + csc(x)) - (((((cot(x) + (cot(x) / sec(x))) / (cot(x) - (cos(x) - sin(x)))).pow(3)) + ((tan(x) - csc(x)) / ((tan(x) / (sec(x).pow(2))) * (csc(x).pow(3))))) + sin(x))) + ((sin(x) * sin(x)) / cot(x))) / sin(x)) / ((cos(x).pow(3)) / ((((sin(x) / (((sin(x) + (csc(x) + csc(x))) / cot(x)).pow(3))) - (sec(x) - sin(x))) + (((sec(x) * sec(x)).pow(2)) * sin(x))) * (tan(x) - (cos(x) * (((sin(x) * cos(x)).pow(3)) / csc(x))))))) + cos(x)) / ((((((tan(x) + (tan(x) * cos(x))).pow(2)) / csc(x)) - cos(x)) / ((sec(x) - (sin(x).pow(2))) - sin(x))) - (((cos(x) - csc(x)) * ((((((sec(x) - tan(x)) + sec(x)).pow(2)) * ((tan(x) - tan(x)) * (tan(x).pow(2)))) / csc(x)).pow(2))) - ((sec(x).pow(3)).pow(3)))))
        else (((((log2(x) * ln(x)) * (log10(x) / log3(x))).pow(3)) * (ln(x) * log3(x))) * (log2(x) - ((log10(x).pow(3)) - log2(x))))

}