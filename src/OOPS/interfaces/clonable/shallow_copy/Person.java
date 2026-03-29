package OOPS.interfaces.clonable.shallow_copy;

public class Person implements Cloneable {
    String name;
    Address address;

     Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
         return super.clone();
    }
}
