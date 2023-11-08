data class Item(val key: String, val value: Any)
fun main(args: Array<String>) {
    val total = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5)
    val distinct = total.distinct()

    println(distinct)

    val items = listOf(
        Item("1", "Kotlin"),
        Item("2", "is"),
        Item("3", "Awesome"),
        Item("3", "as"),
        Item("3", "Programming"),
        Item("3", "Language")
    )

    val distinctItems = items.distinctBy { it.key }
    distinctItems.forEach {
        println("${it.key} with value ${it.value}")
    }

    /*
    output:
        1 with value Kotlin
        2 with value is
        3 with value Awesome
    */

    val text = listOf("A", "B", "CC", "DD", "EEE", "F", "GGGG")
    val distinct2 = text.distinctBy {
        it.length
    }

    println(distinct2)

    // Yang perlu diperhatikan, fungsi distinct() tidak dapat digunakan pada object Map Collection.
}