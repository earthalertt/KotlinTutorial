package com.example.kotlintutorial

class Player (val name: String, val level: Int = 1, var  lives: Int = 3, var score: Int = 0){
    var weapon: Weapon = Weapon(name = "Fist", damageInflicted = 1)

    fun  show(){
        println("""
            name: $name
            lives: $lives
            score: $score
        """.trimIndent())
    }
}