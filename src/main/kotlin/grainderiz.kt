import java.math.BigInteger

fun main(args: Array<String>) {
    var grainderiz = BigInteger.valueOf(1);
    var n = 2

    println("Case 1 : $grainderiz")
    for (i in 2..64) {
        grainderiz = grainderiz.times(n.toBigInteger())
        println("Case $i : $grainderiz")
    }
}