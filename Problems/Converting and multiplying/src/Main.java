import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        doIt(scanner);
    }

    public static void doIt(Scanner scanner) {
        boolean cnt = true;
        try {
            int a = scanner.nextInt();
            if (a != 0) {
                System.out.println(a * 10);
            } else {
                cnt = false;
            }
        } catch (Exception e) {
            String a = scanner.nextLine();
            System.out.println("Invalid user input: " + a);
        }
        if (cnt) {
            doIt(scanner);
        }
    }
}