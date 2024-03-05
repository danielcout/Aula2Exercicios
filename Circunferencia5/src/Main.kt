import kotlin.math.PI

fun calcularCircunferencia(raio: Double): Double {
    return PI * raio * raio
}

fun main() {
    val raio = 7.0
    val area = calcularCircunferencia(raio)
    println("A área da circunferência é: $area")
}