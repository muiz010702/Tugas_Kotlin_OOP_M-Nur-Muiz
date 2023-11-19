package Exercise2

import kotlin.coroutines.ContinuationInterceptor

fun main() {
    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */
    // Buat di bawah sini
    println("=====lATIHAN1=====")
    var Genap = mutableListOf<Int>()
   for (B in 0..100){
       if (B % 2 == 0){
           Genap.add(B)
       }
   }
    for (Bilangan in Genap){
        print(" $Bilangan")
    }
    println(" ")
    println(" ")

    /** Latihan 2 Map
    Buatlah variabel bertipe Map dengan kriteria:
    Daftar nama bulan dalam setahun,
    - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
    - key "Jan", value January
    - key "Feb", value February
    - dst...
    // Buat di bawah sini*/
    println("=====LATIHAN2=====")
    var Bulan = mapOf(
        "Jan" to  "January",
        "Feb" to  "February",
        "Mar" to  "March",
        "Apr" to  "April",
        "Mei" to  "May",
        "Jun" to  "June",
        "Jul" to  "July",
        "Aug" to  "August",
        "Sep" to  "September",
        "Okt" to  "Oktober",
        "Nov" to  "November",
        "Des" to  "December",
    )

    /**
    Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
    - Jan -> January
    - Feb -> February
    - Dst...
    // Buat di bawah sini
    */
    Bulan.forEach{
        (Key, Value) ->
        println("$Key -> $Value")
    }

    /**
    Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
    - "It's {$monthNow} now, I was born in {$birthMonth}"
     */
    // Buat di bawah sini
    println(" ")
    println("=====LATIHAN3======")
    var NowMonth: String = "November"
    var BirthMonth: String = "Juli"

    println("It's $NowMonth now, I was born in $BirthMonth")

}