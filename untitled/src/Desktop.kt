open class Desktop(val name:String,val Model:String){

    val desktopName:String=this.name
    val desktopModel:String=this.Model

    fun powerOn(power:Boolean):Boolean {
        return power
    }

    fun internet(internet:Boolean):Boolean{
        return internet
    }

}
