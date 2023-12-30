package euler.utils

/**
 * Returns the sum of the proper divisors of [n], including `1`, but not `n` itself.
 */
fun sumOfProperDivisors(n: Int): Int =
    (2..<n / 2).flatMap { if (n % it == 0) listOf(it, n / it) else emptyList() }.distinct().sum() + 1

/**
 * An abundant number is lesser than the sum of its proper divisors
 * @see sumOfProperDivisors
 */
fun Int.isAbundant(): Boolean = sumOfProperDivisors(this) > this
