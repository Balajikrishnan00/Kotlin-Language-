package `9Hours`

data class EMPDetails(val id:Int,val name:String,val country:String)


fun main() {

    var listOfAll= mutableListOf<EMPDetails>()

    val emp1=EMPDetails(1,"Balaji","India")
    val emp2=EMPDetails(2,"krishnan","India")
    listOfAll.add(emp1)
    listOfAll.add(emp2)
    println(listOfAll)

    val pos=listOfAll.get(0)
    println(pos)
}