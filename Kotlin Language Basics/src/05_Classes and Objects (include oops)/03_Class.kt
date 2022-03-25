package `05_Classes and Objects (include oops)`

import java.lang.IllegalArgumentException

class car(){
    lateinit var brand:String

    var maxSpeed=220
        get() = field
        set(value) {
        field=if (value>0) value else 0 //throw IllegalArgumentException("No")
        }



    var Owner:String?=null
    set(value) {
        field=value
        println(value)
    }
    get() {
        return field
    }

    val model="S1pro"
    get() {

        return field.lowercase()
    }

    init {
        brand="Bmw"

    }
}

fun main() {
    val c1=car()
    println(c1.brand)
    c1.brand="Audi"
    println(c1.brand)
    println(c1.model)
    c1.Owner="Balaji"
    println(c1.Owner)
    c1.maxSpeed=20
    println(c1.maxSpeed)

}