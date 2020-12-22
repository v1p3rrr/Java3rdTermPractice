public final class Address {
    //public final Address EMPTY_ADDRESS = new Address("", 0, "", 0, '0', 0); // ?
    private final String city;
    private final int zipCode;
    private final String street;
    private final int buildingNumber;
    private final char buildingLetter;
    private final int apartment;

    public Address(String city, int zipCode, String street, int buildingNumber, char buildingLetter, int apartment) {
        this.city = city;
        this.zipCode = zipCode;
        this.street = street;
        this.buildingNumber = buildingNumber;
        this.buildingLetter = buildingLetter;
        this.apartment = apartment;
    }

    public String getCity() {
        return city;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String getStreet() {
        return street;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public char getBuildingLetter() {
        return buildingLetter;
    }

    public int getApartment() {
        return apartment;
    }
}
