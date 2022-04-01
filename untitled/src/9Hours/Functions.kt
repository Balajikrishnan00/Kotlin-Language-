package `9Hours`

fun printUserInfo(name:String){
    println("Name: "+name)
}
fun printUserInfo(name:String,age:Int){
    println("Name: " + name + " and Age Is : "+age)
}

fun printUserInfo(name:String,age:Int,color:String){
    println("""
        $name $age $color
    """.trimIndent())
}

fun printUserInfo(name:String,vararg book:String){
    println("""
        $name
            ${book.forEach { it ->print(" $it") }}
        """.trimIndent())
}



