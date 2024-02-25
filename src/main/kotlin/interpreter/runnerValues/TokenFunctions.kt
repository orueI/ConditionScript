package interpreter.runnerValues

import interpreter.entity.FunctionalType2
import interpreter.entity.TokenType

val tokenFunctions = listOf(
    TokenType.Equal.expression!! to FunctionalType2 { arg0: Any, arg1: Any -> (arg0 == arg1) },
    TokenType.More.expression!! to FunctionalType2 { arg0: Int, arg1: Int -> (arg0 > arg1) },
    TokenType.Less.expression!! to FunctionalType2 { arg0: Int, arg1: Int -> (arg0 < arg1) },

    TokenType.And.expression!! to FunctionalType2 { arg0: Boolean, arg1: Boolean -> (arg0 && arg1) },
    TokenType.Or.expression!! to FunctionalType2 { arg0: Boolean, arg1: Boolean -> (arg0 || arg1) },
)
