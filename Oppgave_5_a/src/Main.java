// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Initialise fraction
        Fraction fraction = new Fraction(5, 2);

        // Output initial divisor and dividend
        System.out.println(fraction.getDividend());
        System.out.println(fraction.getDivisor());
        fraction.addFractions(2, 3);

        // Test each method and check output the dividend and divisor each time
        System.out.println("Result after addition: ");
        System.out.println(fraction.getDividend());
        System.out.println(fraction.getDivisor());

        fraction.subtractFractions(1, 1);

        System.out.println("Result after subtraction: ");
        System.out.println(fraction.getDividend());
        System.out.println(fraction.getDivisor());

        fraction.multiplyFractions(3, 4);

        System.out.println("Result after multiplication: ");
        System.out.println(fraction.getDividend());
        System.out.println(fraction.getDivisor());

        fraction.divideFractions(2, 4);

        System.out.println("Result after division: ");
        System.out.println(fraction.getDividend());
        System.out.println(fraction.getDivisor());
        }
    }
