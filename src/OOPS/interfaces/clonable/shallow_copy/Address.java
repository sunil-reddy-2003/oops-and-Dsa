package OOPS.interfaces.clonable.shallow_copy;

public class Address {
    String city;

     Address(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                '}';
    }

}
