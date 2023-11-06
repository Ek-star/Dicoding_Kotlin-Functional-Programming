fun main() {
    val dicoding = 1..10
    println(dicoding.take(3))
    // Output: [1, 2, 3]

    // Jika cara manual menggunakan looping dan If statement:
    for (i in dicoding) {
        if (i < 4) {
            print("$i ")
        }
    }
}