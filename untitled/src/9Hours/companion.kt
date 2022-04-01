package `9Hours`

import java.awt.Frame
import kotlin.concurrent.fixedRateTimer

class companion private constructor(var firstname:String,var lastname:String){

    companion object{

        val users=mutableListOf<companion>()

        fun CreateUser(firstname: String,lastname: String):companion{
            return companion(firstname,lastname)
        }

        fun CreateUsers(count:Int):List<companion>{
            for (i in 0..count){
                users.add(companion("${i.toString()}","${i.toString()}"))
            }
            return users
        }
    }
    fun printfullname():String{
        return firstname + lastname
    }
}
