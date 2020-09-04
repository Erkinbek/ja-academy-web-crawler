import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        Set<String> known = new java.util.TreeSet<>();
        for (int i = 0; i < a; i++) {
            known.add(scanner.nextLine().toLowerCase());
        }

        int b = Integer.parseInt(scanner.nextLine());
        Set<String> data = new java.util.TreeSet<>();
        String[] words;
        for (int i = 0; i < b; i++) {
            words = scanner.nextLine().toLowerCase().split(" ");
            data.addAll(Arrays.asList(words));
        }

        data.removeAll(known);

        for (String item : data) {
            System.out.println(item);
        }
    }
}