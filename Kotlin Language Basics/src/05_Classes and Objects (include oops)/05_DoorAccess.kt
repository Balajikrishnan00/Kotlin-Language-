package `05_Classes and Objects (include oops)`

class DoorAccess(firstName:String,lastName:String,Type:Char){
    var fullName=firstName+lastName
    val typeS= arrayOf("1","2","3","4","5","6","7","8","9","10")
    val typeA= arrayOf("1","2","3","4","5")
    val typeB= arrayOf("1","2","3")
    val typeC= arrayOf(1,2,3,4,5)

    init {
        println("Welcome Mr.$fullName")

    }

    fun doorOne(){

    }
}