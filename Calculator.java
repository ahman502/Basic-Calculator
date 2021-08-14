/*This program is a basic calculator that adds,
subtracts, multiplies, divides, and finds the
remiander of any two integers that a user provides */

//Declaring a public class called Calculator
public class Calculator {

  //Calculator constructor with no parameters
  public Calculator() {
  }

  //Add method
  public int add(int a, int b) {
    System.out.print(a + " + " + b + " = ");
    return a + b;
  }

  //Subtract method
  public int subtract(int a, int b) {
    System.out.print(a + " - " + b + " = ");
    return a - b;
  }

  //Multiply method
  public int multiply(int a, int b) {
    System.out.print(a + " * " + b + " = ");
    return a * b;
  }

  //Divide method
  public int divide(int a, int b) {
    System.out.print(a + " / " + b + " = ");
    return a / b;
  }

  //Modulo method
  public int modulo(int a, int b) {
    System.out.print(a + " % " + b + " = ");
    return a % b;
  }

  //main method
  public static void main(String[] args) {
    
    //Creating a new instance/object of the Calculator class
    Calculator myCalculator = new Calculator();

    //testing add method on myCalculator object
    System.out.println(myCalculator.add(5, 7));

    //testing subtract method on myCalculator object
    System.out.println(myCalculator.subtract(45, 11));

    //testing multiply method on myCalculator object
    System.out.println(myCalculator.multiply(5, 100));

    //testing divide method on myCalculator object
    System.out.println(myCalculator.divide(30, 4));

    //testing modulo method on myCalculator object
    System.out.println(myCalculator.modulo(9, 4));
  }
}
