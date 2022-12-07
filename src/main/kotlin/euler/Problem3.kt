package euler

/**
 * [#3 Largest prime factor - Project Euler](https://projecteuler.net/problem=3)
 */
object Problem3 : Problem<Long> {
    override fun solve(): Long = 600_851_475_143.largestPrimeFactor()

    private fun Long.largestPrimeFactor(): Long {
        var number = this
        var factor = 2L

        while (number % factor == 0L) number /= factor
        factor = 1
        while (factor <= number) {
            factor += 2
            while (number % factor == 0L) number /= factor
        }

        return factor
    }
}
