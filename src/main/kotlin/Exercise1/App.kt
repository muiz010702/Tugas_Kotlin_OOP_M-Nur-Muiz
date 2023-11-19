package Exercise1

fun main() {
    // Latihan 1
    fun myProfile() {
        var FirstName: String = "Muhammad Nur"
        var LastName: String = "Muiz"
        var Age: Int = 21
        var Status: Boolean = false

        println("Nama depan saya adalah $FirstName")
        println("Nama belakang saya adalah $LastName")
        println("Umur saya adalah $Age tahun")
        println("Status saya adalah ${if (Status) "Single" else "Tidak single"}")
    }

    myProfile()

    // Latihan 2
    fun groupDetail(groupId: String, groupMember: List<String>, session: String) {
        println("=====Anggota Group Saya=====")
        println("Group ID = $groupId")
        println("Anggota Group = $groupMember")
        println("Sesi = $session")
    }

    var groupId = "G7"
    var groupMember = listOf("Zakki", "Andini", "Abi", "Aldy", "Muiz", "Diva", "Yuda", "Nur", "Sadam", "Midil", "Aras")
    var session = "Morning"

    groupDetail(groupId, groupMember, session)

    // Latihan 3
    fun myTeam(): String {
        var CollaboraCrew = listOf("Zakki", "Andini", "Abi", "Aldy", "Muiz", "Diva", "Yuda", "Nur", "Sadam", "Midil", "Aras")
        return CollaboraCrew[4]
    }

    val myTeamName = myTeam()
    println("Nama saya adalah: $myTeamName")

    // Latihan 4
    fun totalMember(): Int {
        val mentor = arrayOf<String>("Raihan", "Fateh")
        val AnggotaGroup = arrayOf<String>("Zakki", "Andini", "Abi", "Aldy", "Muiz", "Diva", "Yuda", "Nur", "Sadam", "Midil", "Aras")

        var TotalMentor = mentor.size
        var TotalAnggotaGroup = AnggotaGroup.size

        var Total = TotalMentor + TotalAnggotaGroup

        return Total
    }

    val total = totalMember()
    println("Totalnya berjumlah $total orang")

    // Latihan 5
    groupDetail("G7", groupMember, "Morning")
}


