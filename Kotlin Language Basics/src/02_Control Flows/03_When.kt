package `02_Control Flows`

fun main() {
    print("Enter a number")
    val number= readLine()!!.toInt()

    when(number){
        in 1..3 -> println("Group 1")
        in 4..6 -> println("Group 2")
        in 7..9 -> println("Group 3")
        else -> println("This is else Part")



    }

    val reverseNum=10 downTo 0

    reverseNum.let { it->
        println(it)
    }
    val Num= readLine()!!.toInt()
    when(Num){
        1,2,3-> println("Yes")
        4,5,6-> println("Yes")
        7,8,9-> println("Yes")
        else -> println("No")
    }
}