package `01_Variables and Types`

/*
Pattern-8:
J I H G F E D C B A
J I H G F E D C B A
J I H G F E D C B A
J I H G F E D C B A
J I H G F E D C B A
J I H G F E D C B A
J I H G F E D C B A
J I H G F E D C B A
J I H G F E D C B A
J I H G F E D C B A
 */
fun main() {
    val range=65..74
    for(i in range){
        for (j in range.reversed()) {
            print("${Char(j)} ")
        }
        println()
    }
}