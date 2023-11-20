import java.util.Objects;
import java.util.Scanner;

/**
 * Controls the user interface of the property register application.
 *
 * @author Håvard Daleng.
 */
public class PropertyRegisterUI {

  /**
   * Register for which the UI is applied.
   */
  private final PropertyRegister register;

  /**
   * Constructor for the register UI.
   *
   * @param register register for which the UI is applied.
   */
  public PropertyRegisterUI(PropertyRegister register) {
    this.register = register;
  }

  /**
   * Show the initial menu and ask the user what they want to do.
   *
   * @return integer representing user's desired result.
   */
  public int showMenu() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Property Register Control v1.0. ");

    System.out.println("1. Add property");
    System.out.println("2. List all properties");
    System.out.println("3. Search property");
    System.out.println("4. Calculate average area");

    int output = sc.nextInt();
    if (output > 4 || output < 1) {
      output = 9;
    }
    return output;
  }

  /**
   * Add a property to the register.
   *
   * @throws Exception if the inputs from the users do not define a valid property.
   */
  public void addProperty() throws Exception {
    Scanner sc = new Scanner(System.in);

    System.out.println("What is the name of the owner of the property? ");
    String nameOfOwner = sc.nextLine();
    System.out.println("What is the name of the municipality? ");
    String municipality = sc.nextLine();
    System.out.println("What is the municipality number? ");
    int municipalityNumber = sc.nextInt();
    System.out.println("What is the lot number? ");
    int lotNumber = sc.nextInt();
    System.out.println("What is the section number? ");
    int sectionNumber = sc.nextInt();
    System.out.println("What is the area? ");
    double area = sc.nextDouble();
    System.out.println("Does the property have a name? If so, write the name. Otherwise, write 'No'");
    String response = sc.nextLine();
    sc.nextLine();

    Property newProperty;
    if (Objects.equals(response, "No")) {
      newProperty = new Property(nameOfOwner, municipality, municipalityNumber, lotNumber, sectionNumber, area);
    }
    else {
      newProperty = new Property(response, nameOfOwner, municipality, municipalityNumber, lotNumber, sectionNumber, area);
    }
    this.register.registerProperty(newProperty);
    System.out.println("Property added! ");
  }

  /**
   * List the properties in the register.
   */
  public void listProperties() {
    System.out.println("Here is a list of the properties registered: ");
    System.out.println(this.register.getAllProperties());
  }

  /**
   * Search for and output a specific property by municipality, lot and section numbers.
   */
  public void searchProperties() {
    Scanner sc = new Scanner(System.in);
    System.out.println("What is the municipality number?");
    int municipalityNumber = sc.nextInt();

    System.out.println("What is the lot number?");
    int lotNumber = sc.nextInt();

    System.out.println("What is the section number?");
    int sectionNumber = sc.nextInt();

    Property result = this.register.search(municipalityNumber, lotNumber, sectionNumber);

    if (result == null) {
      System.out.println("No such property was found. ");
    }
    else {
      System.out.println("The property in question is " + result.toString());
    }
  }

  /**
   * Calculate and output average area of the properties in the register.
   */
  public void calculateArea() {
    System.out.println("The mean area is: " + this.register.calculateAverageArea());
  }

  /**
   * Maps user input to a desired result.
   *
   * @throws Exception if addProperty() results in an exception.
   */
  public void start() throws Exception {
    boolean terminate = false;

    final int ADD_PROPERTY = 1;
    final int LIST_PROPERTIES = 2;
    final int SEARCH_PROPERTY = 3;
    final int CALCULATE_AREA = 4;
    final int TERMINATE_PROGRAM = 9;

    while (!terminate) {
      int menuChoice = this.showMenu();

      switch (menuChoice) {
        case ADD_PROPERTY:
          this.addProperty();
          break;

        case LIST_PROPERTIES:
          this.listProperties();
          break;

        case SEARCH_PROPERTY:
          this.searchProperties();
          break;

        case CALCULATE_AREA:
          this.calculateArea();
          break;

        case TERMINATE_PROGRAM:
          terminate = true;
      }
    }
  }

}
