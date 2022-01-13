package `01_Variables and Types`

fun main() {

    println("---> DataTypes in Kotlin")

    println("---- String,Char----")

    val name:String="Balaji Krishnan"
    var grade:Char='S'

    println("Student name: $name\nand his grade: $grade")

    println("------------------------------------------")

    println("Numbers")

    println("--> Int,Bytes,Short,Long,Float,Double")
    println("Int\nMin :${Int.MIN_VALUE}\nMax :${Int.MAX_VALUE}")

    println()

    println("Bytes\nMin :${Byte.MIN_VALUE}\nMax :${Byte.MAX_VALUE}")

    println()

    println("Short\nMin :${Short.MIN_VALUE}\nMax :${Short.MAX_VALUE}")

    println()

    println("Long\nMin :${Long.MIN_VALUE}\nMax :${Long.MAX_VALUE}")

    println()

    println("Float\nMin :${Long.MIN_VALUE}\nMax :${Long.MAX_VALUE}")

    println()

    println("Double\nMin :${Double.MIN_VALUE}\nMax :${Double.MAX_VALUE}")

    println("-------Boolean---------")

    var boolean:Boolean=true

    println(boolean)
    println(!boolean)

    println("-------------------------------------------")
    val escapedString:String="I am escaped String!\n"

    val rawString:String="""This is going to be a
   multi-line string and will
   not have any escape sequence"""
    println(escapedString)

    println()
    println(rawString)



}