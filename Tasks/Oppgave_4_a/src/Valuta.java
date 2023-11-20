public class Valuta {
    // Fields
    private double value;

    // Parameterized constructor
    public Valuta(double value)
    {
        this.value = value;
    }

    // Get / set
    public double getValue() {
        return value;
    }

    public void setValue(double startValue) {
        this.value = startValue;
    }


    // Converts from any currency to NOK
    public double toNOK(double amount)
    {
        return (double)amount * this.value;
    }

    // Converts from NOK to any currency
    public double toThisCurrency(double amountNOK)
    {
        return (double)amountNOK / this.value;
    }
}
