import java.util.Arrays;

public class DynamicArray{
private int size = 0;
private int growSize = 5;

private static final int INITIAL_SIZE = 10;
private Person[] array = new Person[INITIAL_SIZE];

// .add
public void add(Person person) {
    if (getSize() == array.length) {
        grow();
    }

    array[getSize()] = person;
    setSize(getSize() + 1);
}

   public void printArray() {
    if (getSize() > 0) {
        System.out.print("Array: [ ");
        for (int i = 0; i < getSize(); i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    } else {
        System.out.println("Array is empty.");
    }
}

// .remove
public void remove() {
    if (getSize() > 0) {
        setSize(getSize() - 1);
        if (canShrink()) {
            shrink();
        }
        printArray();
    } else {
        System.out.println("Array empty");
    }
}

public void remove(int index) {
    Person removePerson = array[index];
    for (int i = 0; i < array.length; i++) {
        if (array[i] == removePerson) {
            if (index == array.length - 1) {
                array[index] = null;
            } else {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
            }
            setSize(getSize() - 1);
            if (canShrink()) {
                shrink();
            }
        }
    }
    printArray();
}

// Clear
public void clear(){
    array = new Person[0];
    setSize(0);
    System.out.println("Array cleared.");
}

// Get
public Person get(int index){
    if(index >= 0 && index < getSize()){
        return array[index];
    } else {
        return null;
    }
}

// Set
public Person set(int index, Person person){
    if (index >= 0 && index < getSize()) {
        return array[index] = person;
    } else {
        return null;
    }
}

// Size
public int getSize(){
    return size;
}

public int setSize(int size){
    this.size = size;
    return size;
}

// Grow
private Person[] grow(){
    int newSize = array.length * growSize;
    Person[] newArray = new Person[newSize];

    for(int i = 0; i < getSize(); i++){
        newArray[i]= array[i];
    }

    array=newArray;
    setSize(getSize());
    return array;

}

// Shrink
public boolean canShrink(){
    int newSize = array.length - growSize;
    return newSize >= INITIAL_SIZE;
}

public Person[] shrink(){
    int newSize = array.length - growSize;
    Person[] newArray = new Person[newSize];

    for(int i = 0; i < newSize; i++){
        newArray[i] = array[i];
    }

    array = newArray;
        setSize(newSize);
        return array;
}


  @Override
    public String toString() {
        return "DynamicArray{" +
                "array=" + Arrays.toString(array) +
                "\nsize " + size +
                '}';
    }

}