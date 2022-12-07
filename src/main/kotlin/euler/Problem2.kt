package euler

/**
 * [#2 Even Fibonacci numbers - Project Euler](https://projecteuler.net/problem=2)
 */
object Problem2 : Problem<Int> {
    override fun solve(): Int = fibonacciEven().takeWhile { it <= 4_000_000 }.sum()

    private fun fibonacciEven() = sequence {
        var a = 1
        var b = 1

        while (true) {
            val c = a + b
            yield(c)
            a = b + c
            b = c + a
        }
    }
}
