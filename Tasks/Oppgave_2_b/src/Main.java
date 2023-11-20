// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    // Program to calculate the difference in price per kilogram between two products
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.##");

        // Calculate price per kilogram of product 1
        double price1PerKG = (35.90 / 450) * 1000;

        // Calculate price per kilogram of product 2
        double price2PerKG = (39.50 / 500) * 1000;

        // Round down the values of the variables
        double difference1 = Double.parseDouble(df.format(price1PerKG - price2PerKG));
        double difference2 = Double.parseDouble(df.format(price2PerKG - price1PerKG));

        // Check if product 1 or 2 is more expensive or equal in price, and output a message accordingly
        if (price1PerKG == price2PerKG) {
            System.out.println("The price per kilogram of the two products is equal. ");
        }
        else if (price1PerKG < price2PerKG) {
            System.out.println("The price of product 1 per kilogram is equal to " + Double.parseDouble(df.format(price1PerKG)) + " and the price of product 2 per kilogram is equal to " + Double.parseDouble(df.format(price2PerKG)) + ". Therefore, product 2 is more expensive by " + difference2 + " units of currency.");
        }
        else {
            System.out.println("The price of product 1 per kilogram is equal to " + Double.parseDouble(df.format(price1PerKG)) + " and the price of product 2 per kilogram is equal to " + Double.parseDouble(df.format(price2PerKG)) + ". Therefore, product 1 is more expensive by " + difference1 + " units of currency.");
        }

        }
    }
