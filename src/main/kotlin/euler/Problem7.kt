package euler

/**
 * [#7 10001st prime - Project Euler](https://projecteuler.net/problem=7)
 */
object Problem7 : Problem<Int> {
    override fun solve(): Int = primes().drop(10000).first()

    private fun primes() = sequence {
        val cache = mutableListOf<Int>()

        for (n in 2..Int.MAX_VALUE) {
            if (cache.none { n % it == 0 }) {
                yield(n)
                cache.add(n)
            }
        }
    }
}
