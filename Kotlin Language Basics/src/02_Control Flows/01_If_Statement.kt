package `02_Control Flows`

fun main() {
    print("Enter Height Persion One: ")
    val heightPersion1= readLine()!!.toInt()
    print("Enter height Persion Two: ")
    val heightPersion2= readLine()!!.toInt()
    if (heightPersion1>heightPersion2){
        println("Persion one in Taller")
    }else if (heightPersion2>heightPersion1){
        println("Persion Two is Taller")
    }else{
        println("Both are Equal")
    }

}