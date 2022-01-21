package `02_Control Flows`

fun main() {

    val range=1..20
    var count=0
    for(i in range){

        if (i%2==0){
            println(i)
            count+=1
            if (count==5){
                break
            }
            }
    }
    println("---------------------------------")
    for (i in range){


        if (i/2==5){

            continue
        }else if (i==10){
            break
        }else{
            println(i)
        }

    }
}