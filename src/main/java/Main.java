import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the string");
        String s = scanner.nextLine();
        System.out.println(encode(s));
    }
    public static String encode(String s) {
        String encoded = "";

        if (s== null){
            return encoded;
        }

        int count;
        for (int i = 0; i < s.length(); i++) {
            count = 1;
            while (i+1 < s.length() && s.charAt(i) == s.charAt(i+1))
            {
                count++;
                i++;
            }
            encoded += String.valueOf(count) + s.charAt(i);
        }
        return encoded;
    }
}