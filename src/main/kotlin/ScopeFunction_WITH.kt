fun main() {
    // With pada dasarnya bukanlah sebuah extension melainkan hanyalah fungsi biasa. Konteks objeknya disematkan sebagai argumen dan dari blok lambda diakses sebagai receiver

    val message = "Hello Kotlin!"
    val result = with(message) {
        print("Value is $this")
        println(" With length ${this.length}")
    }
}