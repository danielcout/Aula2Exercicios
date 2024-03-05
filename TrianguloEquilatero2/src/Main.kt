import kotlin.math.sqrt

fun calcularTrianguloEquilatero(lado: Double): Double {
    return (sqrt(3.0) / 4) * lado * lado
}

fun main() {
    val lado = 5.0
    val area = calcularTrianguloEquilatero(lado)
    println("A área do triângulo equilátero é: $area")
}