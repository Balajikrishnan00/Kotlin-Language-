package `01_Variables and Types`

fun main() {

    // val immutable variable
    // var mutable variable

    val firstName="Balaji"
    val lastName="Krishnan"
    val fulName:String=firstName+lastName

    val Greet:String="Good Morning"

    var greet:String?=null

    println("Hello $fulName")
    println("Hello "+fulName)
    println("Hello "+firstName+lastName)

    println(greet)
    greet="Good Afternoon"
    println(greet)




}