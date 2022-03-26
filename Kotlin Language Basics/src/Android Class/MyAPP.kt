package `Android Class`

class MyAPP(appName:String,packageName:String,version:Double):App(appName,packageName,version)
{

        override fun onCreate(data: String?) {
            val Data=data
            println("I am child on create")
            super.onCreate(Data)
    }
}

fun main() {
    val app1=MyAPP("Hello APP","Com.Hello",1.0)
    app1.onCreate("run Apk")
}