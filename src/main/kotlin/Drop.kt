fun main() {
    // fungsi yang bisa kita manfaatkan untuk memangkas item yang berada di dalam sebuah objek collection berdasarkan jumlah yang kita tentukan. Sebagai contoh, saat kita mempunyai sebuah collection seperti berikut:

    val number = listOf(1, 2, 3, 4, 5, 6)
    val drop = number.drop(3)
    // Memangkas 3 item dari collection dari "Atas"

    println(drop)
}