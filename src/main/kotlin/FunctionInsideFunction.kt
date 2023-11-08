fun main() {
    setWord("Ekalma")
    println(sum(2 , 1 , 4))
}

// Contoh dari sebuah Inner Function
private fun setWord(message: String) {
    fun printMessage(text: String) {
        println(text)
    }
    printMessage(message)
}

private fun sum(valueA: Int, valueB: Int, valueC: Int): Int {
    fun validateNumber(value: Int) {
        if (value == 0) {
            throw IllegalArgumentException("value must be better than 0")
        }
    }

    validateNumber(valueA)
    validateNumber(valueB)
    validateNumber(valueC)

    return valueA + valueB + valueC
}