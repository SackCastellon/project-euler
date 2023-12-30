package euler

import java.math.BigInteger.TWO

/**
 * [#16 Power Digit Sum - Project Euler](https://projecteuler.net/problem=16)
 */
object Problem16 : Problem<Int> {
    override fun solve(): Int = TWO.pow(1000).toString(10).sumOf(Char::digitToInt)
}
