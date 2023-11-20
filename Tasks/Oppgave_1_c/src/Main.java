// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for number
        System.out.println("Please input the total number of seconds you want converted. ");
        int secondsIn = scanner.nextInt();

        // Calculate the total number of hours and the remainder in minutes and seconds
        int hours = secondsIn / 3600;
        int minutes = (secondsIn % 3600) / 60;
        int seconds = secondsIn % 60;

        // Output the hours, minutes and seconds to the console
        System.out.println("Thank you. That amounts to " + hours + " hour(s), " + minutes + " minute(s), and " + seconds + " second(s). ");
        }
    }
