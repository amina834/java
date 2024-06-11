package beecrowd;

import java.util.Scanner;

public class B013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int greatest = Math.max(a, Math.max(b, c));

        System.out.println(greatest + " eh o maior");

        scanner.close();
    }
}
