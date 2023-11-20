/**
 * Represents a real-estate property.
 *
 * @author Håvard Daleng.
 */
public class Property {

  /**
   * Municipality number of the municipality in which the property is located.
   */
  private final int municipalityNumber;

  /**
   * Name of the municipality in which the property is located.
   */
  private final String municipalityName;

  /**
   * Lot number of the property.
   */
  private final int lotNumber;

  /**
   * Section number of the property.
   */
  private final int sectionNumber;

  /**
   * Name of the property, if it has one.
   */
  private final String name;

  /**
   * Area of the property in square meters.
   */
  private final double area;

  /**
   * Name of the owner of the property.
   */
  private String nameOfOwner;

  /**
   * Parameterized constructor excluding the name of the property.
   *
   * @param nameOfOwner name of the owner.
   * @param municipalityName name of the municipality.
   * @param municipalityNumber municipality number.
   * @param lotNumber lot number.
   * @param sectionNumber section number.
   * @param area area of the property.
   * @throws Exception if the municipality number is outside the valid range.
   */
  public Property(String nameOfOwner, String municipalityName, int municipalityNumber, int lotNumber, int sectionNumber, double area)
      throws Exception {
    this.name = null;
    this.nameOfOwner = nameOfOwner;
    this.municipalityName = municipalityName;
    if (municipalityNumber > 100 && municipalityNumber < 5055) {
      this.municipalityNumber = municipalityNumber;
    }
    else {
      throw new Exception("Invalid Municipality Number.");
    }
    this.lotNumber = lotNumber;
    this.sectionNumber = sectionNumber;
    this.area = area;
  }

  /**
   * Parameterized  constructor including name of the property.
   *
   * @param name name of the property.
   * @param nameOfOwner see above.
   * @param municipalityName see above.
   * @param municipalityNumber see above.
   * @param lotNumber see above.
   * @param sectionNumber see above.
   * @param area see above.
   * @throws Exception see above.
   */
  public Property(String name, String nameOfOwner, String municipalityName, int municipalityNumber, int lotNumber, int sectionNumber, double area)
      throws Exception {
    this.name = name;
    this.nameOfOwner = nameOfOwner;
    this.municipalityName = municipalityName;
    if (municipalityNumber > 100 && municipalityNumber < 5055) {
      this.municipalityNumber = municipalityNumber;
    }
    else {
      throw new Exception("Invalid Municipality Number.");
    }
    this.lotNumber = lotNumber;
    this.sectionNumber = sectionNumber;
    this.area = area;
  }

  /**
   * Get municipality number of the property.
   *
   * @return municipality number.
   */
  public int getMunicipalityNumber() { return this.municipalityNumber; }

  /**
   * Get lot number of the property.
   *
   * @return lot number.
   */
  public int getLotNumber() { return this.lotNumber; }

  /**
   * Get section number of the property.
   *
   * @return section number.
   */
  public int getSectionNumber() { return this.sectionNumber; }

  /**
   * Get name of the property.
   *
   * @return name of the property.
   */
  public String getName() { return this.name; }

  /**
   * Get area of the property.
   *
   * @return area.
   */
  public double getArea() { return this.area; }

  /**
   * Get name of the owner of the property.
   *
   * @return name of the owner.
   */
  public String getNameOfOwner() { return this.nameOfOwner; }

  /**
   * Get name of the municipality.
   *
   * @return name of the municipality.
   */
  public String getMunicipalityName() { return this.municipalityName; }

  /**
   * Convert key information to string format.
   *
   * @return string in the form "municipality number-lot number/section number."
   */
  @Override
  public String toString() {
    return this.municipalityNumber + "-" + this.lotNumber + "/" + this.sectionNumber;

  }

  /**
   * Get name of the owner of the property.@
   *
   * @param name name of the new owner.
   */
  public void setNameOfOwner(String name) {
    this.nameOfOwner = name;
  }

}

