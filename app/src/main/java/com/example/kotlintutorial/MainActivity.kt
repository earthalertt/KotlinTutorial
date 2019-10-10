import com.example.kotlintutorial.Player

fun main(args: Array<String>) {

    fun main(args: Array<String>){
        val tim = Player(name = "Tim")
        /*println(tim.name)
    println(tim.lives)
    println(tim.level)
    println(tim.score)*/
        tim.show()

        val  louise = Player(name = "Louise", level =  5)
        louise.show()

        val gr8 = Player(name = "gr8", level = 4, lives = 8)
        val one2watch = Player(name = "Ace", level = 2, lives = 5, score = 1000)
        gr8.show()
        one2watch.show()
    }
}