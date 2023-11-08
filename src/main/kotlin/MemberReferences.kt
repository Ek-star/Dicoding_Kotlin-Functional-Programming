private var message = "Kotlin"
fun main() {
    val numbers = 1.rangeTo(10)
    val evenNumbers = numbers.filter(::isEvenNumber)
    val oddNumbers = numbers.filter(::isOddNumber)

    println(evenNumbers)
    println(oddNumbers)

    println(::message.name)
    println(::message.get())

    ::message.set("Kotlin Academy")
    ::message.set("Ekalma Sedang belajar Kotlin Dasar")

    println(::message.get())
}

private fun isEvenNumber(number: Int) = number % 2 == 0

private fun isOddNumber(number: Int) = number % 2 == 1