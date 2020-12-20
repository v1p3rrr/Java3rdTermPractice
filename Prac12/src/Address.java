import java.util.InputMismatchException;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Address {

    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    public Address(String fullAddress) throws InputMismatchException {
        AddressParser(fullAddress.trim());
    }

    private void AddressParser(String fullAddress) throws InputMismatchException {
        Pattern p1 = Pattern.compile("([\\s[a-zA-Z]-]+),([\\s[a-zA-Z]-]+),([\\s[a-zA-Z]-]+),([\\s[a-zA-Z]-\\d]+),([\\s[a-zA-Z]-\\d]+),([\\s[a-zA-Z]-\\d]+),([\\s[a-zA-Z]-\\d]+)");
        Pattern p2 = Pattern.compile("([\\s[a-zA-Z]-]+)[,.;]([\\s-[a-zA-Z]]+)[,.;]([\\s-[a-zA-Z]]+)[,.;]([\\s-[a-zA-Z]\\d]+)[,.;]([\\s-[a-zA-Z]\\d]+)[,.;]([\\s[a-zA-Z]-\\d]+)[,.;]([\\s[a-zA-Z]-\\d]+)");
        StringTokenizer tokenizer = null;

        if (p1.matcher(fullAddress).matches()) {
            tokenizer = new StringTokenizer(fullAddress, ",");
            System.out.println("pattern1");
        } else if (p2.matcher(fullAddress).matches()) {
            tokenizer = new StringTokenizer(fullAddress, ",.;");
            System.out.println("pattern2");
        }

        if (tokenizer != null) {
            country = tokenizer.nextToken();
            region = tokenizer.nextToken();
            city = tokenizer.nextToken();
            street = tokenizer.nextToken();
            house = tokenizer.nextToken();
            building = tokenizer.nextToken();
            apartment = tokenizer.nextToken();
        } else {
            throw new InputMismatchException("EXCEPTION: address entered incorrectly");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("country: ").append(country).append("; region: ").append(region).append("; city: ");
        sb.append(city).append("; street: ").append(street).append("; house: ").append(house);
        sb.append("; building: ").append(building).append("; apartment: ").append(apartment).append(".");
        return sb.toString();
    }
}
