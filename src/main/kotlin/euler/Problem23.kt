package euler

import euler.utils.isAbundant

/**
 * [#23 Non-Abundant Sums - Project Euler](https://projecteuler.net/problem=23)
 */
object Problem23 : Problem<Int> {
    private const val LIMIT = 28123

    override fun solve(): Int {
        val abundantNumbers = (12..LIMIT).asSequence().filter(Int::isAbundant).toSet()
        return (1..LIMIT).asSequence().filterNot { n -> abundantNumbers.any { (n - it) in abundantNumbers } }.sum()
    }
}
