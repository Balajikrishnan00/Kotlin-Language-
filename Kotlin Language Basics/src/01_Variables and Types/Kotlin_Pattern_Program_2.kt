package `01_Variables and Types`

/*
Pattern-2:
1 1 1 1 1 1 1 1 1 1
2 2 2 2 2 2 2 2 2 2
3 3 3 3 3 3 3 3 3 3
4 4 4 4 4 4 4 4 4 4
5 5 5 5 5 5 5 5 5 5
6 6 6 6 6 6 6 6 6 6
7 7 7 7 7 7 7 7 7 7
8 8 8 8 8 8 8 8 8 8
9 9 9 9 9 9 9 9 9 9
10 10 10 10 10 10 10 10 10 10
 */

fun main() {
    print("Enter Min Number: ")
    var minNum= readLine()!!.toInt()
    var while1=minNum

    print("Enter Max Number: ")
    var maxNum= readLine()!!.toInt()
    var while2=maxNum

    val range=minNum..maxNum
    println("using forLoop")
    for (i in range){
        for (j in range){
            print("$i ")
        }
        println()
    }

    println("-----------------------------------")
    //var i=1
    println("Using whileLoop")

    while (while1<=while2){
        var j=1
        while (j<=while2){
            print("$while1 ")
            j++
        }
        println()
        while1++
    }
    println("-------------------------")
    for (i in 1..10){
        for (j in 1..10){
            print(i)
        }
        println()
    }
}