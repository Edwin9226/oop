package apie;

/**
 * ENCAPSULATION
 * APIE abstraction, poymorphism, ineritance, and encapsulation.
 * fur basic pillar oop.
 * internall elements and internal functions.
 *
 * INHERITANCE
 * The bility to create a new clss above the existing subclass.
 *
 * POLYMORPHISM (Two types)
 * couldhappen differently based to input or the state of the instance.
 * Method Overloading (Static  Polymorphism)
 * - changing the input argument type
 * - Changing the number of method arguments
 *
 * Method Overriding (Dynamic Polymorphis)
 * fig. 1.6
 * he method performed is known at runtime.
 * ABSTRACT (class or interface)
 *  Is the constant removal of specifics or individuals details
 */
public class Vehicle {
    private boolean moving;
    public void move(){
        this.moving= true;
        System.out.println("moving ....");
    }

    public void stop(){
        this.moving= false;
        System.out.println("stopped...");
    }
}
