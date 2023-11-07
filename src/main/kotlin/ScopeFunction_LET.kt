fun main() {
    // Fungsi let menggunakan argumen (it) untuk mengakses konteks dari sebuah objek. Penggunaan fungsi let akan banyak kita temukan pada objek yang bertipe nullable. Contohnya seperti di bawah ini:

//    val message: String? = null
//    message?.let {
//        val length = it.length * 2
//        val text = "Text length $length"
//        println(text)
//    }

    val message2: String? = null
    val length = message2?.length ?: 0 * 2
    val text = "text length $length"
    println(text)
}