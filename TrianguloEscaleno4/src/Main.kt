import kotlin.math.sqrt

fun calcularTrianguloEscaleno(a: Double, b: Double, c: Double): Double {
    // Calculando o semiperímetro
    val s = (a + b + c) / 2

    // Aplicando a fórmula de Heron para calcular a área
    val area = sqrt(s * (s - a) * (s - b) * (s - c))

    return area
}

fun main() {
    val ladoA = 5.0
    val ladoB = 10.0
    val ladoC = 10.0
    val area = calcularTrianguloEscaleno(ladoA, ladoB, ladoC)
    println("A área do triângulo escaleno é: $area")
}