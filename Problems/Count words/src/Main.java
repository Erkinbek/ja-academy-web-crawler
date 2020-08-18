import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        int counter = 0;
        String[] words = line.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals("")) {
                counter++;
            }
        }
        System.out.println(counter);
        reader.close();
    }
}