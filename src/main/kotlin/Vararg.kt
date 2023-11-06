fun main() {
    // Kita bisa meyederhanakan beberapa parameter yang memiliki tipe data yang sama menjadi parameter tunggal

    // Peraturan pada Vararg Arguments
    // 1. Tidak diizinkan untuk memiliki 2 parameter yang bertanda "vararg"
    // 2. Posisi parameter yang ditandai dengan "vararg" sebaiknya berada pada posisi terakhir

    val number = sumNumbers(10 , 20 , 30 , 40)
    println(number)

    val number2 = getNumberSize(10 , 20 , 30 , 40 , 50)
    println(number2)

    // Vararg VS Array<T>
    
}

private fun sumNumbers(vararg number: Int): Int {
    return number.sum()
}

private fun <T> asList(vararg input: T): List<T> {
    val result = ArrayList<T>()
    for (item in input)
        result.add(item)
    return result
}

private fun getNumberSize(vararg number: Int): Int {
    return number.size
}