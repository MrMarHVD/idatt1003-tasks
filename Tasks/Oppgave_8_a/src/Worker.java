//import java.util.GregorianCalendar;
import java.time.Year;

public class Worker
{
    /*
    Lag en klasse ArbTaker med attributter personalia (datatype Person), arbtakernr, ansettelsesår,
månedslønn og skatteprosent. I tillegg til get-metoder for alle attributtene og set-metoder for å
endre attributter som det er naturlig at bør kunne forandres, skal klassen tilby operasjoner som
finner ut
• Hvor mange kroner arbeidstakeren trekkes i skatt per måned;
• Bruttolønn per år;
• Skattetrekk per år. Husk at juni er skattefri og i desember betales halv skatt;
• Navn på formen: etternavn, fornavn, eksempel: Johnsen, Berit;
• Alder;
• Antall år ansatt i bedriften;
• Om personen har vært ansatt mer enn et gitt antall år (parameter);
     */
    // JavaDOC

    // Fields
    private int workerNumber;
    private int yearHired;
    private int salary;
    private double taxRate;
    private Person person;



    // Constructor
    public Worker(Person person, int ID, int yearHired, int salary, double taxRate)
    {
        this.person = person;
        this.workerNumber = ID;
        this.yearHired = yearHired;
        this.salary = salary;
        this.taxRate = taxRate;
    }

    // Get ID
    public int getWorkerNumber() { return this.workerNumber; }

    // Get year hired
    public int getYearHired() { return this.yearHired; }

    // Get salary
    public int getSalary() { return this.salary; }

    // Get tax rate
    public double getTaxRate() { return this.taxRate; }

    // Get person name
    public String getName() { return this.person.getGivenName() + " " + this.person.getSurname(); }

    // Set ID
    public void setWorkerNumber(int number) { this.workerNumber = number; }
    // Set year hired
    public void setYearHired(int year) { this.yearHired = year; }
    // Set salary
    public void setSalary(int salary) { this.salary = salary; }
    // Set tax rate
    public void setTaxRate(double taxRate) { this.taxRate = taxRate; }

    // Return the gross annual income of the worker
    public int getAnnualIncome()
    {
        return this.salary * 12;
    }

    // Return how much the worker pays in taxes
    public double getAnnualTaxAmount()
    {
        return (salary * taxRate) * 10 + (salary * taxRate) / 2;
    }



    // Return the age of the person in question
    public int getAge()
    {
        int currentYear = Year.now().getValue();
        return currentYear - this.person.getBirthYear();
    }

    // Return number of years the worker has worked in their current company
    public int yearsSinceHired()
    {
        int currentYear = Year.now().getValue();
        return currentYear - this.yearHired;
    }

    // Return whether or not the worker has been working at the current company for x years
    public boolean hiredFor(int years)
    {
        if (years <= this.yearsSinceHired())
        {
            return true;
        }
        else
        {
            return false;
        }

    }


}
