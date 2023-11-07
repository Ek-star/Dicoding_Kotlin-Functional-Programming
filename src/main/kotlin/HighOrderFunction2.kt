fun main() {
    printResult(10, sum)
    printResult2(10){ value ->
        value + value
    }

    // Konsep ini dinamakan sebagai Higher-Order Function, yaitu sebuah fungsi yang menggunakan fungsi lainnya sebagai parameter, menjadikan tipe kembalian, ataupun keduanya. Yang perlu diperhatikan adalah, jika argumen terakhir dari fungsi merupakan sebuah lambda expression, maka lambda expression tersebut ditempatkan di luar parenthesis seperti pada contoh kode di atas.


    penjumlahanDuaBilangan(34 , 66) { value1 , value2 ->
        value1 + value2
    }

    penggabunganKalimatDasar("Ekalma" , "Ilmu Komputer") {kalimat1 , kalimat2 ->
        "Perkenalkan nama saya adalah $kalimat1 dan saya berasal dari prodi $kalimat2"
    }
}

private fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}

private var sum: (Int) -> Int = { value ->
    value + value
}

private fun printResult2(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}

private fun penjumlahanDuaBilangan(value1: Int , value2: Int, sum: (Int , Int) -> Int) {
    val result = sum(value1 , value2)
    println(result)
}

private fun penggabunganKalimatDasar(kalimatSatu: String, kalimatDua: String, gabung: (String , String) -> String) {
    val result = gabung(kalimatSatu, kalimatDua)
    println(result)
}
