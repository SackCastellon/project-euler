package euler

/**
 * [#9 Special Pythagorean Triplet - Project Euler](https://projecteuler.net/problem=9)
 */
object Problem9 : Problem<Int> {
    override fun solve(): Int = (1..1000).asSequence()
        .flatMap { m ->
            (1..<m).map { n ->
                val a = m * m - n * n
                val b = 2 * m * n
                val c = m * m + n * n
                Triple(a, b, c)
            }
        }
        .first { (a, b, c) -> a + b + c == 1000 }
        .let { (a, b, c) -> a * b * c }
}
