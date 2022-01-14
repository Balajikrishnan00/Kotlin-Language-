package `01_Variables and Types`

/*
Pattern-7:
J J J J J J J J J J
I I I I I I I I I I
H H H H H H H H H H
G G G G G G G G G G
F F F F F F F F F F
E E E E E E E E E E
D D D D D D D D D D
C C C C C C C C C C
B B B B B B B B B B
A A A A A A A A A A
 */

fun main() {
    val range=65..74
    for(i in range.reversed()){
        for (j in range){
            print("${Char(i)} ")
        }
        println()
    }
}