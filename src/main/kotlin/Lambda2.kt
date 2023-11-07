fun main() {
    // Sebelum mempelajarinya lebih dalam, ada baiknya jika kita tahu beberapa karakteristik dari lambda berikut:

    // 1. Dalam menggunakan lambda, kita tidak perlu mendeklarasi tipe spesifik untuk nilai kembaliannya. Tipe tersebut akan ditentukan oleh kompiler secara otomatis.

    // 2. Walaupun merupakan sebuah fungsi, lambda tidak membutuhkan kata kunci fun dan visibility modifier saat dideklarasikan, karena lambda bersifat anonymous.

    // 3. Parameter yang akan ditetapkan berada di dalam kurung kurawal.

    // 4. Ketika ingin mengembalikan nilai, kata kunci return tidak diperlukan lagi karena kompiler akan secara otomatis mengembalikan nilai dari dalam body.

    // 5. Lambda expression dapat digunakan sebagai argumen untuk sebuah parameter dan dapat disimpan ke dalam sebuah variabel.

    // Cara memanggil Fungsi Lambda
    message()
    printMessage("Hello From Lambda")

    val length = messageLength("Hello From Lambda")
    println("Message length $length")
    val result = penjumlahanDuaBilangan(4 , 2)
    println(result)
}

private val message = {
    println("Hello From Lambda")
}

private val printMessage = {
    message: String -> println(message)
}

private val messageLength = {
    message: String -> message.length
}

private val penjumlahanDuaBilangan = {
    value1: Int , value2: Int ->
        val konstan = 10
        (value1 + value2) * konstan
}