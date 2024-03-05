fun calcularLosango(diagonalMaior: Double, diagonalMenor: Double): Double {
    return (diagonalMaior * diagonalMenor) / 2
}

fun main() {
    val diagonalMaior = 5.0
    val diagonalMenor = 2.0
    val area = calcularLosango(diagonalMaior, diagonalMenor)
    println("A área do losango é: $area")
}
