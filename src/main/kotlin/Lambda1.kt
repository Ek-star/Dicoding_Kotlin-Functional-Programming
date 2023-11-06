fun main() {
    // Dalam menggunakan lambda, kita tidak perlu mendeklarasikan tipe spesifik untuk nilai kembaliannya. Tipe tersebut akan ditentukan oleh kompiler secara otomatis
    // Walaupun merupakan sebuah fungsi, lambda tidak emmbutuhkan kata kunci "fun" dan visibility modifier saat dideklarasikan, karena lambda bersifat anonymous
    // Parameter yang akan ditetapkan berada di dalam kurung kurawal
    // Ketika ingin mengembalikan nilai. kata kunci "return" tidak diperlukan lagi karena kompiler akan secara otomatis mengembalikan nilai dari dalam body
    // Lambda expression dapat digunakan sebagai argumen untuk sebuah parameter dan dapat disimpan ke dalam sebuah variabel

    // Cara mengembalikan Nilai
    println(name1())
    println(name2("Academy"))
}

// Lambda tidak mempunyai parameter
private val name1 = {
    val first = "Dicoding"
    val last = "Academy"

    "$first $last"
}

// Lambda mempunyai parameter
private val name2: (String) -> String = { value ->
    val first = "Dicoding"

    "$first $value"
}