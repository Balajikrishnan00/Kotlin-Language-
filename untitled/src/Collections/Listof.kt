package Collections

data class Listof(
    val data:List<String>
)
data class User(
    val name:String,
    val age:Int
)
data class Student(
    val rollNo:Int,
    val name:String,
    val age:Int,
)
data class Students(
    var data: List<User>
)


fun main() {

    var list:List<String> = listOf("balaji", "krishnan")

    println(list)
    println(list.size)
    println(list[1])
    println(list[0])
    println(list.listIterator())
    println(list.get(1))
    println(list.first())
    println(list.last())

    var mutableList1 = mutableListOf<User>()
    val user1 = User("balaji",25)
    val user2 = User("krishnan",26)
    mutableList1.add(user1)
    mutableList1.add(user2)

    println(mutableList1)

    mutableList1.let {
        it.forEach {
            it.let {
                println(it.name)
                println(it.age)
            }
        }
    }

}