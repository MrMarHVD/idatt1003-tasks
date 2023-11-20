import java.util.ArrayList;
import java.util.Arrays;

/**
 * Represents a property registry.
 *
 * @author Håvard Daleng
 */
public class PropertyRegister {

  /**
   * List of all properties registered.
   *
   * Here we are using ArrayList since we do not know
   * the final number of properties that may need to be registered.
   */
  private final ArrayList<Property> properties;

  /**
   * Constructor with arbitrary number of properties.
   *
   * @param properties properties to add separated by a comma.
   */
  public PropertyRegister(Property... properties) {
    this.properties = new ArrayList<>(Arrays.asList(properties));
  }

  /**
   * Register a new property.
   *
   * @param property property to be registered.
   */
  public void registerProperty(Property property) {
    this.properties.add(property);
  }

  /**
   * Remove a property from the registry.
   *
   * @param property property to be removed.
   * @throws Exception if the property is not in the registry.
   */
  public void removeProperty(Property property) throws Exception {
    if  (this.properties.contains(property)) {
      this.properties.remove(property);
    }
    else {
      throw new Exception("No such property in the registry.");
    }
  }


  /**
   * Get properties in the registry as a string array in the format given by the toString-method.
   *
   * @return properties as list of strings.
   */
  public ArrayList<String> getAllProperties() {
    ArrayList<String> properties = new ArrayList<>();

    for (Property property : this.properties) {
      properties.add(property.toString());
    }
    return properties;
}

  /**
   * Get the total number of properties in the registry.
   *
   * @return number of properties.
   */
  public int getNumberOfProperties() { return this.properties.size(); }

  /**
   * Calculate average area of all properties in the registry.
   *
   * @return average area as double.
   */
  public double calculateAverageArea() {
    double sum = 0;
    int i = 0;
    for (Property property : this.properties) {
      sum += property.getArea();
      i++;
    }
    sum = sum / i;
    return sum;
  }

  /**
   * Search for a property based on its municipality, lot and section numbers.
   *
   * @param municipalityNumber desired municipality number.
   * @param lotNumber desired lot number.
   * @param sectionNumber desired section number.
   * @return property if it exists, null if conditions not met.
   */
  public Property search(int municipalityNumber, int lotNumber, int sectionNumber) {
    for (Property property : this.properties) {
      if (municipalityNumber == property.getMunicipalityNumber() && lotNumber == property.getLotNumber() && sectionNumber == property.getSectionNumber()) {
        return property;
      }
    }
    return null;
  }

}
