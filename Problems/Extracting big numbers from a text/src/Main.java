import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stringWithNumbers = scanner.nextLine();

        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(stringWithNumbers);

        while (m.find()) {
            if (m.group().length() >= 10) {
                System.out.println(m.group() + ":" + m.group().length());
            }
        }
    }
}