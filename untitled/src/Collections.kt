import org.w3c.dom.html.HTMLElement

fun main() {

    val Intarray=arrayOf(40,50,60,70,80,90)
    val balaji=Intarray

    println(balaji.size)
    println(balaji[1])
    println(balaji.get(1))
    println(balaji.iterator().forEach { it -> println(it) })
    balaji.set(0,66)
    println(balaji[0])
    balaji.toString()
    println(balaji.firstOrNull())

    
}