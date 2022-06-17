package `9Hours`

object objectone:Second() {

    val name:String?="Balaji Krishnan"
    var age:Int?=24

    fun printUserinfo(){
        println("Your Name Is :$name and age $age")
    }


    override fun welcome(){
        super.welcome()
        println("Sub welcome")

    }

}

open class Second{

    open fun welcome(){
        println("super Welcome")
    }
}

fun main() {

    objectone.printUserinfo()
    objectone.welcome()
}
