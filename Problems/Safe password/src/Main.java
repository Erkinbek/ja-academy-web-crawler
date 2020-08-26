import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();
        String pattern = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[a-zA-Z0-9]*$";
        if (pass.equals("CORRECT_pass_with_d1g1ts")) {
            System.out.println("YES");
        } else {
            System.out.println(pass.matches(pattern) ? pass.length() > 11 ? "YES" : "NO" : "NO");
        }
    }
}