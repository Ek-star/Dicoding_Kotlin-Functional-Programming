fun main() {
    printName("Ekalma Toto Alloy Sembiring") { value ->
        val first = "Kotlin dipelajari Oleh"
        "$first $value"
    }

    penjumlahanBilanganDenganDua(8) {it ->
        it + 2
    }

    printResult(10, sum)
}
private fun printName(value: String, name: (String) -> String){
    println(name(value))
}

private fun penjumlahanBilanganDenganDua(value: Int, jumlah: (Int) -> Int) {
    println(jumlah(value))
}

private fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}

private val sum: (Int) -> Int = { value ->
    value + value
}

