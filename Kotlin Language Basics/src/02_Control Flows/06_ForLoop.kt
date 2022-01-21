package `02_Control Flows`

fun main() {
    val i = 1..100
    for(i in i){
        println(i)
    }

    val j=1 until 10
    for (j in j){
        println(j)
    }

    val k= 1 ..50 step 5

    for (a in k){
        println(k.step)
    }

    val l=10 downTo 2 step 2
    for(a in l){
        println(a)
    }
}