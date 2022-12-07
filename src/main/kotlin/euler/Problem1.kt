package euler

/**
 * [#1 Multiples of 3 or 5 - Project Euler](https://projecteuler.net/problem=1)
 */
object Problem1 : Problem<Int> {
    override fun solve(): Int = sequence {
        yieldAll(3.multiples().takeWhile { it < 1000 })
        yieldAll(5.multiples().takeWhile { it < 1000 })
    }.distinct().sum()

    private fun Int.multiples() = generateSequence(this) { it + this }
}
