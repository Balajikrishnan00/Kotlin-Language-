package `01_Variables and Types`

fun main() {
    val a=20
    if ((a>10) &&(a>20)){
        println("a is very Big")
    }else{
        println("this is else part")
    }

    if ((a>10) || (a>20)){
        println("a is True")

    }else{
        println("this is ELse Part")
    }

    println(a!=10)

    println("--------------------------------------------")

    println("Logical Operator")

    val name1="balaji"
    val name2="krishnan"
    val len_name1=name1.length

    println(name1.length)
    println(len_name1)
    println("${{name1.length == len_name1}}")
    println("${name1.length == name1.length}")

    println("--------and &&----------------")
    println((10==10)&&(20==20))
    println((30==30).and(10==11))
    println((20).and(20))

    println("-----------or  ||---------------")
    println((20==10)||(10==10))
    println((30).dec())
    println((100).dec())
    println((10).or(200))
    println((10>9).or(10>10))
    println((10>=11).or(10>=11))

    println("------------------- not-------------------")
    println((10)!=(10))
    println(!(10>=10))

}