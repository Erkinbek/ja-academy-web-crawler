import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {

    public static void main(String[] args) {
        boolean isPasswordHere = false;
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String sPattern = "password.\\s*(\\w+)";

        Pattern javaPattern = Pattern.compile(sPattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = javaPattern.matcher(text);

        while (matcher.find()) {
            isPasswordHere = true;
            System.out.println(matcher.group(1));
        }
        if (!isPasswordHere) {
            System.out.println("No passwords found.");
        }
    }
}