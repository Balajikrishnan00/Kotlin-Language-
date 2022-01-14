package `01_Variables and Types`

/*
Pattern-5:
A B C D E F G H I J
A B C D E F G H I J
A B C D E F G H I J
A B C D E F G H I J
A B C D E F G H I J
A B C D E F G H I J
A B C D E F G H I J
A B C D E F G H I J
A B C D E F G H I J
A B C D E F G H I J

 */
fun main() {

    val maxNum= readLine()!!.toInt()
    val range=65..maxNum
    println("ForLoop")
    for (i in range){
        for (j in range){
            print("${Char(j)} ")
        }
        println()
    }
    println("-------------------------------------------")
    println("while Loop")
    var i=65
    while (i<=maxNum){
        var j=65
        while (j<=maxNum){
            print("${Char(j)} ")
            j++
        }
        println()
        i++
    }
}