package euler

/**
 * [#23 Non-Abundant Sums - Project Euler](https://projecteuler.net/problem=23)
 */
object Problem23 : Problem<Int> {
    private const val LIMIT = 28123

    override fun solve(): Int {
        val abundantNumbers = (12..LIMIT).asSequence().filter { d(it) > it }.toSet()
        return (1..LIMIT).asSequence().filterNot { n -> abundantNumbers.any { (n - it) in abundantNumbers } }.sum()
    }

    /**
     * Returns the sum of the proper divisors of [n], including `1`, but not `n` itself.
     */
    private fun d(n: Int): Int =
        (2..<n / 2).flatMap { if (n % it == 0) listOf(it, n / it) else emptyList() }.distinct().sum() + 1
}
