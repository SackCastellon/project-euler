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
        TestCase(Problem10, answer = 142913828922),
        TestCase(Problem13, answer = "5537376230"),
        TestCase(Problem14, answer = 837799),
        TestCase(Problem16, answer = 1366),
        TestCase(Problem20, answer = 648),
        TestCase(Problem21, answer = 31626),
        TestCase(Problem22, answer = 871198282),
        TestCase(Problem23, answer = 4179871),
        TestCase(Problem24, answer = 2783915460),
    )

    @TestFactory
    internal fun problems(): List<DynamicNode> = testCases.map { testCase ->
        DynamicTest.dynamicTest("Problem ${testCase.number}", testCase::test)
    }
}
