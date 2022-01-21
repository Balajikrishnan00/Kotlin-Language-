package `02_Control Flows`

fun main() {
    var i=0
    do {
        println("Hello world $i")
        i+=1
    }while (i<=10)


    var feltTemp="cold"
    var roomTemp=10
    while (feltTemp=="cold"){
        roomTemp++
        println("increasing Room Temp $roomTemp")
        if (roomTemp>=20){
            feltTemp="comfy"
            println("Room Temp is:$feltTemp")
        }
    }
    println("------------------------------------")
    while (feltTemp == "comfy"){
        roomTemp--
        println("decreasing Room Temp $roomTemp")
        if (roomTemp==10){
            feltTemp="cold"
            println("Room Temp is:$feltTemp")
        }
    }

}