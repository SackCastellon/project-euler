package euler

import java.io.BufferedReader

/**
 * [#22 Names Scores - Project Euler](https://projecteuler.net/problem=22)
 */
object Problem22 : Problem<Int> {
    private const val CODE_OFFSET = 'A'.code - 1

    override fun solve(): Int = ClassLoader.getSystemClassLoader()
        .getResourceAsStream("euler/0022_names.txt")!!
        .bufferedReader()
        .use(BufferedReader::readText)
        .split(',')
        .map { it.removeSurrounding("\"") }
        .sorted()
        .map(::alphabeticalValue)
        .foldIndexed(0) { index, sum, value -> sum + ((index + 1) * value) }

    private fun alphabeticalValue(string: String): Int {
        val map = string.map { it.code - CODE_OFFSET }
        return map.sum()
    }
}
