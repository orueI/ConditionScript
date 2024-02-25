package interpreter

import interpreter.entity.Token
import interpreter.entity.TokenType

fun String.tokenize() = TokenType.entriesToRegex().toRegex()
    .findAll(this.lowercase())
    .map { it.value }
    .map { Token(it, TokenType.getTokenType(it)) }
