package messagePredicate

import interpreter.Runner
import interpreter.engine.ConditionScriptEngine
import interpreter.entity.PredicateMessage
import interpreter.runnerValues.LoadMessageFunctions
import interpreter.runnerValues.MessageProvider
import mock.correctMessage
import mock.incorrectMessage
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class RunnerTest {
    lateinit var runner: Runner

    @BeforeEach
    fun setUp() {
        runner = Runner(
            ConditionScriptEngine(
                LoadMessageFunctions(MessageProvider {
                    listOf(
                        PredicateMessage(incorrectMessage),
                        PredicateMessage(correctMessage)
                    )
                }).functions
            )
        )
    }

    @Test
    fun runCode() {
        println(
            runner.runCode(
                "message whereId \"3\" and message.anyCorrect()"
            )
        )
    }
}