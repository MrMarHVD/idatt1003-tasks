import java.util.ArrayList;
import java.util.Collections;
import java.time.LocalDateTime;

/**
 * Represents an overview of arrangements, allowing for various operations.
 *
 * @author Håvard Daleng.
 */
public class ArrangementOverview {

  /**
   * List of arrangements in the overview.
   */
  final ArrayList<Arrangement> arrangements;

  /**
   * Default constructor.
   */
  public ArrangementOverview() {
      this.arrangements = new ArrayList<Arrangement>();
  }

  /**
   * Register a new arrangement.
   *
   * @param arrangement to register.
   */
  public void registerArrangement(Arrangement arrangement) {
      this.arrangements.add(arrangement);
  }

  /**
   * Obtain a list of arrangements in a given location.
   *
   * @param location string representing the location checked for.
   * @return list of the arrangements found to be in location.
   */
  public ArrayList<Integer> findArrangementsInLocation(String location) {
    ArrayList<Integer> arrangementsInLocation = new ArrayList<>();

    for (Arrangement arrangement : this.arrangements) {
      if (arrangement.getLocation().equals(location)) {
        arrangementsInLocation.add(arrangement.getID());
      }
    }
    return arrangementsInLocation;
  }

  /**
   * Find arrangements on a given date.
   *
   * @param time an integer of arbitrary length representing time.
   * @return list of arrangements found to be on the given date.,
   */
  public ArrayList<Integer> getArrangementsOnDate(int time) {
    ArrayList<Integer> arrangementsOnDate = new ArrayList<>();
    String tempString = Integer.toString(time);
    tempString = tempString.substring(0, 8);
    int date = Integer.parseInt(tempString);

    // Check if every given arrangement in overview is on given date
    for (Arrangement arrangement : arrangements) {

      String tempString2 = Long.toString(arrangement.getTime());
      tempString2 = tempString2.substring(0, 8);
      int date2 = Integer.parseInt(tempString2);
      if (date == date2) {
          arrangementsOnDate.add(arrangement.getID());
      }
    }

    return arrangementsOnDate;
  }

  /**
   * Find the arrangements within a given time interval by their IDs.
   *
   * @param time1 starting point.
   * @param time2 end point.
   * @return list of the arrangements within the interval.
   */
  public ArrayList<Integer> getArrangementsWithinInterval(long time1, long time2) {
    ArrayList<Arrangement> arrangementsWithinInterval = new ArrayList<>();
    ArrayList<Integer> arrangementIDsWithinInterval = new ArrayList<>();
    String tempFull1 = Long.toString(time1);
    String tempFull2 = Long.toString(time2);

    int year1 = Integer.parseInt(tempFull1.substring(0, 4));
    int year2 = Integer.parseInt(tempFull2.substring(0, 4));
    int month1 = Integer.parseInt(tempFull1.substring(4, 6));
    int month2 = Integer.parseInt(tempFull2.substring(4, 6));
    int day1 = Integer.parseInt(tempFull1.substring(6, 8));
    int day2 = Integer.parseInt(tempFull2.substring(6, 8));
    int hour1 = Integer.parseInt(tempFull1.substring(8, 10));
    int hour2 = Integer.parseInt(tempFull2.substring(8, 10));
    int minute1 = Integer.parseInt(tempFull1.substring(10, 12));
    int minute2 = Integer.parseInt(tempFull2.substring(10, 12));

    LocalDateTime startTime = LocalDateTime.of(year1, month1, day1, hour1, minute1);
    LocalDateTime endTime = LocalDateTime.of(year2, month2, day2, hour2, minute2);

    for (Arrangement arrangement : arrangements) {
      LocalDateTime checkTime = arrangement.parseTime();
      if ((checkTime.compareTo(startTime) >= 0) && (checkTime.compareTo(endTime)) <= 0) {
        arrangementsWithinInterval.add(arrangement);
      }
    }

    // Sort arrangements by time.
    arrangementsWithinInterval.sort((a1, a2) -> Long.compare(a1.getTime(), a2.getTime()));

    // Add IDs to list and return.
    for (Arrangement arrangement : arrangementsWithinInterval) {
      arrangementIDsWithinInterval.add(arrangement.getID());
    }

    return arrangementIDsWithinInterval;
  }

  /**
   * Sorts all arrangements by time in the format of their IDs.
   *
   * @return list of IDs by time, starting with the first arrangement.
   */
  public ArrayList<Integer> sortByTime() {
    ArrayList<Arrangement> sortedArrangements = new ArrayList<>();
    Arrangement comparison = new Arrangement(0, "", "", 190001010000L);
    sortedArrangements.add(comparison);

    for (Arrangement arrangement : arrangements) {
      LocalDateTime arrangementTime = arrangement.parseTime();

      // Find first existing arrangement1 which arrangement is before and add it before
      for (Arrangement arrangement1 : sortedArrangements) {
        if (arrangementTime.isBefore(arrangement1.parseTime())) {
          sortedArrangements.add(sortedArrangements.indexOf(arrangement1), arrangement);
          break;
        }
      }

      // If arrangement is after all other arrangements, add it after all other arrangements
      if (!sortedArrangements.contains(arrangement)) {
        sortedArrangements.add(arrangement);
      }
    }

    sortedArrangements.remove(comparison);
    comparison = null;

    // Make new list containing the IDs of the respective arrangements
    ArrayList<Integer> sortedArrangementIDs = new ArrayList<>();
    for (Arrangement arrangement : sortedArrangements) {
      sortedArrangementIDs.add(arrangement.getID());
    }
    return sortedArrangementIDs;
  }

  /**
   * Sort arrangements by their location.
   *
   * @return list of IDs of arrangements sorted by location.
   */
  public ArrayList<Integer> sortByLocation() {
      ArrayList<Arrangement> sortedArrangements = new ArrayList<>(arrangements);
      sortedArrangements.sort((a1, a2) -> a1.getLocation().compareTo(a2.getLocation()));
      ArrayList<Integer> sortedArrangementIDs = new ArrayList<>();
      for (Arrangement arrangement : sortedArrangements) {
          sortedArrangementIDs.add(arrangement.getID());
      }

      return sortedArrangementIDs;
  }

  /**
   * Sorts arrangements alphabetically by type using their IDs
   *
   * @return list of arrangement IDs
   */
  public ArrayList<Integer> sortByType() {
      ArrayList<Arrangement> sortedArrangements = new ArrayList<>(arrangements);
      sortedArrangements.sort((a1, a2) -> a1.getType().compareTo(a2.getType()));
      ArrayList<Integer> sortedArrangementIDs = new ArrayList<>();
      for (Arrangement arrangement : sortedArrangements) {
          sortedArrangementIDs.add(arrangement.getID());

      }
      return sortedArrangementIDs;
  }
}
