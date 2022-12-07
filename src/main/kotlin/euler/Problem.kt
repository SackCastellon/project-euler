package euler

/**
 * Represents a problem from the [Project Euler](https://projecteuler.net)
 */
interface Problem<out R : Any> {
    /**
     * Solve problem
     */
    fun solve(): R
}
