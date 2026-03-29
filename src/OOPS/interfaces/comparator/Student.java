package OOPS.interfaces.comparator;


public class Student {
    String name;
    int roll;

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    @Override
    public String toString() {
        return name + " : " + roll;
    }
}
