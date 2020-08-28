import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String sPattern = "(?i)\\b\\w*" + Pattern.quote("program") + "\\w*\\b";

        Pattern javaPattern = Pattern.compile(sPattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = javaPattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}