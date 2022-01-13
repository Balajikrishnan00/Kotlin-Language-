package `01_Variables and Types`

fun main() {

    val a=10
    val b=20

    val c=a+b  // 10+20= 30
    println(c)

    val d=c-b  //30-20=10
    println(d)

    val e=d*c  //10*30=300
    println(e)

    val f=e/d  //300/10=30
    println(f)

    val g=f%e  //30%300
    println(g)

    //println(10/20)

    println("-------------------------------------------------")
    println("arithmetic Operator")

    val plus=10+20
    val Plus=10.toInt().plus(20)
    println("plus :$plus")
    println("Plus :$Plus")

    val minus=10-10
    val Minus=10.toInt().minus(10)
    println("minus :$minus")
    println("Minus :$Minus")

    val times=10*10
    val Times=10.toInt().times(10)
    println("times :$times")
    println("Times :$Times")

    val div=10/10
    val Div=10.toInt().div(10)
    println("div :$div")
    println("Div :$Div")

    val mod=10%3
    val Mod=10.toInt().mod(3)
    println("mod :$mod")
    println("Mod :$Mod")


}