import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] words = line.split(" ");
        int maxLength = words[0].length();
        int index = 0;
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > maxLength) {
                index = i;
                maxLength = words[i].length();
            }
        }
        System.out.println(words[index]);
    }
}