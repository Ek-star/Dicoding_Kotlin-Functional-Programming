fun main() {
    val value1: Int? = null
    println(value1.slice)

    // Lalu kapan kita membutuhkannya? Tentunya jika kita mempunyai sebuah objek yang bernilai null. Saat kita tidak menetapkannya dengan nullable receiver type, maka kita perlu memeriksa apakah objek tersebut bernilai null atau tidak? Bisa juga dengan menggunakan operator safe call setiap kali extension tersebut dipanggil

    val value2: Int? = null
    val value3: Int? = null

    println(value2?.slice)
    println(value3?.slice)
}

private val Int?.slice: Int
    get() = if (this == null) 0 else this.div(2)