// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Take in the number of hours, minutes and seconds and store in variables
        System.out.println("Please input the number of hours you want converted. ");
        int hours = scanner.nextInt();
        System.out.println("Thank you. Now please input the number of additional minutes you want converted. ");
        int minutes = scanner.nextInt();
        System.out.println("Thank you. Now please input the number of additional seconds you want converted. ");
        int seconds = scanner.nextInt();

        // Calculate the total number of seconds
        int secondsTotal = (hours * 3600) + (minutes * 60) + seconds;
        // Output the total number of seconds
        System.out.println("The total number of seconds is equal to " + secondsTotal);

        }
    }
