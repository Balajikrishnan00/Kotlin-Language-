package `01_Variables and Types`

fun main() {

    val intArray:IntArray= intArrayOf(1,2,3,4,5,6,7,8,9,10)

    println(intArray[0])
    println(intArray)

    println(intArray[(intArray.size)-1])

    val length=intArray.size
    println(intArray[length-1])

    println("-------------------------------------")
    println("Types Conversion")

    val typeConversion=arrayListOf<String>("toByte()","toShort()","toInt()","toLong()","toFloat()","toDouble()","toChar()")

    typeConversion.forEach { it -> println(it) }



}