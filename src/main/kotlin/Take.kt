fun main() {
    // Jika fungsi drop() digunakan untuk memangkas, fungsi take() bisa kita manfaatkan untuk menyaring item yang berada di dalam sebuah objek collection. Pemanggilan fungsi take() sama halnya seperti fungsi drop() di mana kita perlu menentukan jumlah item yang akan disaring. Berikut contoh penggunaannya:

    val total = listOf(1, 2, 3, 4, 5, 6)
    val take = total.take(3)

    println(take)

    // Kotlin juga menyediakan fungsi seperti dropLast() yang menjalankan operasi dari posisi atau indeks terakhir yaitu takeLast(). Contohnya seperti berikut:

    val take2 = total.takeLast(3)
    println(take2)
}