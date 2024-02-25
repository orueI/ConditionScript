package interpreter

import interpreter.engine.ConditionScriptEngine
import interpreter.engine.ValuePath

class Runner(
    private val engine: ConditionScriptEngine,
) {

    fun loadValue(valuePath: String, value: Any) {
        engine.saveValue(ValuePath(valuePath), value)
    }

    fun runCode(code: String) = code
        .tokenize()
        .toList()
        .also { println(it.map { it.value }) }
        .let(::shuntingYard)
        .also { println(it.map { it.value }) }
        .let(::buildAST)
        .let(engine::execute)
}


fun main() {
    val runner = Runner(ConditionScriptEngine())
    println(runner.runCode("true"))
}
