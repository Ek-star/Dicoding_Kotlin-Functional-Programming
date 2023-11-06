fun main() {
    // Kita bisa menambahkan sebuah fungsi baru pada sebuah kelas tanpa harus mewarisi kelas tersebut.

    // Untuk mendeklarasikan sebuah extension functions, kita perlu menentukan terlebih dahulu receiver type, kemudian nama dari fungsi tersebut yang mana keduanya dipisahkan oleh titik (.).

    10.printInt()
    println(10.plusThree())

    // Extension Properties
    //Kotlin juga mendukung extension untuk menambah sebuah properti baru pada sebuah kelas tanpa harus menyentuh kode di dalam kelas tersebut. Deklarasinya pun sama seperti extension functions. Kita terlebih dahulu menentukan receiver type kemudian nama dari properti tersebut.

    println(10.slice)

    // Yang perlu diketahui, extension tidak benar-benar mengubah sebuah kelas dengan menambahkan sebuah fungsi atau properti baru. Ini karena extension memiliki hubungan langsung dengan kelas yang ingin diperluas fungsionalitasnya. Sehingga extension properties hanya bisa dideklarasikan dengan cara menyediakan getter atau setter secara eksplisit.
}

private fun Int.printInt() {
    println("Value $this")
}

private fun Int.plusThree(): Int {
    return this + 3
}

private val Int.slice: Int
    get() = this / 2


