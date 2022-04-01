package `9Hours`

fun main(array: Array<String>):Unit {
    lateinit var user:User
    user=User()

    user.firstName="Balaji"
    user.lastName="Krishnan"

    println(user.firstName)
    println(user.lastName)

    user.fulName()
    user.updateName("shiva","sati")
    println(user.fulName())

    println(user.preFix("Welcome"))

    val n1=GetterSetter()
    println(n1.name)
    n1.name="balaji"
    println(n1.name)

    n1.lastname="Balaji krishnan"
    println(n1.lastname)

    val over1=OverrideMethods()
    over1.firstName="User1"
    over1.lastName="user1"
    println( over1.toString())
    println( over1.FULLNAME())

    var comp=companion.CreateUser("Balaji","Kotlin Dev")


    val fulldetail=comp.printfullname()
    println(fulldetail)
    val comp2=companion.CreateUsers(2)
    comp2.forEach{it -> println(it) }

    println("-------------------------------------")
    val emp1=Employee.createEmpDetail("Balaji",121111)

    val emp2=Employee.Created(6)

    println(emp2)

    emp2.forEach {  println(it) }




}