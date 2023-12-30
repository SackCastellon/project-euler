package euler

import java.math.BigInteger
import java.math.BigInteger.ONE
import java.math.BigInteger.TEN

/**
 * [#25 1000-digit Fibonacci Number - Project Euler](https://projecteuler.net/problem=25)
 */
object Problem25 : Problem<Int> {
    override fun solve(): Int = fibonacciSequence().indexOfFirst { it.digitCount() == 1000 } + 1

    private fun fibonacciSequence() = sequence {
        var a = ONE
        var b = ONE

        yield(a)
        yield(b)

        while (true) {
            val c = a + b
            yield(c)
            a = b
            b = c
        }
    }

    private fun BigInteger.digitCount(): Int {
        var length = 0
        var temp = ONE

        while (temp <= this) {
            length++
            temp *= TEN
        }

        return length
    }
}
