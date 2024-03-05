import kotlin.math.sqrt

fun calcularTrianguloIsosceles(base: Double, lado: Double): Double {
    val altura = sqrt(lado * lado - (base * base / 4))
    return base * altura / 2
}

fun main() {
    val base = 2.0
    val lado = 3.0
    val area = calcularTrianguloIsosceles(base, lado)
    println("A área do triângulo isósceles é: $area")
}