import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        for (int i = a.length()-1; i >= 0; i--) {
            System.out.print(a.charAt(i));
        }
        reader.close();
    }
}