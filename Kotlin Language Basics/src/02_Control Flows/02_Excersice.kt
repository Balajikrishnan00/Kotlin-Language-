package `02_Control Flows`

fun main() {
    var data:Any=123.23

    when(data){
        is Int -> println("${data.javaClass}")
        is String -> println("${data.javaClass}")
        is Double -> println("${data.javaClass}")




    }
}
