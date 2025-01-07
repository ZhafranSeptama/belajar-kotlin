import javax.print.attribute.SetOfIntegerSyntax

fun main() {

    var firstName: String = "Eko"
    var lastName: String = "Khannedy"

    var address: String = """
        >Jalan belum jadi, RT 01 RW 01,
        >Kabupaten SUbang,
        >Jawa barat,
        >Indonesia
        """.trimMargin(">")

    println(firstName)
    println(lastName)
    println(address)

    var fullName: String = "$firstName $lastName"
    println(fullName)

    var desc: String = "$fullName length = ${fullName.length}"
    println(desc)

    var desc1: String 
    desc1 = "halo yang lain"
    println(desc1)
    val num: Int = 1
    val num2: Int = 1
    if (num == num2)
    {
    desc1 = "hola"
    }
    println(desc1)

}