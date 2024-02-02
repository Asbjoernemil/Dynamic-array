public class Main {

public static void main(String[] args){

    Person harry = new Person("Harry Potter");
    Person draco = new Person("Draco Malfoy");
    Person hermione = new Person("Hermione Granger");
    Person ron = new Person("Ron Weasley");
    Person asbjørn = new Person("Asbjørn");

    DynamicArray darr = new DynamicArray();

    // test .add

    darr.add(harry);
    darr.add(draco);
    darr.add(ron);
    darr.add(hermione);
    darr.add(asbjørn);

    // test .remove
    // Last
    darr.remove();
    // Index
    darr.remove(0);
    
    // Clear
    System.out.println("Before clear:");
    darr.printArray();

    darr.clear();

    System.out.println("After clear:");
    darr.printArray();
}
    }
