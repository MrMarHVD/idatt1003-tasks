public final class Person {

    // Fields
    private final String givenName;
    private final String surname;
    private final int birthYear;

    // Constructor
    public Person(String givenName, String surname, int birthYear)
    {
        this.givenName = givenName;
        this.surname = surname;
        this.birthYear = birthYear;
    }

    // Get given name
    public String getGivenName() { return this.givenName;}

    // Get surname
    public String getSurname() {return this.surname;}

    // Get birth year
    public int getBirthYear() {return this.birthYear;}
}
