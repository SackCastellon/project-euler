package euler

import java.math.BigInteger

/**
 * [#20 Factorial Digit Sum - Project Euler](https://projecteuler.net/problem=20)
 */
object Problem20 : Problem<Int> {
    override fun solve(): Int = factorial(100).toString(10).sumOf { it.digitToInt() }

    private fun factorial(n: Int): BigInteger = (1..n).asSequence().map(Int::toBigInteger).reduce(BigInteger::times)
}
