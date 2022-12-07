package euler

/**
 * [#4 Largest palindrome product - Project Euler](https://projecteuler.net/problem=4)
 */
object Problem4 : Problem<Int> {
    override fun solve(): Int {
        var largest = 0
        for (a in 999 downTo 100) {
            for (b in 999 downTo a) {
                val i = a * b
                if (i <= largest) break
                if (i.isPalindrome()) largest = i
            }
        }
        return largest
    }

    private fun Int.isPalindrome(): Boolean = this == this.reversed()

    private fun Int.reversed(): Int {
        var number = this
        var reversed = 0

        while (number != 0) {
            val digit = number % 10
            reversed = reversed * 10 + digit
            number /= 10
        }

        return reversed
    }
}
