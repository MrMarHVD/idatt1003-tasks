// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class Main {
    // Program which takes user input and checks if it is a prime repeatedly
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = -1;

        // Loop question asking user for number and output according to whether that number is a prime. End program if user inputs 0
        while (number != 0) {
            System.out.println("Please input an integer. If you want the program to stop, input 0. ");
            number = scanner.nextInt();
            if (isPrime(number)) {
                System.out.println(number + " is a prime!");

            } else {
                System.out.println(number + " is not a prime!");
            }
        }

    }
    // Method which checks for primes
    public static boolean isPrime(int n) {
        // 0 and 1 are not prime numbers
        if(n <= 1) {
            return false;
        }

        // 2 is the smallest prime number
        if(n == 2) {
            return true;
        }

        // even numbers other than 2 are not prime
        if(n % 2 == 0) {
            return false;
        }

        // check for factors up to the square root of n
        for(int i = 3; i <= Math.sqrt(n); i += 2) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }
}