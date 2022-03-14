import java.util.Scanner;
import java.util.function.Predicate;

public class Exercise1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String p;

        System.out.printf("Set Password: ");
        p = scanner.next();

        checkPassword(p);
    }

    public static Boolean checkPassword(String p) {

        String speChara = "()#$?!%/@";
        char curr;
        boolean number = false;
        boolean upper = false;
        boolean lower = false;
        boolean special = false;
        boolean empty = false;

        for (int i = 0; i < p.length(); i++) {
            curr = p.charAt(i);
            if (Character.isDigit(curr)) {
                number = true;
            } else if (Character.isUpperCase(curr)) {
                upper = true;
            } else if (Character.isLowerCase(curr)) {
                lower = true;
            } else if (speChara.contains(String.valueOf(curr))) {
                special = true;
            } else if (Character.isWhitespace(curr)) {
                empty = true;
            }
        }



        if ((number == true) && (upper == true) && (lower == true) && (special == true) && (empty == false)) {
            System.out.println("Strong Password");
            if ((p.length() < 8) || (p.length() > 25)) {
                System.out.println("Length of Password is not acceptable.");
                return false;
            } else {
                System.out.println("Password accepted");
                return true;
            }
        } else {
            System.out.println("Password not strong enough");
            return false;
        }
    }
}