package `05_Classes and Objects (include oops)`


class samsung(var Model:String, var Brand:String, os:String):Android(Model, Brand ,os){


}

fun main() {
    val mobile1=samsung("Galaxy A50","Samsung","11")

    mobile1.call(9876543210)
    mobile1.callCancel()
    mobile1.callCancel()
    mobile1.call(123)

}