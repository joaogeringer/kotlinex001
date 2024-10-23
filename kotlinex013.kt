
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

fun bonusWhen(cargo: String): Float {
    return  when (cargo) {
        "gerente" -> 2000f
        "coordenador" -> 1500f
        "engenheiro" -> 1000f
        "estagiario" -> 500f
        else -> 0f
    }
}

fun main() {

}
