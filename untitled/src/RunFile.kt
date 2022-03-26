fun main() {


    val laptop=Laptop("HP","PAVILION360")
    println(laptop.desktopName)
    println(laptop.desktopModel)

    val studentPassMark= StudentPassMark(40)
    val result=studentPassMark.hasPassed()
    println(result)

    val str1="str1"
    val str2="srt2"
    var str3="str3"

    //str3=str3+str2+str1
    //println(str3)
    //println(str3.lowercase().length)
    //println(str3.length)
    
    println(str3.add(str1,str2))

    //println(str3)

    val A=10
    val grater=A.GraterValue(20)
    println(grater)

    val a=20
    val b=a GraterValue 20
    println(b)

    val name:String="Balaji"
    val fullName=name.Add("Krishnan")
    println(fullName)
}

infix fun Int.GraterValue(other:Int):Int{
    if (this>other)
        return this
    else
        return other
}