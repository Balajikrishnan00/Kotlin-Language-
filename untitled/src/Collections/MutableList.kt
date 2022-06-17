package Collections

import add

class MutableList()
var listTitle= mutableListOf<String>()
var listDesc= mutableListOf<String>()
var listImage= mutableListOf<Int>()

fun addToList(title:String,description:String,image:Int){

    listTitle.add(title)
    listDesc.add(description)
    listImage.add(image)

}
fun postToList(int: Int){

    for (i in 0 until int){

        addToList("Title $i","Description $i",i)
    }
}

fun main() {

    val mutableList= MutableList()
    postToList(10)
    println(listTitle)
    println(listDesc)
    println(listImage)

}