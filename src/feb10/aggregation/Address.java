package feb10.aggregation;

public class Address {

    String streetName;
    String city;
    String postalCode;

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }

    public Address(String streetName, String city, String postalCode) {
        this.streetName = streetName;
        this.city = city;
        this.postalCode = postalCode;
    }
}
