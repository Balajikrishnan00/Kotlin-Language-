package Collections

fun main() {
    var array=Array<Int>(5){0}
    array[0] = 5
    array[1] = 10
    array[2] = 15
    array[3] = 20
    array[4] = 25
    //array[5] = 30
    ///array[6] = 35
    array.forEach {
        println(it)
    }

    val a1= arrayOf("balaji","balaji","balaji",124,456)


    a1.reversedArray().forEach {
        println(it)
    }

}