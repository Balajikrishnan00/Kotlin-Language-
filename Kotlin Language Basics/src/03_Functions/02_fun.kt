package `03_Functions`


fun add(a:Int,b:Int):Int{
    return a+b
}


fun username(user:String="Ananimus"){
    println("Welcome $user")

}
fun employee(name:String,age:Int){
    println("Hello $name your age is $age")
}

fun main() {
    val result=add(10,20)
    println(result)
    username("balaji")
    employee(age=24,name="balaji")

}