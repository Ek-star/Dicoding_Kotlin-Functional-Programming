fun main() {
    println(10.slice)
    val dicoding = "Dicoding".firstAndLast
    val first = dicoding["first"]
    val last = dicoding["last"]
    println(first)
    println(last)
}

private val Int.slice: Int
    get() = this / 2

private val String.firstAndLast: Map<String , Char>
    get() = mapOf(
        "first" to first(),
        "last" to last()
    )