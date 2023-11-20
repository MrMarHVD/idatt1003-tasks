
import java.time.LocalDateTime;

/**
 * Class representing a specific arrangement, including type, location, time and unique ID.
 *
 * @author Håvard Daleng.
 */
public class Arrangement
{

  /**
   * The type of the arrangement. Examples include "concert", "wedding" or "sport".
   * <p>
   */
  private final String type;

  /**
   * The location of the arrangement. Examples include "Oslo", "Bergen" or "Trondheim".
   * <p>
   */
  private final String location;

  /**
   * Time of the arrangement in the format YYYYMMDDHHMM. May also be shorter but should be in the same format. Must be a long.
   * <p>
   */
  private final long time;

  /**
   * Unique ID of the arrangement. Should be a positive integer.
   * <p>
   */
  private final int ID;

  /**
   * Constructor.
   *
   * @param ID unique ID of the arrangement.
   * @param type type of the arrangement.
   * @param location location of the arrangement.
   * @param time time of the arrangement.
   * <p>
   */
  public Arrangement(int ID, String type, String location, long time)
  {
      this.ID = ID;
      this.type = type;
      this.location = location;
      this.time = time;
  }

  /**
   * Getter for the type of arrangement.
   *
   * @return type of the arrangement.
   */
  public String getType() {return this.type; }

  /**
   * Getter for location of the arrangement.
   *
   * @return the location of the arrangement.
   */
  public String getLocation() {return this.location; }

  /**
   * Getter for the time of the arrangement.
   *
   * @return the time of the arrangement.
   */
  public long getTime () {return this.time; }

  /**
   * Getter for the ID of the arrangement.
   * @return the ID of the arrangement.
   */
  public int getID () {return this.ID; }

    /**
     * Decodes the time of the arrangement from a long to a LocalDateTime object.
     *
     * @return LocalDateTime object representing the time of the arrangement.
     */
    public LocalDateTime parseTime() {
        String tempFull1 = Long.toString(this.getTime());
        String year1s = tempFull1.substring(0, 4);
        String month1s = tempFull1.substring(4, 6);
        String day1s = tempFull1.substring(6, 8);
        String hour1s = tempFull1.substring(8, 10);
        String minute1s = tempFull1.substring(10, 12);

        int year1 = Integer.parseInt(year1s);
        int month1 = Integer.parseInt(month1s);
        int day1 = Integer.parseInt(day1s);
        int hour1 = Integer.parseInt(hour1s);
        int minute1 = Integer.parseInt(minute1s);

        return LocalDateTime.of(year1, month1, day1, hour1, minute1);
    }
}
