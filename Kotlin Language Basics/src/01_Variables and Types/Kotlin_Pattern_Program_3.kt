package `01_Variables and Types`

fun main() {
    /*
    Pattern-3:
    1 2 3 4 5 6 7 8 9 10
    1 2 3 4 5 6 7 8 9 10
    1 2 3 4 5 6 7 8 9 10
    1 2 3 4 5 6 7 8 9 10
    1 2 3 4 5 6 7 8 9 10
    1 2 3 4 5 6 7 8 9 10
    1 2 3 4 5 6 7 8 9 10
    1 2 3 4 5 6 7 8 9 10
    1 2 3 4 5 6 7 8 9 10
    1 2 3 4 5 6 7 8 9 10
     */

    println("ForLoop")
    var min=1
    var max=10
    val range=min..max
    for (i in range){
        for (j in range){
            print("$j ")
        }
        println()
    }
    println("-----------------------")
    println("WhileLoop")
    while (min<=max){
        var j=1
        while (j<=max){
            print("$j ")
            j++
        }
        println()
        min++

    }

}