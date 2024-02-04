import java.util.Arrays;

public class DynamicArray{
private int size = 0;
private Person[] array = new Person[10];

// .add
public void add(Person person){
    if(getSize() < array.length){

        array[getSize()] = person;
        setSize(getSize()+1);

    } else {
        System.out.println("Array full");
    }
    // System.out.println("getSize " + getSize());
    // System.out.println("array length " + array.length);

}

// .remove
 public void remove() {
        if (getSize() > 0) {
            setSize(getSize() - 1);
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
        }
    }
    printArray();
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

// Clear
public void clear(){
    array = new Person[0];
    setSize(0);
    System.out.println("Array cleared.");
}

// Get
public Person(int index){
    if(index >= 0 && index < getSize()){
        return array[index];
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


  @Override
    public String toString() {
        return "DynamicArray{" +
                "array=" + Arrays.toString(array) +
                "\nsize " + size +
                '}';
    }

}