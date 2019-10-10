import com.example.kotlintutorial.Player
import com.example.kotlintutorial.Weapon

fun main(args: Array<String>){
    val tim = Player(name = "Tim")
    tim.show()

    val louise = Player(name = "Louise", level = 5)
    louise.show()

    val gr8 = Player(name = "gr8", level = 4, lives = 8)
    val one2watch = Player(name = "Ace", level = 2, lives = 5, score = 1000)
    gr8.show()
    one2watch.show()
    println(one2watch.weapon.name.toUpperCase())
    println(one2watch.weapon.damageInflicted)

    val axe = Weapon(name = "Axe", damageInflicted = 12)
    gr8.weapon = axe
    println(gr8.weapon.name)
    println(axe.name)

    axe.damageInflicted = 24
    println(axe.damageInflicted)
    println(gr8.weapon.damageInflicted)

    tim.weapon = Weapon(name = "Sword", damageInflicted = 10)
    println(tim.weapon.name)

    tim.weapon = Weapon(name = "Spear", damageInflicted = 14)
    println(tim.weapon.name)


}