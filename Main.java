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
    darr.add(asbjørn);
    darr.add(asbjørn);
    darr.add(asbjørn);
    darr.add(asbjørn);
    darr.add(asbjørn);
    darr.add(asbjørn);
    darr.add(asbjørn);
    darr.add(asbjørn);
    darr.add(asbjørn);
    darr.add(asbjørn);
    darr.add(asbjørn);
    darr.add(asbjørn);
    darr.add(asbjørn);
    darr.add(asbjørn);
    darr.add(asbjørn);
    darr.add(asbjørn);
    darr.add(asbjørn);
    darr.add(asbjørn);
    darr.add(asbjørn);


    // test .remove
    // Last
    darr.remove();
    // Index
    darr.remove(0);

    // Shrink
// Shrink
System.out.println("Before shrink:");
darr.printArray();

System.out.println("Can shrink? " + darr.canShrink());
darr.shrink();

System.out.println("After shrink:");
darr.printArray();

    // Grow
//  System.out.println("Before grow:");
//         darr.printArray();
//         darr.grow();
//         System.out.println("After grow:");
//         darr.printArray();
    
    // Clear
// System.out.println("Before clear:");
// darr.printArray();

// darr.clear();

// System.out.println("After clear:");
// darr.printArray();

    // Get
Person retrievedPerson = darr.get(2);
System.out.println("Retrieved person: " + retrievedPerson);

    // Set
Person newPerson = new Person("Mathias Hoff");
darr.set(1, newPerson);
darr.printArray();
}
    }
