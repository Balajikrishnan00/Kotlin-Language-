package `01_Variables and Types`

/*
Pattern-6:
10 10 10 10 10 10 10 10 10 10
9 9 9 9 9 9 9 9 9 9
8 8 8 8 8 8 8 8 8 8
7 7 7 7 7 7 7 7 7 7
6 6 6 6 6 6 6 6 6 6
5 5 5 5 5 5 5 5 5 5
4 4 4 4 4 4 4 4 4 4
3 3 3 3 3 3 3 3 3 3
2 2 2 2 2 2 2 2 2 2
1 1 1 1 1 1 1 1 1 1
 */

fun main() {
    val range=1..10
    println("ForLoop")
    for (i in range){
        for (j in range.reversed()){
            print("$j ")
        }
        println()
    }

    println("----------------------------------------")
    println("while Loop")


}