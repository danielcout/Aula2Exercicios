fun calcularTrapezio(baseMaior: Double, baseMenor: Double, altura: Double): Double {
    return ((baseMaior + baseMenor) * altura) / 2
}

fun main() {
    val baseMaior = 4.0
    val baseMenor = 4.0
    val altura = 4.0
    val area = calcularTrapezio(baseMaior, baseMenor, altura)
    println("A área do trapézio é: $area")
}
