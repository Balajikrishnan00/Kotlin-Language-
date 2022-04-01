package `9Hours`

open class Login(Email:String,Password:String,){
    val email=Email
    val password=Password

    fun login(){
        if (email==""&&password==""){
            println("Login Success!")
        }
        else{
            println("Invalid Username password")
        }
    }

}
