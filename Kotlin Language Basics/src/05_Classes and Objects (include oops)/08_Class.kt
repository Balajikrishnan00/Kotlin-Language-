package `05_Classes and Objects (include oops)`

class Persions(_firstName:String="",_lastName:String=""){
    val firstName:String
    val lastName:String

    var nickName:String?=null
        set(value) {
            field=value
            println(value)
        }
        get() {
            println("get $field")
            return field
        }


    init {
        firstName=_firstName
        lastName=_lastName
        println(nickName)
        nickName="Balti"
        nickName
        nickName
        nickName="balti"
    }
    constructor(lastname:String="Welcome"):this("balaji","krishnan"){
    }


}

interface Human{
    val name:String
    val age:Int
    fun walk()
    fun eat()
    fun sleep()
    fun run()
}

class humanBehaviour:Human{

    override val name: String
        get() = "balaji"
    override val age: Int
        get() = 24

    override fun walk() {
      println("Walking")
    }

    override fun eat() {
        println("Eating")
    }

    override fun run() {
        println("Running")
    }

    override fun sleep() {
        println("Sleeping")
    }

}

fun main() {
    val user1=Persions("Balaji","krishnan")
    val user2=Persions("Hello")
    println("---------------------------------------------")
    println(user2.firstName)
    println(user2.lastName)
    val human1=humanBehaviour()
    println(human1.name)



}