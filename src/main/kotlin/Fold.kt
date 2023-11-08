fun main() {
    // Kita bisa dengan mudah melakukan perhitungan setiap nilai yang berada di dalam sebuah collection tanpa harus melakukan iterasi item tersebut satu-persatu menggunakan fungsi fold(). Untuk contoh penggunaannya adalah sebagai berikut:

    val numbers = listOf(1, 2, 3)
    val fold = numbers.fold(10) { current, item ->
        println("current $current")
        println("item $item")
        println()
        current + item
    }

    println("Fold result: $fold")

    /*
      output:
         current 10
         item 1

         current 11
         item 2

         current 13
         item 3

         Fold result: 16
   */
}
