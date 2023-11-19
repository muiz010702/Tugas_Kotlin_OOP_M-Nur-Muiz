package Exercise4

fun main() {
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    var Nilai = arrayOf("Kucing","kelinci","anjing","Kuda","Ikan")
    var array = Nilai
    try {
        var index = 3
        println("Index ke $index adalah hewan ${array[index]}")
    } catch (e: ArrayIndexOutOfBoundsException){
        println("index yang anda masukan tidak valid")
    } finally {
        println("Program berhasil dijalankan")
    }

}

