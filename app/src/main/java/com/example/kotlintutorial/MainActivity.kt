import com.example.kotlintutorial.*

fun main(args: Array<String>){

    val uglyTroll = Troll(name = "Ugly Troll")
    println(uglyTroll)
    uglyTroll.takeDamage(damage = 30)
    println(uglyTroll)

    val vlad = Vampyre(name = "Vlad")
    println(vlad)
    vlad.takeDamage(8)
    println(vlad)
}