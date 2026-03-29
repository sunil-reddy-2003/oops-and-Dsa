package OOPS.interfaces.clonable.deep_copy;

public class Address implements Cloneable{
    String city;

    public Address(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                '}';
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
