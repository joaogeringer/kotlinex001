// kotlin.io functions

fun main() {
    val str = "Programação Kotlin"

    println("Tamanho da sttring: ${str.length}")

    println("posição (index) 0 da strting ${str[0]}")
    println(str.startsWith("Pro"))
    println(str.endsWith("abc"))


    println(str.replace("Kotlin", "Kotlin é show!"))
    println(str.lowercase())
    println(str.uppercase())
}

fun soma() {}
fun soma(a: Int){}
fun soma(a:Int, b:Int) {}
