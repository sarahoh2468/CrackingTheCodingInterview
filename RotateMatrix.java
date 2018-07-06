import static java.lang.Math.abs;

public class RotateMatrix {
    /* Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, write a method to
    rotate the image by 90 degrees
     */
    public static void rotate(int N, int mat[][]) {
        int new_j; int new_i;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    new_j = abs(j - (N-1));
                    mat[i][j] = mat[i][new_j];
                }
                else {
                    new_i = abs(i - (N-1));
                    mat[i][j] = mat[new_i][j];
                }
            }
        }
    }
}
