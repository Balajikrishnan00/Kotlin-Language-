package `Android Class`

interface  Facebook{

    fun Login(myAPP: App)

    fun Logout()
}

class socialMedia():Facebook{

    override fun Login(myAPP: App) {

    }

    override fun Logout() {

    }
}

fun main() {

    val user1=socialMedia()
    user1.Login(myAPP = App("social media","com.social",2.0))


}