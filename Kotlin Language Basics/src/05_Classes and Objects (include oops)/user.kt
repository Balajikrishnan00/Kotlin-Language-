package `05_Classes and Objects (include oops)`

class Bank constructor(aHolderName:String="Empty",aNumber:Long=0){
     val userName=aHolderName
     val accountNumber=aNumber

    init {
        println("This a bank of HOD")
        println("Welcome to Mr.${this.userName}")

    }

    constructor(aHolderName: String):this("new user",0){

    }

    fun manager(){
        println("I am a Manager")
        println("tell me Your Name:$userName")
        println("tell me Your AccountNumber:$accountNumber")
    }

}

fun main() {

    val user1=Bank("balaji",123456)
    user1.manager()
    println( user1.userName)

    println("----------------------------------------")

    val user2=Bank()
    user2.manager()

    println("------------------------------------------")

    val user3=Bank("Kotlin")
    user3.manager()


}