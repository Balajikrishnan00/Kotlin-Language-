package `03_Functions`

fun myFun(name:String) {

    var username =name
    //val length=username.length
    var i = 0
    //println(length)
    var newName=""
    while (i<username.length){
        if (i==0){
            newName+=username[i].uppercase()
            //println(newName)
        }else{
            newName+=username[i]
        }
        i+=1
        //println(i)
    }
    println("Welcome $newName")
}

fun main() {
    print("Enter Your Name:")
    val data= readLine()!!
    myFun(data)
}