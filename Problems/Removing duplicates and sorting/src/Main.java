import java.util.Scanner;
import java.util.Set;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Set<String> data = new java.util.TreeSet<>();
        while (scanner.hasNextLine()) {
            data.add(scanner.nextLine());
        }
        for (String item : data) {
            System.out.println(item);
        }
    }
}