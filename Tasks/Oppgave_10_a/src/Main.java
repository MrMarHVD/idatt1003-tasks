// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {

    // Create JFrame instance.
    JFrame frame = new JFrame("Arrangement Overview");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(600, 400);
    frame.setLayout(new FlowLayout());

    // Create instance of ArrangementOverview.
    ArrangementOverview overview = new ArrangementOverview();

    // Create GUI components.
    JButton addButton = new JButton("Add Arrangement");
    JButton findByDateButton = new JButton("Find By Date");
    JButton findByIntervalButton = new JButton("Find By Interval");
    JButton findByLocationButton = new JButton("Find By Location");
    JButton sortByTimeButton = new JButton("Sort By Time");
    JButton sortByLocationButton = new JButton("Sort By Location");
    JButton sortByTypeButton = new JButton("Sort By Type");
    JButton sortByIdButton = new JButton("Sort By ID");

    JTextField inputField = new JTextField(20);
    JTextArea outputArea = new JTextArea(10, 40);
    JScrollPane scrollPane = new JScrollPane(outputArea);
    outputArea.setEditable(false);

    // Add components to frame
    frame.add(addButton);
    frame.add(findByDateButton);
    frame.add(findByIntervalButton);
    frame.add(findByLocationButton);
    frame.add(sortByTimeButton);
    frame.add(sortByLocationButton);
    frame.add(sortByTypeButton);
    frame.add(sortByIdButton);
    frame.add(inputField);
    frame.add(scrollPane);

    // ActionListener for adding a new arrangement.
    addButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        // Extract data from inputField, separating by comma.
        String[] values = inputField.getText().split(",");
        Arrangement newArrangement = new Arrangement(Integer.parseInt(values[0].trim()), values[1].trim(), values[2].trim(), Long.parseLong(values[3].trim()));
        overview.registerArrangement(newArrangement);
        outputArea.append("Added new arrangement with ID: " + newArrangement.getID() + "\n");
        inputField.setText("");
      }
    });

    // ActionListener for finding arrangements by date.
    findByDateButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        int date = Integer.parseInt(inputField.getText().trim());
        ArrayList<Integer> arrangementsOnDate = overview.getArrangementsOnDate(date);
        outputArea.append("Arrangements on date " + date + ": " + arrangementsOnDate + "\n");
        inputField.setText("");
      }
    });


    // ActionListener for finding arrangements by interval.
    findByIntervalButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        // Expecting input in the format "time1,time2".
        String[] times = inputField.getText().split(",");
        long time1 = Long.parseLong(times[0].trim());
        long time2 = Long.parseLong(times[1].trim());
        ArrayList<Integer> arrangementsInInterval = overview.getArrangementsWithinInterval(time1, time2);
        outputArea.append("Arrangements between " + time1 + " and " + time2 + ": " + arrangementsInInterval + "\n");
        inputField.setText("");
      }
    });

    // ActionListener for finding arrangements by location
    findByLocationButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String location = inputField.getText().trim();
        ArrayList<Integer> arrangementsInLocation = overview.findArrangementsInLocation(location);
        outputArea.append("Arrangements in location " + location + ": " + arrangementsInLocation + "\n");
        inputField.setText("");
      }
    });

    // ActionListener for sorting by time.
    sortByTimeButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        ArrayList<Integer> sortedByTime = overview.sortByTime();
        outputArea.append("Arrangements sorted by time: " + sortedByTime + "\n");
      }
    });

    // ActionListener for sorting by location.
    sortByLocationButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        ArrayList<Integer> sortedByLocation = overview.sortByLocation();
        outputArea.append("Arrangements sorted by location: " + sortedByLocation + "\n");
      }
    });

    // ActionListener for sorting by type.
    sortByTypeButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        ArrayList<Integer> sortedByType = overview.sortByType();
        outputArea.append("Arrangements sorted by type: " + sortedByType + "\n");
      }
    });

    // As ID is inherent in the order they're added and not explicitly provided as a sort method,
    // we can simply list the arrangements in the order they appear in the ArrayList.
    sortByIdButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        ArrayList<Integer> sortedById = new ArrayList<>();
        for (Arrangement arrangement : overview.arrangements) {
          sortedById.add(arrangement.getID());
        }
        outputArea.append("Arrangements sorted by ID: " + sortedById + "\n");
      }
    });

    // Finalizing JFrame setup
    frame.setVisible(true);
  }
}


/*
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Arrangement arrangement1 = new Arrangement(256, "concert", "Chicago", 201012111800L);
    Arrangement arrangement2 = new Arrangement(257, "sports", "New York", 201012121800L);
    Arrangement arrangement3 = new Arrangement(258, "golf", "Los Angeles", 201006111500L);
    Arrangement arrangement4 = new Arrangement(259, "concert", "San Francisco", 200905071900L);
    ArrangementOverview overview = new ArrangementOverview();
    overview.registerArrangement(arrangement1);
    overview.registerArrangement(arrangement2);
    overview.registerArrangement(arrangement3);
    overview.registerArrangement(arrangement4);

    String locationList = overview.findArrangementsInLocation("Chicago").toString();
    System.out.println("Arrangements in Chicago: " + locationList);

    String sortedByTime = overview.sortByTime().toString();

    System.out.println("Arrangements sorted by time: " + sortedByTime);
    System.out.println("Arrangements sorted by type: " + overview.sortByType());
    System.out.println(
        "Arrangements between 12/11/2010 and 12/12/2010 " + overview.getArrangementsWithinInterval(
            201012111800L, 201012121800L));

    //String[] options = {"Register", "Find arrangements in location", "Find arrangements on date", "Find arrangements in timeframe", "Organise arrangements", "End program"};

        /*
        int choice = JOptionPane.showOptionDialog(null, "Choose an option", "Main option Dialog",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        JOptionPane.showMessageDialog(null, "You chose " + options[choice] + ".");

        if (choice == 0) {

        }

        }
  }
}
*/
