package OOPS.interfaces.comparable;

public class Student implements Comparable<Student> {
    String name;
    int roll;

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    @Override
    public int compareTo(Student s) {
        return this.roll - s.roll; // sort by roll number
    }

    public String toString() {
        return name + ": " + roll;
    }
}

