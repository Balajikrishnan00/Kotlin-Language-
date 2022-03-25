package `05_Classes and Objects (include oops)`

import kotlin.properties.Delegates

open class Android constructor(Model:String,Brand:String,os:String) {
    var calling:Boolean=false

    ///var mobileNumber: Long?=null

    init {
        println("PowerBy android")
        println("Model:$Model\nBrand:$Brand\nos:$os")
    }
    fun call(mobileNumber:Long?){
        if (mobileNumber.toString().length==10){
            calling=true
            println("calling...\n$mobileNumber")
        }else{
            println("Mobile number does not exit")
        }
    }
    fun callCancel(){
        if (calling){
            calling=false
            println("Call end.")
        }else{
            println("")
        }

    }

}