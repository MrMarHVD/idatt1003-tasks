public class Fraction {

    // Fields
    int divisor;
    int dividend;

    // Constructor for divisor and dividend
    public Fraction(int dividend, int divisor) {
        if (divisor == 0)
        {
            throw new IllegalArgumentException();
        }
        else 
        {
            this.dividend = dividend;
            this.divisor = divisor;
        }
    }

    // Constructor for just dividend
    public Fraction(int dividend) {
        this.dividend = dividend;
        this.divisor = 1;


    }

    // Get
    public int getDivisor() {
        return divisor;
    }

    public int getDividend() {
        return dividend;
    }

    // Add two fractions
    public void addFractions(int dividend1, int divisor1) {
        this.dividend = this.dividend  + dividend1;
        this.divisor = this.divisor + divisor1;
    }

    // Subtract two fractions
    public void subtractFractions(int dividend1, int divisor1) {
        this.dividend = this.dividend - dividend1;
        this.divisor = this.divisor - divisor1;
    }

    // Multiply two fractions
    public void multiplyFractions(int dividend1, int divisor1) {
        this.dividend = this.dividend * dividend1;
        this.divisor = this.divisor * divisor1;
    }

    // Divide two fractions
    public void divideFractions(int dividend1, int divisor1) {
        this.dividend = this.dividend / dividend1;
        this.divisor = this.divisor / divisor1;
    }





}
