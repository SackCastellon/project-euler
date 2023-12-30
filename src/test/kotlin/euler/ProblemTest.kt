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
        TestCase(Problem6, answer = 25164150),
        TestCase(Problem7, answer = 104743),
        TestCase(Problem8, answer = 23514624000),
        TestCase(Problem9, answer = 31875000),
    )

    @TestFactory
    internal fun problems(): List<DynamicNode> = testCases.map { testCase ->
        DynamicTest.dynamicTest("Problem ${testCase.number}", testCase::test)
    }
}
