package euler

import org.junit.jupiter.api.DynamicNode
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory

internal class ProblemTest {
    private val testCases: List<TestCase<*>> = listOf(
        TestCase(Problem1, answer = 233168),
        TestCase(Problem2, answer = 4613732),
        TestCase(Problem3, answer = 6857),
        TestCase(Problem4, answer = 906609),
        TestCase(Problem5, answer = 232792560),
    )

    @TestFactory
    internal fun problems(): List<DynamicNode> = testCases.map { testCase ->
        DynamicTest.dynamicTest("Problem ${testCase.number}", testCase::test)
    }
}
