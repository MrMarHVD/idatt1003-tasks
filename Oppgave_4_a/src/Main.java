// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Initialise currencies and variables
        Valuta dollar = new Valuta(11.0);
        Valuta swedishCrown = new Valuta(0.98);
        Valuta euro = new Valuta(11.8);
        Valuta pound = new Valuta(12.0);
        double amount = 0;

        // Allow user to choose which currency to convert to / from
        String[] options = {"Dollars", "Euros", "Pounds", "Swedish Crowns", "End program"};
        int choice = JOptionPane.showOptionDialog(null, "Choose an option", "Option Dialog",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        JOptionPane.showMessageDialog(null, "You chose " + options[choice] + ".");

        // Ask user for the amount they want to convert
        String input = JOptionPane.showInputDialog("Enter the amount to convert from your currency to NOK: ");

        // Catch errors and prompt again if there are any. If not, parse the input to a double
        try
        {
            amount = Double.parseDouble(input);
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Program ended. ");
        }

        // Convert from currency x to NOK depending on user choice
        if (choice == 0)
        {
            // Convert from dollars to Norwegian crowns and display result
            double conversion = dollar.toNOK(amount);
            JOptionPane.showMessageDialog(null, amount + " dollars is equal to " + conversion + " NOK. ");
        }
        else if (choice == 1) {
            double conversion = euro.toNOK(amount);
            JOptionPane.showMessageDialog(null, amount + " euros is equal to " + conversion + " NOK. ");

        }
        else if (choice == 2) {
            double conversion = pound.toNOK(amount);
            JOptionPane.showMessageDialog(null, amount + " pounds is equal to " + conversion + " NOK. ");

        }
        else if (choice == 3) {
            double conversion = swedishCrown.toNOK(amount);
            JOptionPane.showMessageDialog(null, amount + " Swedish crowns is equal to " + conversion + " NOK. ");
        }

        else {


        }

        }

    }
