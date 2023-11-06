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
private fun printName(value1: String, name: (String) -> String){
    println(name(value1))
}

private fun penjumlahanBilanganDenganDua(value2: Int, jumlah: (Int) -> Int) {
    println(jumlah(value2))
}

private fun printResult(value3: Int, sum: (Int) -> Int) {
    val result = sum(value3)
    println(result)
}

private val sum: (Int) -> Int = { value4 ->
    value4 + value4
}

