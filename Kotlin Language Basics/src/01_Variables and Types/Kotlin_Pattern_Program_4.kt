package `01_Variables and Types`

/*
Pattern-4:
A A A A A A A A A A
B B B B B B B B B B
C C C C C C C C C C
D D D D D D D D D D
E E E E E E E E E E
F F F F F F F F F F
G G G G G G G G G G
H H H H H H H H H H
I I I I I I I I I I
J J J J J J J J J J
 */
fun main() {
    val n= readLine()!!.toInt()
    val range=1..n
    for (i in range){
        for (j in range){
            print(Char(64+i))
        }
        println()
    }

}