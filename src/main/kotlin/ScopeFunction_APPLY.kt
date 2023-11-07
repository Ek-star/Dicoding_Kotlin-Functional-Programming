import kotlin.text.StringBuilder

fun main() {
    // Berbeda dengan fungsi-fungsi sebelumnya, nilai yang akan dikembalikan dari fungsi apply adalah nilai dari konteks objeknya dan objek konteksnya tersedia sebagai receiver (this). Baiknya fungsi apply dapat melakukan inisialisasi atau konfigurasi dari receiver-nya

    val builder = StringBuilder()
    builder.append("Hello ")
    builder.append("Kotlin!")

    println(builder.toString())

    val message = StringBuilder().apply {
        append("Hello ")
        append("Kotlin!")
    }
    println(message)
}