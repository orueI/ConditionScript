package interpreter.engine

@JvmInline
value class ValuePath(private val _path: String) {
    val path get() = _path.lowercase()
}