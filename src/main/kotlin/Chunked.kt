fun main() {
    val word = "QWERTY"
    val chunked = word.chunked(3)
    println(chunked)

    val chunkedTransform = word.chunked(3) {
        it.toString().toLowerCase()
    }
    println(chunkedTransform)
}