fun main() {
    10.printInt()
    val dicoding = "Dicoding".firstAndLast()
    val first = dicoding["first"]
    val last = dicoding["last"]
    println(first)
    println(last)
}

private fun Int.printInt() {
    println("Value $this")
}

private fun String.firstAndLast(): Map<String, Char> {
    return mapOf(
        "first" to first(),
        "last" to last()
    )
}