package `02_Control Flows`

fun main() {
    val age= readLine()!!.toInt()

    when(age){
        in 21..80 -> println("You may may drink in us")
        in 18..20 -> println("you may vote")
        in 16..17 -> println("You may drive")
        in 1..16 -> println("You Just a kid")
        !in 81..120 -> println("are you kidding me")
        else -> println("Please Enter correct age!!!")


    }
}