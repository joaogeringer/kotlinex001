import kotlin.math.*
// Escreva uma função que seja capaz de receber a quantidade de anos e transformar em meses, dias, horas, minutos e segundos


fun converteAnos(anos: Int) {
    println("$anos anos equivalem a:")
    println("${anos * 12} meses")
    println("${anos * 365} dias")
    println("${anos * 365 * 24} horas")
    println("${anos * 375 * 24 * 60} minutos")
    println("${anos * 365 * 24 * 60 * 60} segundos")
}

fun main() {
    converteAnos(2)
}
// Saída
 2 anos equivalem a:
 24 meses
 730 dias
 17520 horas
 1080000 minutos
 63072000 segundos

Process finished with exit code 0 
