// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import com.mypackage.test.Matrix;

import java.util.Objects;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Program which allows the user to continually multiply or two predefined matrices for as long as they want

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Matrix 1.0, your go-to program for automated matrix arithmetic!");
        System.out.println("This program is for 2 * 2 matrices and we allow addition, transposition and multiplication.");

        Matrix matrix = new Matrix(1, 2, 3, 4);
        Matrix matrix1 = new Matrix(2, 2, 2, 2);
        System.out.println(matrix.getMatrix());

        System.out.println("Would you like to add, multiply or transpose the matrix? Type 'ADD', 'MULTIPLY' or 'TRANSPOSE'");
        String input = scanner.nextLine();

        if (Objects.equals(input, "ADD"))
        {
            Matrix matrix2 = matrix.addMatrix(matrix1);
            System.out.println(matrix2.getMatrix());
        }
        else if (Objects.equals(input, "MULTIPLY"))
        {
            Matrix matrix2 = matrix.multiplyMatrix(matrix1);
            System.out.println(matrix2.getMatrix());
        }
        else if (Objects.equals(input, "TRANSPOSE"))
        {
            Matrix matrix2 = matrix.transposeMatrix();
            System.out.println(matrix2.getMatrix());
        }

        else {
            System.out.println("Error. Program ended.");
        }




        }


    }

