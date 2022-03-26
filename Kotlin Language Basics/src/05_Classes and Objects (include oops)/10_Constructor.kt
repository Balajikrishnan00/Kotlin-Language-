package `05_Classes and Objects (include oops)`

class Peopel(_firstName:String,_lastName:String){

    private val firstName=_firstName
    private val lastName=_lastName

    private val fulName:String="$firstName $lastName"

    var nickName:String?=null
        set(value) {
            println("set nickname calling")
            field=value
        }
        get() {
            println("get nickname calling")
            return field
        }

    fun fullname(): String {
        println(fulName)
        return fulName
    }

}

fun main() {

    val user1=Peopel("Balaji","Krishnan")
    val FName =user1.fullname()
    //user1.nickName="bal-ti"
    user1.nickName
    println(FName)

    val nick=if (user1.nickName !=null) user1.nickName else null

    println(nick)

    val nick1 =user1.nickName?:"no nickname"
    println(nick1)

}