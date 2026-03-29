package OOPS.interfaces.clonable.deep_copy;

public class Main {
//    Original Person (p1)         Cloned Person (p2)
//            +----------------+            +----------------+
//            | name = "Alice" |            | name = "Bob"   |
//            | address ------>|            | address ------> New Address
//            +----------------+            | city = "LA"   |
//            +----------------+

    public static void main(String[] args) throws CloneNotSupportedException {
        Address addr = new Address("New York");
        Person p1 = new Person("Alice", addr);
        Person p2 = (Person) p1.clone(); // deep copy

        p2.name = "Bob";
        p2.address.city = "Los Angeles";

        System.out.println(p1.name + ", " + p1.address.city); // Alice, New York
        System.out.println(p2.name + ", " + p2.address.city); // Bob, Los Angeles

    }
}
