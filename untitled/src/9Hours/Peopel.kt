package `9Hours`

class Peopel(
    var firstname:String,
    var lastName:String,
    var isPlatinum:Boolean) {

    constructor(firstname: String,lastName: String):this(firstname,lastName,false)

    constructor(firstname: String):this(firstname,"IsEmpty",false)

    constructor(lastName: String,isPlatinum: Boolean):this("isempty",lastName,isPlatinum)


    constructor():this("IsEmpty","IsEmpty",false)

    constructor(isPlatinum: Boolean):this("IsEmpty","IsEmpty",isPlatinum)

}