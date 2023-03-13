public class BidimensionalArray {
    public static void main(String[] args) {
       
        // Matriz de 3x5 (los elementos de la segunda dimensión pueden
        // ser de distintas longitudes, no es necesario que sean iguales)
        int[][] numericMatrix = {
                {11,12,13},
                {21,22,23},
                {31,32,33},
                {41,42,43},
                {51,52,53}
        };

        for (int i=0; i < numericMatrix.length; i++)
            for (int j=0; j < numericMatrix[i].length; j++)
                System.out.printf("Valor en posición [%d, %d]: %d %n", i, j, numericMatrix[i][j]);
            
    }
}

