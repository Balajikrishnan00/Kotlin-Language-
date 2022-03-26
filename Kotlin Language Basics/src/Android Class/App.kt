package `Android Class`

open class App(appName:String,packageName:String,version:Double) {

    open fun onCreate(data:String?){
        println("On Create ...")
        println(data)

    }
    open fun onResume(){
        println("On Resume ...")
    }

    open fun onPause(){
        println("On Pause ...")
    }

    open fun onStop(){
        println("On Stop ...")
    }

}