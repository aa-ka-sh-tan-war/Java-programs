import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        for (int i = start; i < end; i++) {
            System.out.print(S.charAt(i));
        }
        in.close();
    }
}
