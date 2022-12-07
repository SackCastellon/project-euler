package euler

import kotlin.math.max

/**
 * [#5 Smallest multiple - Project Euler](https://projecteuler.net/problem=5)
 */
object Problem5 : Problem<Int> {
    override fun solve(): Int {
        return (2..20)
            .flatMap { it.primeFactors().groupingBy { it }.eachCount().toList() }
            .fold(mutableMapOf<Int, Int>()) { acc, (k, v) -> acc.apply { merge(k, v, ::max) } }
            .flatMap { (k, v) -> List(v) { k } }
            .reduce(Int::times)
    }

    private fun Int.primeFactors() = sequence {
        var n = this@primeFactors

        while (n % 2 == 0) {
            yield(2)
            n /= 2
            if (n == 1) return@sequence
        }

        for (factor in (3..n step 2)) {
            while (n % factor == 0) {
                yield(factor)
                n /= factor
                if (n == 1) return@sequence
            }
        }
    }
}
