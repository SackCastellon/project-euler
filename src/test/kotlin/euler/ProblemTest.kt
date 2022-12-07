package euler

import org.junit.jupiter.api.DynamicNode
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory

internal class ProblemTest {
    private val testCases: List<TestCase<*>> = listOf(
        TestCase(Problem1, answer = 233168),
    )

    @TestFactory
    internal fun problems(): List<DynamicNode> = testCases.map { testCase ->
        DynamicTest.dynamicTest("Problem ${testCase.number}", testCase::test)
    }
}
