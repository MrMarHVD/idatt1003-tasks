package com.mypackage.test;
public final class Matrix
{
    /* This is a class for matrices. You can create a matrix with the constructor (matrix0) which can then be processed
    * using one of the methods below. addMatrix and multiplyMatrix require an additional matrix which you must provide */
    // Class incomplete, make it immutable

    // Initialise matrix
    private final int[][] matrix0 = new int[2][2];


    // Constructor
    public Matrix(int pos00, int pos01, int pos10, int pos11)
    {
        // Assign input values to matrix indices
        matrix0[0][0] = pos00;
        matrix0[0][1] = pos01;

        matrix0[1][0] = pos10;
        matrix0[1][1] = pos11;

    }

    // Get matrix0 in the form of a string displaying its values
    // ToString
    public String getMatrix()
    {
        String upperRow = (matrix0[0][0] + ", " + matrix0[0][1]);
        String lowerRow = (matrix0[1][0] + ", " + matrix0[1][1]);
        return ("Matrix: \n" + upperRow + "\n" + lowerRow);

    }


    // Add matrix1 to matrix0 and return new matrix
    public Matrix addMatrix(Matrix matrix1)
    {

        // Return new matrix with values added
        return new Matrix(matrix0[0][0] + matrix1.matrix0[0][0], matrix0[0][1] + matrix1.matrix0[0][1], matrix0[1][0] + matrix1.matrix0[1][0], matrix0[1][1] + matrix1.matrix0[1][1]);
    }

    // Multiply matrix0 with new matrix and return as third matrix
    // Use for loop and make matrices dynamic
    public Matrix multiplyMatrix(Matrix matrix1)
    {
        // Obtain items in matrix1
        int pos00 = matrix0[0][0] * matrix1.matrix0[0][0] + matrix0[0][1] * matrix1.matrix0[1][0];
        int pos01 = matrix0[0][0] * matrix1.matrix0[0][1] + matrix0[0][1] * matrix1.matrix0[1][1];
        int pos10 = matrix0[1][0] * matrix1.matrix0[0][0] + matrix0[1][1] * matrix1.matrix0[1][0];
        int pos11 = matrix0[1][0] * matrix1.matrix0[0][1] + matrix0[1][1] * matrix1.matrix0[1][1];

        return new Matrix(pos00, pos01, pos10, pos11);


    }

    //  Transpose matrix and return as new instance
    // Make dynamic
    public Matrix transposeMatrix()
    {
        // Temporary variables
        int pos10 = matrix0[0][1];
        int pos11 = matrix0[1][1];
        int pos01 = matrix0[1][0];


        return new Matrix(matrix0[0][0], pos01, pos10, pos11);
    }


}
