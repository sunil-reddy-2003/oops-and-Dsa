package OOPS.interfaces.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Alice", 5));
        list.add(new Student("Bob", 2));
        list.add(new Student("Charlie", 10));

        Collections.sort(list); // uses compareTo()
        System.out.println(list);
    }
}
