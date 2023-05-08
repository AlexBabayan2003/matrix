fun main() {
    val matrix = listOf(
        listOf(0.0, 0.1, 0.2),
        listOf(1.0, 1.1, 1.2),
        listOf(2.0, 2.1, 2.2)
    )

    val diagonal = List(matrix.size) { i -> matrix[i][i] }
    val antiDiagonal = List(matrix.size) { i -> matrix[i][matrix.size - i - 1] }


    //upper and downer triangles for main diagonal

    val upperTriangle = mutableListOf<List<Double>>()
    val lowerTriangle = mutableListOf<List<Double>>()

    for (i in matrix.indices) {
        for (j in matrix[i].indices) {
            val row1 = mutableListOf<Double>()
            val row2 = mutableListOf<Double>()
            if (j >= i) {
                row1.add(matrix[i][j])
            }
            if (j <= i) {
                row2.add(matrix[i][j])
            }
            if (row1.isNotEmpty()) {
                upperTriangle.add(row1)
            }
            if (row2.isNotEmpty()) {
                lowerTriangle.add(row2)
            }
        }
    }
}




