// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Person person1 = new Person("John", "Smith", 1968);
        Worker john = new Worker(person1, 0, 1990, 90000, 0.25);
        String[] options = {"ID", "Tax Rate", "Year Hired", "Salary", "End program"};

        boolean terminate = false;

        // Run loop for as long as the user wants to make changes
        while (!terminate)
        {

            // Ask user what they want to to at the beginning of each loop and use the input to determine action

            int choice = JOptionPane.showOptionDialog(null, "Choose what parameter you want to change", "Option Dialog",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            JOptionPane.showMessageDialog(null, "You chose " + options[choice] + ".");

            // Redefine chosen parameter
            switch (choice)
            {
                case 0:
                    String input0 = JOptionPane.showInputDialog("Enter the new ID. ");

                    // Catch errors
                    try
                    {
                        int newID = Integer.parseInt(input0);
                        john.setWorkerNumber(newID);
                        JOptionPane.showMessageDialog(null, "New ID " + john.getWorkerNumber());
                    }
                    catch (NumberFormatException e)
                    {
                        JOptionPane.showMessageDialog(null, "Invalid input. Program ended. ");
                    }
                    break;


                case 1:
                    String input1 = JOptionPane.showInputDialog("Enter the new tax rate in decimal format. ");

                    // Catch errors
                    try
                    {
                        double newRate = Double.parseDouble(input1);
                        john.setTaxRate(newRate);
                        JOptionPane.showMessageDialog(null, "New tax rate: " + john.getTaxRate());
                    }
                    catch (NumberFormatException e)
                    {
                        JOptionPane.showMessageDialog(null, "Invalid input. Program ended ");
                    }
                    break;


                case 2:
                    String input2 = JOptionPane.showInputDialog("Enter the year hired. ");

                    // Catch errors
                    try
                    {
                        int newYear = Integer.parseInt(input2);
                        john.setYearHired(newYear);
                        JOptionPane.showMessageDialog(null, "New year hired: " + john.getYearHired());
                    }
                    catch (NumberFormatException e)
                    {
                        JOptionPane.showMessageDialog(null, "Invalid input. Program ended. ");
                    }
                    break;

                case 3:
                    String input3 = JOptionPane.showInputDialog("Enter the new salary. ");

                    // Catch errors
                    try
                    {
                        int newSalary = Integer.parseInt(input3);
                        john.setSalary(newSalary);
                        JOptionPane.showMessageDialog(null, "New salary: " + john.getSalary());
                    }
                    catch (NumberFormatException e)
                    {
                        JOptionPane.showMessageDialog(null, "Invalid input. Program ended. ");
                    }
                    break;
                case 4:
                    terminate = true;

            }
        }


        /*
        Person person1 = new Person("John", "Smith", 1960);
        Worker john = new Worker(person1, 368, 1990, 70000, 0.25);

        // Test setter methods
        john.setSalary(80000);
        john.setTaxRate(0.8);
        john.setWorkerNumber(299);
        john.setYearHired(1981);

        // Get values
        System.out.println("Age: " + john.getAge());
        System.out.println("Annual income: " + john.getAnnualIncome());
        System.out.println("Salary: " + john.getSalary());
        System.out.println("Name: " + john.getName());
        System.out.println("Worker ID: " + john.getWorkerNumber());
        System.out.println("Years since hired: " + john.yearsSinceHired());

         */

    }
}