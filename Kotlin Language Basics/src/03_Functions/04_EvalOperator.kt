package `03_Functions`

fun main() {

    val name="BalajiKrishnan"

    name.let { it -> println(it.length) }


    println("Welcome TO Kotlin")

    // elvisOperator ?:

    var username:String?=null

    val userName=username?:"Guest".uppercase()
    println(userName)
    println(userName!!.lowercase())



}