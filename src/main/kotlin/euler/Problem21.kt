package euler

/**
 * [#21 Amicable Numbers - Project Euler](https://projecteuler.net/problem=21)
 */
object Problem21 : Problem<Int> {
    override fun solve(): Int {
        val amicableNumbers = hashSetOf<Int>()
        for (n in 2..<10000) {
            if (n in amicableNumbers) continue

            val sum = d(n)
            if (sum != n && d(sum) == n) {
                amicableNumbers.add(n)
                amicableNumbers.add(sum)
            }
        }

        return amicableNumbers.sum()
    }

    /**
     * Returns the sum of the proper divisors of [n], including `1`, but not `n` itself.
     */
    private fun d(n: Int): Int =
        (2..<n / 2).flatMap { if (n % it == 0) listOf(it, n / it) else emptyList() }.distinct().sum() + 1
}
