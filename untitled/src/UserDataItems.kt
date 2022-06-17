data class Person(
    val name:String,
    val age:Int,
)
data class ListPerson(
    val data:List<Person>
)

fun main() {
    val mutableList = mutableListOf<ListPerson>()


    println(mutableList)
    mutableList.forEach {
        println(it)
    }
}
