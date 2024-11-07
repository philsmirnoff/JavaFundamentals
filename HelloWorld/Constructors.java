package HelloWorld;

// Java constructors are special types of methods that are used to initialize an object when it is created. It has the same name as its class and is syntactically similar to a method. However, constructors have no explicit return type.

// Typically, you will use a constructor to give initial values to the instance variables defined by the class or to perform any other start-up procedures required to create a fully formed object.

// All classes have constructors, whether you define one or not because Java automatically provides a default constructor that initializes all member variables to zero. However, once you define your constructor, the default constructor is no longer used.

// Rules for Creating Java Constructors
// You must follow the below-given rules while creating Java constructors:

// The name of the constructors must be the same as the class name.
// Java constructors do not have a return type. Even do not use void as a return type.
// There can be multiple constructors in the same class, this concept is known as constructor overloading.
// The access modifiers can be used with the constructors, use if you want to change the visibility/accessibility of constructors.
// Java provides a default constructor that is invoked during the time of object creation. If you create any type of constructor, the default constructor (provided by Java) is not invoked.

class Machine {
  private String name;
  private int code;

  public Machine() {
    this("Arnie", 0);
    System.out.println("Constructor running!");
  }

  public Machine(String name) {
    this(name, 0);
    System.out.println("Second constructor running!");
  }

  public Machine(String name, int code) {
    this.name = name;
    this.code = code;
    System.out.println("Third constructor running!");
  }
}



public class Constructors {
  public static void main(String[] args) {
    Machine machine1 = new Machine();
    Machine machine2 = new Machine("Bertie");
    Machine machine3 = new Machine("Chalky", 7);
  }

}
