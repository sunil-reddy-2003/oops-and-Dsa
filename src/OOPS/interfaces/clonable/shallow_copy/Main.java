package OOPS.interfaces.clonable.shallow_copy;

public class Main {
//    Original Person (p1)         Cloned Person (p2)
//            +----------------+            +----------------+
//            | name = "Alice" |            | name = "Bob"   |
//            | address ------>|----------->| address -------+
//            +----------------+            +----------------+
//            (both point to the SAME Address object)

    public static void main(String[] args) throws CloneNotSupportedException {
        Address address=new Address("Delhi");
        Person person1=new Person("Adithya",address);
        Person person2= (Person) person1.clone();
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        person2.name="anirudh";
        person2.address.city="Hyderabad";
        System.out.println(person1.toString());
        System.out.println(person2.toString());
    }
}
