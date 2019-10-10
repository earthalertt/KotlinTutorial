import com.example.kotlintutorial.*

fun main(args: Array<String>){

    val uglyTroll = Troll(name = "Ugly Troll")
    println(uglyTroll)
    uglyTroll.takeDamage(damage = 30)
    println(uglyTroll)

    val vlad = Vampyre(name = "Vlad", hitPoints = 2)
    println(vlad)
    vlad.takeDamage(8)
    println(vlad)

    val dracula = VampyreKing(name = "Dracula")
    println(dracula)
}