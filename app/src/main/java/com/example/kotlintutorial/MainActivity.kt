fun main(args: Array<String>) {
    println("Hello World")
    println("My first Kotlin program")

    var tim: String
    tim = "Tim Buchalka"
    println(tim)

    var timWeeklySalary: Int = 32
    var timMonthlySaraly: Int = timWeeklySalary * 4
    println("Tim;s $ weekly salary is $$timWeeklySalary")
    println("Monthly, that comes to $timMonthlySaraly")

    println()

    val apples: Int = 6
    val orange: Int = 5
    val fruit: Int = apples - orange
    println("$apples apples - $orange orange leaves $fruit piece(s) of fruit")

    println("A quarter of the apples is ${apples / 4}")

    println()
    val week: Int = 234
    val years: Double = week / 52.0
    println("$week weeks is $years years")

    println("My name is $tim")
    println("I can print \$tim")

}