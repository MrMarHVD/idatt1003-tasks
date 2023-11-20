/*
De eneste klassene nødvendige for å oppfylle kravene i oppgaven er klassene Property
og PropertyRegister. Ved å samle Property-objekter til en instanse av PropertyRegister
som kan håndtere eiendommer og deres assosierte data i tråd med oppgaven kan alle kravene oppfylles.
 */

public class Main {

  public static void main(String[] args) throws Exception {

    Property property1 = new Property("Jens Olsen", "Gloppen", 1445, 77, 631, 1017.6);
    Property property2 = new Property("Syningom", "Nicolay Madsen", "Gloppen", 1445, 77, 131, 661.3);
    Property property3 = new Property("Fugletun", "Evilyn Jensen", "Gloppen", 1445, 75, 19, 650.6);
    Property property4 = new Property("Karl Ove Bråten", "Gloppen", 1445, 74, 188, 1457.2);
    Property property5 = new Property("Høiberg", "Elsa Indregård", "Gloppen", 1445, 69, 47, 1339.4);

    PropertyRegister register = new PropertyRegister(property1, property2, property3, property4);
    /*
    System.out.println(register.getNumberOfProperties());
    System.out.println(register.getAllProperties());
    System.out.println(register.calculateAverageArea());
    System.out.println(register.search(1445, 77, 631));
    register.registerProperty(property5);
    register.removeProperty(property3);
    System.out.println(register.getNumberOfProperties());


    System.out.println(property1.getArea());
    System.out.println(property1.toString());
    System.out.println(property1.getNameOfOwner());
    property1.setNameOfOwner("Håvard Daleng");
    System.out.println(property1.getNameOfOwner());*/

    PropertyRegisterUI registerUI = new PropertyRegisterUI(register);
    registerUI.start();


  }
}