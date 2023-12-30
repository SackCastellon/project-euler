package euler


/**
 * [#10 Summation of Primes - Project Euler](https://projecteuler.net/problem=10)
 */
object Problem10 : Problem<Long> {
    override fun solve(): Long = sieveOfEratosthenes(2_000_000).sumOf(Int::toLong)

    private fun sieveOfEratosthenes(n: Int): List<Int> {
        val prime = BooleanArray(n + 1) { true }
        var p = 2
        while (p * p <= n) {
            if (prime[p]) {
                var i = p * 2
                while (i <= n) {
                    prime[i] = false
                    i += p
                }
            }
            p++
        }

        return prime.asIterable().mapIndexedNotNull { index, flag -> index.takeIf { flag } }.dropWhile { it < 2 }
    }
}
