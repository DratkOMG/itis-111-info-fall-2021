import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        int b = 1024;
        int c, answer;
        while ((b - a) > 1) {
            c = (b + a) / 2;
            System.out.println(">= " + c + " ?");
            answer = sc.nextInt();
            if (answer == 1) {
                a = c;
            } else {
                b = c;
            }
        }
        System.out.print((b + a) / 2);
    }
}
