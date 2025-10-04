package assignments.mod1_assignment;
public class Q27 {
        public static void main(String[] args) {
            int[][] A = {
                    {1, 2},
                    {3, 4}
            };

            int[][] B = {
                    {5, 6},
                    {7, 8}
            };
            System.out.println("Matrix Addition:");
            int[][] sum = new int[2][2];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    sum[i][j] = A[i][j] + B[i][j];
                    System.out.print(sum[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("\nMatrix Multiplication:");
            int[][] product = new int[2][2];
            for (int i = 0; i < 2; i++) {          // row of A
                for (int j = 0; j < 2; j++) {      // column of B
                    product[i][j] = 0;
                    for (int k = 0; k < 2; k++) {  // A's col & B's row
                        product[i][j] += A[i][k] * B[k][j];
                    }
                    System.out.print(product[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

