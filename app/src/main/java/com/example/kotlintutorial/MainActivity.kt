import com.example.kotlintutorial.*

fun main(args: Array<String>){
    val enemy = Enemy(name = "test enemy", hitPoints = 10, lives = 3)
    println(enemy)

    enemy.takeDamage(damage = 4)
    println(enemy)

    enemy.takeDamage(damage = 11)
    print(enemy)

    val uglyTroll = Troll(name = "Ugly Troll")
    println(uglyTroll)
    uglyTroll.takeDamage(damage = 30)
    println(uglyTroll)
}