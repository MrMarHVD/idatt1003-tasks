// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
//import com.mypackage.test.Matrix;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student john = new Student("John",3);
        Student percy = new Student("Percy", 2);
        Student percival = new Student("Percival", 9);

        TaskOverview overview = new TaskOverview();

        System.out.println(john.getName());
        System.out.println(john.getNumOfTasks());
        overview.registerStudent(john);
        overview.registerStudent(percy);
        overview.incrementNumOfTasks(john, 1);

        System.out.println(john.getNumOfTasks());
        System.out.println(overview.toString());
        System.out.println(overview.getNumOfStudents());

        boolean terminate = false;

        /*while (!terminate) {
          System.out.println("What would you like to do?");
          System.out.println("1: Add student");
          System.out.println("2: Get name of student");
        }*/

    }
}