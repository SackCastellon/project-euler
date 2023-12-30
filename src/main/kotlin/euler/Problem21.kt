package euler

import euler.utils.sumOfProperDivisors

/**
 * [#21 Amicable Numbers - Project Euler](https://projecteuler.net/problem=21)
 */
object Problem21 : Problem<Int> {
    override fun solve(): Int {
        val amicableNumbers = hashSetOf<Int>()
        for (n in 2..<10000) {
            if (n in amicableNumbers) continue

            val sum = sumOfProperDivisors(n)
            if (sum != n && sumOfProperDivisors(sum) == n) {
                amicableNumbers.add(n)
                amicableNumbers.add(sum)
            }
        }

        return amicableNumbers.sum()
    }
}
