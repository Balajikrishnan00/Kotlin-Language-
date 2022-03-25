package `06_Excersice`

// 65 A  90 Z
// 97 a  122 z


fun nameOfChar(){
    val range=1..122
    for (i in range){
        println("$i : ${Char(i)}")
    }
}

fun findName(username:String){

    val upperChar=65..90
    val lowerChar=97..122
    var displayName=""

    for (i in username){
        if ((i.code in upperChar) ||(i.code in lowerChar)){
            displayName+=i
        }
    }
    println(displayName)
}

fun main() {
    var upperChar=65..90
    var lowerChar=97..122
    findName("Balaji1232344")
    //println(Char(78))
    println()

}