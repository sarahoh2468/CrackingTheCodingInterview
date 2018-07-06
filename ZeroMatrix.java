public class ZeroMatrix {
    /* Write an algorithm such that if an element in an MxM matrix is 0, its entire row and column are set to 0
     */
    public static void zero(int N, int mat[][]) {
        int copy[][] = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                copy[i][j] = mat[i][j];
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (copy[i][j] == 0) {
                    for (int k = 0; k < N; k++) {
                        mat[i][k] = 0;
                        mat[k][j] = 0;
                    }
                }
            }
        }
    }
}