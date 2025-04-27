import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for matrices
        System.out.print("Enter rows and columns for matrices: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];

        System.out.println("Enter elements of Matrix 1:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix1[i][j] = sc.nextInt();

        System.out.println("Enter elements of Matrix 2:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix2[i][j] = sc.nextInt();

        // Addition
        System.out.println("Addition:");
        int[][] addition = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                addition[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(addition[i][j] + " ");
            }
            System.out.println();
        }

        // Subtraction
        System.out.println("Subtraction:");
        int[][] subtraction = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                subtraction[i][j] = matrix1[i][j] - matrix2[i][j];
                System.out.print(subtraction[i][j] + " ");
            }
            System.out.println();
        }

        // Multiplication
        System.out.println("Multiplication:");
        int[][] multiplication = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                multiplication[i][j] = 0;
                for (int k = 0; k < cols; k++) {
                    multiplication[i][j] += matrix1[i][k] * matrix2[k][j];
                }
                System.out.print(multiplication[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
