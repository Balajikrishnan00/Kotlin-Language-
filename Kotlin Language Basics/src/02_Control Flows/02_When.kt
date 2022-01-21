package `02_Control Flows`

fun main() {

    val balajiList= arrayListOf("Balaji",24,"26/04/1997","1_200_000")

    print("UserName : ")
    val username= readLine()!!
    print("Password : ")
    val password= readLine()!!

    if ((username=="Balaji") &&(password=="123")) {
            println("valid Username")

            print("1.find Employee\n2.details of employee: ")
            var chooice= readLine()!!.toInt()

            if (chooice==1){
                print("Emp name: ")
                var empName= readLine()!!
                when(empName) {
                    "balaji" -> println("valid employee")
                    "siva" -> println("valid employee")
                    else -> println("no found result")
                }
        }else if (chooice==2){
                print("EmpDetails of need a emp name: ")
                var empDetailName=readLine()!!
                when(empDetailName){
                    "balaji"-> println("Name")
                    "Siva"-> println("yes")
                    else-> println("no")

                }
            }
    }else{
        println("Invalid Username or password")
    }
    println("----------------------------------------------------")
    balajiList.let {
        //it->
        println(it)
    }
    println("---------------------------------------------------")
    balajiList.forEach { it -> println(it) }
    println("-------------------------------------------------")
    balajiList.forEachIndexed { index, it -> println("$index is $it")  }

}