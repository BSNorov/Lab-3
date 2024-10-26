public class Task4 {

    public static void main(String[] args) {
        int M = 4;
        int N = 5;

        int[][] matrix = createMatrix(M, N);

        System.out.println("Сформированная матрица:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] createMatrix(int M, int N) {
        int[][] matrix = new int[M][N];

        for (int i = 0; i < M; i++) {
            int value = 10 * (i + 1);
            for (int j = 0; j < N; j++) {
                matrix[i][j] = value;
            }
        }

        return matrix;
    }
}
