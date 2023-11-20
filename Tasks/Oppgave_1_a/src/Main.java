// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
// import static javax.swing.JOptionPane.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the number of inches you want converted. ");
        double inches = scanner.nextDouble();
        double centimeters = inches * 2.54;

        System.out.println(inches + " inches is equal to " + centimeters + " centimeters. ");
        }
    }
