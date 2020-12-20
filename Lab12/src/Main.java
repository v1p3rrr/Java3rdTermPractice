import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        System.out.println(" -- Task 1 -- \n");

        String[] string = Pattern.compile("\\s+?").split("In computer programming, an iterator is an object");
        for (String word : string)
            System.out.println(word);




        System.out.println("\n\n -- Task 2 -- \n");

        String a = "abcdefghijklmnopqrstuv18340";
        String b = "abcdefghijklmnoasdfasdpqrstuv18340";

        Pattern pattern2 = Pattern.compile("abcdefghijklmnopqrstuv18340");
        System.out.println(pattern2.matcher(a).matches());
        System.out.println(pattern2.matcher(b).matches());



        System.out.println("\n\n -- Task 3 -- \n");
        System.out.println("PRICE:");

        Pattern price = Pattern.compile("\\b((\\d+)(\\.\\d{1,2})? (USD|RUB|EUR))");
        String text = "apples cost 2.5 USD (2 USD with the discount) or 1.99 EUR, or 180.04 RUB. The price types of 1f11 USD, 1 not USD, 2.5 RU are incorrect.";
        Matcher matcher = price.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }




        System.out.println("\nPLUS:");
        Pattern plus = Pattern.compile("\\d(\\s+)?\\+");
        System.out.println(plus.matcher("(1 + 8) – 9 / 4").find());
        System.out.println(plus.matcher("6 / 5 – 2 * 9").find());




        System.out.println("\nDATE:");
        String inputDates[] = {"29/02/2000", "40/04/2003", "30/04/2003", "01/01/2003", "1/1/1899", "01/01/1899", "30-04-2003", "31-04-2003", "29/02/2001"};
        Pattern date = Pattern.compile("\\d{2}/\\d{2}/\\d{4}");

        System.out.println(4 == (4|2));

        for (String input : inputDates) {
            if (date.matcher(input).matches()) {
                String[] dates = input.split("/");
                if (Integer.parseInt(dates[2]) < 9999 && Integer.parseInt(dates[2]) > 1900) {
                    if (Pattern.compile("04|06|09|11").matcher(dates[1]).matches()) {
                        if (Integer.parseInt(dates[0]) <= 30) {
                            System.out.println(input + " is a correct date 30");
                        }
                    } else if (Integer.parseInt(dates[1]) == 2) {
                        if ((Integer.parseInt(dates[2]) % 4) == 0) {
                            if (Integer.parseInt(dates[0]) <= 29) {
                                System.out.println(input + " is a correct date 29");
                            }
                        } else if (Integer.parseInt(dates[0]) <= 28) {
                            System.out.println(input + " is a correct date 28");
                        }
                    } else if (Integer.parseInt(dates[1]) <=12 && Integer.parseInt(dates[0]) <= 31) {
                        System.out.println(input + " is a correct date 31");
                    }
                }
            }
        }




        System.out.println("\nEMAIL:");
        Pattern emailPattern = Pattern.compile("([\\w-_\\d]+)@([\\w\\d]+)(\\.(\\w+))?");
        System.out.println(emailPattern.matcher("this_user-user1@example.com").matches());
        System.out.println(emailPattern.matcher("user@example.com").matches());
        System.out.println(emailPattern.matcher("root@localhost").matches());
        System.out.println(emailPattern.matcher("myhost@@@com.ru").matches());
        System.out.println(emailPattern.matcher("@my.ru").matches());
        System.out.println(emailPattern.matcher("Julia String.").matches());



        System.out.println("\nPASSWORD:");

        String[] passwords = {"F032_Password", "TrySpy1", "TrueSpy1", "smart_pass", "A007"};
        for (String password : passwords) {
            if (Pattern.matches("\\w*[A-Z]+\\w*", password) && Pattern.matches("\\w*[a-z]+\\w*", password) && Pattern.matches("\\w*[\\d]+\\w*", password) && Pattern.matches(".{8,}", password)){
                System.out.println(password + " is correct");
            }
        }
    }
}
