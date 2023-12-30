package euler

/**
 * [#24 Lexicographic Permutations - Project Euler](https://projecteuler.net/problem=24)
 */
object Problem24 : Problem<Long> {
    override fun solve(): Long {
        val digits = listOf('0', '1', '2', '3', '4', '5', '6', '7', '8', '9')
        return permutations(digits).sorted()[1_000_000 - 1].toLong()
    }

    private fun permutations(chars: List<Char>, string: String = ""): List<String> {
        if (chars.isEmpty()) return listOf(string)
        return chars.flatMap { char -> permutations(chars - char, char + string) }
    }
}
