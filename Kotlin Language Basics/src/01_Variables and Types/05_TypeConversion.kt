package `01_Variables and Types`

fun main() {
    var age:Int=24
    var age1=age.toString()
    println(age1)
    println(age1::class.java)

    var age2=age.toByte()
    println(age2)
    println(age2::class.java)

    var age3=age.toULong()
    println(age3)
    println(age3::class.java)

}