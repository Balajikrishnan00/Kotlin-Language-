fun main() {

    fun max(a:Int,b:Int)=if (a>b) a else b

    println(max(10,20))

    fun username(name:String?) = name ?: "NO Name"

    println(username("Balaji"))
    println(username(null))

    val name="Balaji"
    name.let { name.forEach { println(name)  } }

    fun total(a: Int, b: Int): Int {
        return a + b
    }

    fun findVolume(length:Int,breath:Int,height:Int=10):Int{
        return length * breath * height
    }

    val result=findVolume(10,20)
    println(result)

    fun fullName(firstName:String,lastName:String):String {
        return firstName + lastName
    }

    println(fullName(lastName = "Krishnan", firstName = "Balaji"))

    // inline fun

    fun openDoor(){
        fun light (){
            println("ON LIGHT")
        }
        light()
    }
    fun closeDoor(){
        fun light(){
            println("OFF LIGHT")
        }
        light()

    }

    openDoor()
    closeDoor()
}