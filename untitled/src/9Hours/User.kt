package `9Hours`
class User {
    var firstName:String=""
    var lastName:String=""

    fun fulName():String{
        return " $firstName $lastName"
    }

    fun preFix(prefix:String):String{
        return "$prefix ${fulName()}"
    }

    fun updateName(firstname:String,lastname:String){
        firstName=firstname
        lastName=lastname
        println("New Change Success full")

    }


}