import java.util.Scanner;

public class MatrixMultiplicationExample {

  public static void main(String args[]) {
    int row1, col1, row2, col2;
    Scanner s = new Scanner(System.in);

    // Input dimensions of First Matrix: A
    System.out.print("Enter number of rows in first matrix: ");
    row1 = s.nextInt();

    System.out.print("Enter number of columns in first matrix: ");
    col1 = s.nextInt();

    // Input dimensions of second matrix: B
    System.out.print("Enter number of rows in second matrix: ");
    row2 = s.nextInt();

    System.out.print("Enter number of columns in second matrix: ");
    col2 = s.nextInt();

    // Requirement check for matrix multiplication
    if (col1 != row2) {
      System.out.println("Matrix multiplication is not possible");
      return;
    }

    int a[][] = new int[row1][col1];
    int b[][] = new int[row2][col2];
    int c[][] = new int[row1][col2];

    // Input the values of matrices
    System.out.println("\nEnter values for matrix A : ");
    for (int i = 0; i < row1; i++) {
      for (int j = 0; j < col1; j++) a[i][j] = s.nextInt();
    }
    System.out.println("\nEnter values for matrix B : ");
    for (int i = 0; i < row2; i++) {
      for (int j = 0; j < col2; j++) b[i][j] = s.nextInt();
    }

    // Perform matrix multiplication
    // Using for loop
    System.out.println("\nMatrix multiplication is : ");
    for (int i = 0; i < row1; i++) {
      for (int j = 0; j < col2; j++) {
        // Initialize the element C(i,j) with zero
        c[i][j] = 0;

        // Dot product calculation
        for (int k = 0; k < col1; k++) {
          c[i][j] += a[i][k] * b[k][j];
        }
        
        System.out.print(c[i][j] + " ");
      }
      System.out.println();
    }
  }
}



























/*
MapReduce is a technique in which a huge program is subdivided into small tasks and run parallelly 
to make computation faster, save time, and mostly used in distributed systems. It has 2 important parts: 

    Mapper: It takes raw data input and organizes into key, value pairs. 
            For example, In a dictionary, you search for the word “Data” and its associated meaning is 
            “facts and statistics collected together for reference or analysis”. Here the Key is Data and 
            the Value associated with is facts and statistics collected together for reference or analysis.
    Reducer: It is responsible for processing data in parallel and produce final output.
