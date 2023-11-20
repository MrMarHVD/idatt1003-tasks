// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int integer = MinRandom.nextInteger(90, 128);


        int doubleUpperBound = 65;
        int doubleLowerBound = 3;
        double decimal = 0;

        // Keep printing the result of the transformation until a result close enough to the upper limit is obtained
        while (decimal < (doubleUpperBound - 0.1)) {
            decimal = MinRandom.nextDouble(doubleLowerBound, doubleUpperBound);

            // Print an error if result is outside of intended bounds
            if (decimal < doubleLowerBound || decimal > doubleUpperBound ) {
                System.out.println("Error!");
            }

            // Print last result
            System.out.println(decimal);

        }


        }
    }
