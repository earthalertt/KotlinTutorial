package com.example.kotlintutorial

class Player(val name: String, var level: Int = 1, var lives: Int = 3, var score: Int = 0) {
    var weapon: Weapon = Weapon(name = "Fist", damageInflicted = 1)
    private val inventory = ArrayList<Loot>()


    fun show(){
        if (lives > 0){
            println("$name is alive")
        }else{
            println("$name is dead")
        }
    }

    override fun toString(): String {
        return """
            name: $name
            lives: $lives
            level: $level
            score: $score
            weapon: ${weapon}
        """
    }

    fun  getLoot (item: Loot){
        inventory.add(item)
    }

//    fun  dropLoot(item: Loot):Boolean{
//        for (item in inventory){
//            if (item.name == name){
//                inventory.remove(item);
//                return true;
//            }
//        }
//        return false;
//    }

    fun  dropLoot(name: String): Boolean {
        var result = false
        for (item in inventory){
            if (item.name == name){
                inventory.remove(item)
                result = true
                break
            }
        }
        return result
    }

    fun showInventory(){
        var total = 0.0
        println("$name's Inventory")
        for (item in inventory){
            println(item)
            total += item.value
        }
        println("========================")
        println("Total score is: $total")
        println("========================")
    }
}