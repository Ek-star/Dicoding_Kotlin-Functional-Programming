fun main() {
    // Fungsi run akan mengembalikan nilai berdasarkan expression yang berada di dalam blok lambda. Untuk mengakses konteks dari objek, ia akan menggunakan receiver (this). Fungsi run akan sangat berguna jika di dalam blok lambda terdapat inisialisasi objek dan perhitungan untuk nilai kembalian. Contoh penggunaannya seperti berikut:

    val text = "Hello"
    val result = text.run {
        val from = this
        val to = this.replace("Hello" , "Kotlin")
        "Replace text from $from to $to"
    }
    println("Result: $result")
}