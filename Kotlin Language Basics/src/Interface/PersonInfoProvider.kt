package Interface

import `Android Class`.MyAPP

interface PersonInfoProvider {
    val pName:String
    val pGender:Char

    fun walk(mapp: MyAPP){

        println( " i am Interface ")
        mapp.onCreate(pName)
    }


    fun sit()

    fun eat()

    fun sleep()

}

 class BasicInfoProvider(val name:String,val gender:Char):PersonInfoProvider{

     override val pName: String

         get() = name ?: "No Name"

     override val pGender: Char
         get() = gender ?: '-'

     override fun walk(mapp:MyAPP) {

         println( "I am class")
         println(" $pName walking")
         super.walk(mapp)


     }

     override fun sit() {
         println("$pName sitting")
     }

     override fun eat() {
         println("$pName Eating")
     }

     override fun sleep() {
         println("$pName Sleeping")
     }

}

fun main() {

    val basic=BasicInfoProvider("balaji",'M')
    println(basic.pName)
    basic.walk(MyAPP("mewApp","app.com",1.2))

}