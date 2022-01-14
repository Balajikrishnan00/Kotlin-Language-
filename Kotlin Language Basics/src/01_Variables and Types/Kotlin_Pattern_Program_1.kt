package `01_Variables and Types`



fun main() {

    // pattern Program 1

    /*
    * * * * * * * * * *
    * * * * * * * * * *
    * * * * * * * * * *
    * * * * * * * * * *
    * * * * * * * * * *
    * * * * * * * * * *
    * * * * * * * * * *
    * * * * * * * * * *
    * * * * * * * * * *
    * * * * * * * * * *

     */


    // type 1 -forLoop
    val range=1..10
    for (row in range){
        for (col in range){
            print("* ")
        }
        println()
    }

    println("----------------------------------")


    // type 2 while Loop
    print("Enter Length of Patten: ")
    val maxLength= readLine()!!.toInt()
    var i=1

    while (i<=maxLength){
        var j=1
        while (j<=maxLength){
            print("* ")
            j++
        }
        println()
        i++
    }


}
