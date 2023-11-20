// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;


public class Main
{

    //using System;
    public static void main(String[] args) {
    Greetings.printHelloWorld();

    // Create humans
        /*
    Human person1 = new Human("Blue", 20, 185);
    Human person2 = new Human("Green", 24, 172);
    Human person3 = new Human("Brown", 38, 192);
    Human person4 = new Human();

    // Output select information about humans and test for changes
    System.out.println("Height of person 1: " + person1.getAge());
    System.out.println("Height of person 4: " + person4.getHeight());
    person1.setAge(25);
    System.out.println(person1.getAge()); */

    Triangle triangle1 = new Triangle(10.0, 10.0);

    System.out.println(triangle1.getArea());
    System.out.println(triangle1.getCircumference());
    }
}
