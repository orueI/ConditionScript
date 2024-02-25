package interpreter.runnerValues

import MessageNotFoundException
import NotImplementedException
import interpreter.engine.ValuePath
import interpreter.entity.FunctionalType3
import interpreter.entity.PredicateMessage
import interpreter.entity.TokenType

fun interface MessageProvider {
    fun getMessages(): List<PredicateMessage>
}

class LoadMessageFunctions(provider: MessageProvider) {
    val functions = listOf(
        TokenType.Where.expression!! to FunctionalType3 { variable: ValuePath, fieldName: String, value: Any ->
            val message = provider.getMessages().firstOrNull {
                when (fieldName) {
                    "id" -> it.id == value
                    else -> throw NotImplementedException("Find by $fieldName not implemented")
                }
            } ?: throw MessageNotFoundException()

            saveValue(variable, message)
            true
        },
    )

}