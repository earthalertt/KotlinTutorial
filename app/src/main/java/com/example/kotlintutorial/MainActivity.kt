import com.example.kotlintutorial.Loot
import com.example.kotlintutorial.LootType
import com.example.kotlintutorial.Player
import com.example.kotlintutorial.Weapon

fun main(args: Array<String>){
    /*val tim = Player(name = "Tim")
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
    // println(tim.weapon.name)
    tim.show()

    louise.weapon = tim.weapon
    louise.show()

    tim.weapon = Weapon(name = "Spear", damageInflicted = 14)
    //println(tim.weapon.name)
    tim.show()

    val redPotion = Loot(name = "Red Potion", type = LootType.POTION, value = 7.50)
    tim.inventory.add(redPotion)
    val chestArmor = Loot(name = "+3 Chest Armor", type = LootType.ARMOR, value = 80.00)
    tim.showInventory()

    tim.inventory.add(Loot(name = "Ring of Protection +2", type = LootType.RING, value = 40.25))
    tim.inventory.add(Loot(name = "Invisibility Potion", type = LootType.POTION, value = 35.95))
    tim.showInventory()

    println(tim.toString())*/

    for (i in 10 downTo 0 step 2){
        println("$i squared is ${i * i}")
    }

    for (value in 3..100 step 3){
        if (value % 5 ==0){
            println(value)
        }
    }
}