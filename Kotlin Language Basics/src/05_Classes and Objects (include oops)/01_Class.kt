package `05_Classes and Objects (include oops)`

class SocialBook(username:String,password:String){



    var usernameIsLogin=false

    init {
        println("Welcome To Facebook")

    }
    init {
        var upperChar=65..90
        var lowerChar=97..122
        var displayName=""
        if ((username=="Balaji123")&&(password=="12345")){
            for (i in username){
                if ((i.toInt() in upperChar)||(i.toInt() in lowerChar)){
                    displayName+=i
                }
            }
            println("Hi $displayName")
            usernameIsLogin=true




        }else{
            println("Invalid Username or Password")
        }
    }

    fun like() {
        if (usernameIsLogin) {
            println("liked..")
        }
    }
    fun comments(comment:String){
        if (usernameIsLogin){
            println("Comment...")
            println(" \"$comment\" ")
        }

    }
    fun share(){
        println("shared pictured...")
    }

}

fun main() {

    val user1=SocialBook("Balaji123","12345")
    user1.like()
    user1.comments("this pic so cute")
    user1.share()


}