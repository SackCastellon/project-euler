package euler

import org.junit.jupiter.api.Assertions.assertEquals

internal data class TestCase<R : Any>(
    private val problem: Problem<R>,
    private val answer: R,
) {
    val number: Int by lazy { problem.javaClass.simpleName.removePrefix("Problem").toInt() }

    fun test() = assertEquals(answer, problem.solve())
}
