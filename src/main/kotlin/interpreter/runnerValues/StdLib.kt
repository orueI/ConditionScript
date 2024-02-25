package interpreter.runnerValues

import interpreter.entity.FunctionalType1
import interpreter.entity.PredicateMessage
import messagePredicate.allCorrect

val stdLibValues = listOf(
    "message\\w*.allCorrect" to FunctionalType1 { message: PredicateMessage -> message.allCorrect() },
    "message\\w*.anyCorrect" to FunctionalType1 { message: PredicateMessage -> message.options.any { it.isCorrected == it.isSelected } },
)