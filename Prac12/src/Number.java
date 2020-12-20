import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Number {

    String normalizedNumber = null;

    public Number(String number) {
        Pattern pattern1 = Pattern.compile("\\+(\\d{1,4})(\\d{10})");
        Pattern pattern2 = Pattern.compile("8(\\d{10})");

        if (pattern1.matcher(number).matches() || pattern2.matcher(number).matches()) {
            normalizedNumber = (number.charAt(0) == '8' ? "+7" : "+" + number.substring(1, number.length() - 10))
                    + " " + number.substring(number.length()-10, number.length()-7) + " " + number.substring(number.length()-7, number.length()-4)
            + " " + number.substring(number.length()-4, number.length()-2) + " " + number.substring(number.length()-2);
        }

        if (normalizedNumber == null) {
            System.out.println("Wrong format");
        } else {
            System.out.println(normalizedNumber);
        }
    }

    @Override
    public String toString() {
        return normalizedNumber;
    }
}
