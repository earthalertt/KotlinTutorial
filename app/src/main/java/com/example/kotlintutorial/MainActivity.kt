import com.example.kotlintutorial.*

fun main(args: Array<String>){

    /*val uglyTroll = Troll(name = "Ugly Troll")
    println(uglyTroll)
    uglyTroll.takeDamage(damage = 30)
    println(uglyTroll)

    val vlad = Vampyre(name = "Vlad", hitPoints = 2)
    println(vlad)
    vlad.takeDamage(8)
    println(vlad)
    */

    for (i in 1 .. 10){
        val dracula = VampyreKing(name = "Dracula")
        println(dracula)
        while (dracula.lives > 0) {
            if (dracula.dodges()){
                continue;
            }
            if (dracula.runAway()){
                println("Dracula ran awy")
                break
            }else {
                dracula.takeDamage(80)
            }
        }
        println("---------------------------")
    }


    /*val conan = Player(name = "Conan")
    conan.getLoot(Loot("Invisibility", LootType.POTION, 4.0))
    conan.getLoot(Loot("Mithril", LootType.ARMOR, 183.0))
    conan.getLoot(Loot("Ring of speed", LootType.RING, 25.0))
    conan.getLoot(Loot("Red Potion", LootType.POTION, 2.0))
    conan.getLoot(Loot("Cursed Shield", LootType.ARMOR, -8.0))
    conan.getLoot(Loot("Brass Ring", LootType.RING, 1.0))
    conan.getLoot(Loot("Chain Mail", LootType.ARMOR, 4.0))
    conan.getLoot(Loot("Gold Ring", LootType.RING, 12.0))
    conan.getLoot(Loot("Health Potion", LootType.POTION, 3.0))
    conan.getLoot(Loot("Silver Ring", LootType.RING, 6.0))
    conan.showInventory()*/
}