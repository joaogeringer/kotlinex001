// outra alterantiva de resolução para o exercicio 011, arquivo anterior

fun bonus(cargo: String): Float {
    var bonus: Float = 0f
    if (cargo == "gerente") {
        return 2000f
    }
    else if (cargo == "coordenador") {
        return 1500f
    }
    else if (cargo == "engenheiro") {
        return 1000f
    }
    else if (cargo == "estagiario") {
        return 500f
    }
    return bonus
}

fun main() {
    val bonus = bonus("gerente")
    println(bonus)
}
