package beecrowd;

import java.util.Scanner;

public class B01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int X = A + B;

        System.out.println("X = " + X);

        scanner.close();
    }
}
