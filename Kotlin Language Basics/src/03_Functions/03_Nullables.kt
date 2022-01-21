package `03_Functions`

fun main() {

    val name:String?="BalajiKrishnan"

    val length=name?.length?:0
    println(length)

    val name1:String?="Welcome"

    val length1=if (name1!=null) name1.length else 0
    println(length1)

    val name2:String?=null
    //val length2=name2!!.length?:0
    //println(length2)


}