fun main() {
    println(buildString())
    val message = buildString2 {
        append("Hello ")
        append("from ")
        append("Lambda")
    }
    println(message)

    val text = "Hello"
    text.let {
        val message = "$it Kotlin"
        println(message)
    }
}

private fun buildString(): String {
    val stringBuilder = StringBuilder()
    stringBuilder.append("Hello ")
    stringBuilder.append("from ")
    stringBuilder.append("Lambda")
    return stringBuilder.toString()
}

private fun buildString2(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}