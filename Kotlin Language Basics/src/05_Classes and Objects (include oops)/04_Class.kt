package `05_Classes and Objects (include oops)`

class Pepul constructor(var firstName:String?,var lastName:String?){



    init {
        println("firstName $firstName lastName $lastName")
        println("firstname ${this.firstName} lastname ${this.lastName}")
        print(firstName)
        print(lastName)

    }

    constructor(firstName: String):this(firstName,lastName=null){
        println("Firstname ${this.firstName} lastname ${this.lastName}")
        println("$firstName $lastName")
    }

    constructor(firstName: String,lastName: String,age:Int):this(firstName,lastName,){
        val Age=age

    }

}

fun main() {
    val pepul1=Pepul("Balaji","Krishnan")
    val pepul2=Pepul("Balaji")
    val pepul3=Pepul("ravi","kumar",24)


}