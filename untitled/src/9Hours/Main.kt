package `9Hours`

fun main(array: Array<String>):Unit {

    var fullname="Balaji Krishnan"
    println(fullname)
    fullname="Balaji"
    println(fullname)
    fullname=" "
    println(fullname.isEmpty()) //true
    println(fullname.isBlank()) // true
    println(fullname.isNotBlank()) // false
    println(fullname.isNotEmpty()) //false
    println(fullname.isNullOrBlank()) // true
    println(fullname.isNullOrEmpty()) // true

    println("------------------------------------")
    // mutable variable var
    // immutable variable val
    var age:Int?=30
    age=32
    age=null
    println(age)

    var firstName:String?="Balaji"
    var lastName:String?="Krishnan"
    val fullName:String= ("""
        """ + firstName + lastName + """
        """).trimIndent()
    println(fullName)

    //val type=firstName::class.java
    println(fullName::class)
    println(fullName::class.java)
    val t=fullName::class.constructors
    println(t)

    var a=10
    var b=20
    println(a==b)
    println(a===b)

    val persion:Persion=Persion("Balaji")
    val persion1=Persion("Krishnan")
    val lenth=persion1.yourName?.length
    println(lenth)
    val length2=persion1.yourName?.subSequence(0,4)?.length
    println(length2)

    printUserInfo("Balaji")
    printUserInfo("Krishnan",61)
    printUserInfo("balaji",25,"black")

    printUserInfo("balaji","book1","book2","book3","book4")

    val user=User()
    user.firstName="Balaji"
    user.lastName="Krishnan"
}