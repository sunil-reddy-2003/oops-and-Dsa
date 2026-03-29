package OOPS.interfaces.comparator;


import java.util.Comparator;

class StudentNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name); // sort by name
    }
}
