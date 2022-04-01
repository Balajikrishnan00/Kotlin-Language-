package `9Hours`

class OverrideMethods {
    var firstName:String?=null
    var lastName:String?=null
    fun fullName():String{
        return firstName+lastName
    }

    fun FULLNAME():Any? {
        return (firstName + lastName) ?: null
    }

    override fun toString(): String {
        return fullName()
    }
}