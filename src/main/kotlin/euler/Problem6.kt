package euler

/**
 * [#6 Sum square difference - Project Euler](https://projecteuler.net/problem=6)
 */
object Problem6 : Problem<Int> {
    override fun solve(): Int {
        val sumOfSquares = (1..100).sumOf { it * it }
        val sum = (1..100).sum()
        val squareOfSum = sum * sum
        return squareOfSum - sumOfSquares
    }
}
