import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        boolean isMatch = false;
        String line = scanner.nextLine();

        char[] chars = new char[] {
            '<', '(', '[', '{','\\', '^', '-', '=', '$', '@',
            '!', '|', ']', '}', ')', '?', '*', '+', '.','>',
            '/', ',', '_'
        };

        for (int i = 0; i < chars.length; i++) {
            line = line.replace(chars[i], ' ');
        }
        String[] words = line.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == size) {
                isMatch = true;
            }
        }
        System.out.println(isMatch ? "YES" : "NO");
    }
}