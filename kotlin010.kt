// if else review
fun maiorDeIdade(idade: Int) {
    if (idade > 18) {
        println("maior de idade")

        if (idade > 60) {
            println("terceira idade")
        }

    } else if ( idade < 10) {
        println("criança")
    } else {
        println("menor de idade")
    }
}

fun saudacao(dia: Boolean):String {
    return if (dia) {
        "bom dia"
    } else {
        "boa noite"
    }
}

fun main() {
    maiorDeIdade(19)
    maiorDeIdade(15)
}
