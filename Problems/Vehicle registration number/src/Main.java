import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isNum = false;

        String regNum = scanner.nextLine();

        String firstCharPattern = "^[A|B|E|K|M|H|O|P|C|T|Y|X]";
        String isDigits = "^\\d{2,4}[0-9]";
        String lastCharsPattern = "^\\d{5,7}[A|B|E|K|M|H|O|P|C|T|Y|X]";

        if (regNum.matches(firstCharPattern)) {
//            if (regNum.matches(isDigits)) {
//                if (regNum.matches(lastCharsPattern)) {
                    isNum = true;
//                }
//            }
        }
        System.out.println(isNum);
    }
}