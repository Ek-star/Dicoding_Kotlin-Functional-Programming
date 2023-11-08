fun main() {
    // Fungsi slice() membutuhkan sebuah argumen berupa Range yang digunakan untuk menentukan posisi pertama dan terakhir yang akan disaring. Berikut contohnya:

    val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slice = total.slice(3..6)

    println(slice)

    // Karena menggunakan Range, kita juga bisa menggunakan operator step ketika argumennya disematkan seperti berikut:

    val slice2 = total.slice(3..6 step 2)
    println(slice2)

    // Kemudian jika ingin menentukan posisi yang lebih spesifik, kita bisa mendefinisikannya di dalam sebuah collection, kemudian disematkan sebagai argumen. Misal seperti di bawah berikut:

    val index = listOf(2, 3, 5, 8)
    // val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slice3 = total.slice(index)
    println(slice3)
}