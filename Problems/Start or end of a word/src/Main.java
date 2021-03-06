import java.util.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String part = scanner.nextLine();
        String line = scanner.nextLine();

        Pattern javaPattern = Pattern.compile(part + "\\b|\\b" + part, Pattern.CASE_INSENSITIVE);
        Matcher javaMatcher = javaPattern.matcher(line);
        System.out.println(javaMatcher.find() ? "YES" : "NO");
    }
}