public class Main {
    public static void multipliers(int n, int k) {
        if (k > n / 2) {
            System.out.print(n + "; ");
            return;
        }
        if (n % k == 0) {
            System.out.print(k + "; ");
            multipliers(n / k, k);
        }
        else {
            multipliers(n, ++k);
        }
    }

    public static boolean primeNumber(int n, int i) {
        if (n < 2) {
            return false;
        }
        else if (n == 2) {
            return true;
        }
        else if (n % i == 0) {
            return false;
        }
        else if (i < n / 2) {
            return primeNumber(n, i + 1);
        } else {
            return true;
        }
    }

    public static String palindrome(String s) {
        s=s.toLowerCase();
        if (s.length() == 1) {
            return "YES";
        } else {
            if (s.substring(0, 1).equals(s.substring(s.length() - 1, s.length()))) {
                if (s.length() == 2) {
                    return "YES";
                }
                return palindrome(s.substring(1, s.length() - 1));
            } else {
                return "NO";
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("6) Проверка числа на простоту:");
        System.out.println("19: "+primeNumber(19,2));
        System.out.println("20: "+primeNumber(20,2));
        System.out.println("109: "+primeNumber(109,2));

        System.out.println("\n7) Разложение на множители:");
        System.out.print("150: ");
        multipliers(150, 2);
        System.out.print("\n109: ");
        multipliers(109, 2);

        System.out.println("\n\n8) Палиндром:");
        System.out.println("level: "+palindrome("level"));
        System.out.println("Anna: "+palindrome("Anna"));
        System.out.println("lever: "+palindrome("lever"));

    }
}