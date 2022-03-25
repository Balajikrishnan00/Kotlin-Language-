package `05_Classes and Objects (include oops)`

import org.w3c.dom.html.HTMLTableRowElement

var name1="Hello"

fun  scope(){
    var name="WEL"

    println(name)
    println(name1.lowercase())

}
class Persion(val firstName:String,val lastName:String ,val nick:String){

    constructor(firstName: String,lastName: String,age:Int,nick: String):this(firstName,lastName,nick){

        println(firstName)
        println(age)
        println(lastName)

    }

    // member variables
    var nickName:String?=null
        //setter
        set(value) {
            field=value
            println("Set value :$value")
        }
        //getter
        get() {
            println("get field:$field")
            return field
        }
    // member constructor - secondary constructor

    // member function -methods
    fun walk(){
        println("Persion in Walking")
    }
}

fun main() {

    val user=Persion("Balaji","Krishnan","ji")

    user.nickName="Bulti"

    user.nickName
    println(user.nickName)

    val user1=Persion("firs","last",24,"N2")
    val user2=Persion("hai","bye",12,"14")


}