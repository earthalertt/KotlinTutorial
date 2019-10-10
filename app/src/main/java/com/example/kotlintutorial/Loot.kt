package com.example.kotlintutorial


enum class LootType {
    POTION, RIMG, ARMOR
}
class Loot(val name: String, val type: LootType, val value: Double) {
}