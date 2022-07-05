import java.math.BigInteger
import kotlin.math.pow

fun main(args: Array<String>) {
    var grainderiz = BigInteger.ZERO
    var total : BigInteger = BigInteger.ZERO


    for (i in 1..64) {
        grainderiz = BigInteger.TWO.pow(i-1)
        println("Case $i : $grainderiz")
        total += grainderiz
    }
    println("Nombre de grain de riz total : $total")
}