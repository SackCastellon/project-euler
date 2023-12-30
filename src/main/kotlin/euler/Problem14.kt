package euler

/**
 * [#14 Longest Collatz Sequence - Project Euler](https://projecteuler.net/problem=14)
 */
object Problem14 : Problem<Int> {
    override fun solve(): Int = (1..<1_000_000).maxBy(::collatzSequenceSize)

    private fun collatzSequenceSize(n: Int): Int {
        val cache: MutableMap<Long, Int> = hashMapOf(1L to 1)

        fun collatz(n: Long): Int = cache.getOrPut(n) {
            val n1 = if (n % 2 == 0L) n / 2 else 3 * n + 1
            collatz(n1) + 1
        }

        return collatz(n.toLong())
    }
}
