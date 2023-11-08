fun main() {
    // Recursion merupakan sebuah teknik dasar dalam pemrograman yang bisa kita gunakan untuk menyederhanakan pemecahan masalah yang umumnya diselesaikan dengan cara yang kompleks. Di Kotlin, recursion disebut juga dengan recursive function.

    // Recursive function adalah sebuah mekanisme di mana sebuah fungsi digunakan dari dalam fungsi itu sendiri. Ini memungkinkan sebuah fungsi dapat berjalan beberapa kali. Setiap pemanggilannya bisa kita atur agar dapat mengembalikan nilai dan digunakan sebagai argumen untuk pemanggilan fungsi berikutnya serta mengembalikan nilai akhir berupa perhitungan nilai kembalian dari setiap pemanggilan fungsi tersebut.

    println("Factorial 9 is: ${factorial(9)}")
}

private fun factorial(n: Int): Int {
    return if (n == 1) {
        n
    } else {
        n * factorial(n - 1)
    }
}