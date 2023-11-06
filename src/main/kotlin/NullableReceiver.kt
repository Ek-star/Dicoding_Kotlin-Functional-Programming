fun main() {
    val value: Int? = null
    println(value.slice)
}

private val Int?.slice: Int
    get() = if (this == null) 0 else this.div(2)