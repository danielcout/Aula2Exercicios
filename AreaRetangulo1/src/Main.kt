fun calcularRetangulo(comprimento: Double, largura: Double): Double {
    return comprimento * largura
}

fun main() {
    val comprimento = 10.0
    val largura = 5.0
    val area = calcularRetangulo(comprimento, largura)
    println("A área do retângulo é: $area")
}