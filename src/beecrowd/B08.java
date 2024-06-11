package beecrowd;

import java.util.Scanner;

public class B08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int employeeNumber = scanner.nextInt();
        int workedHours = scanner.nextInt();
        double hourlyRate = scanner.nextDouble();

        double salary = workedHours * hourlyRate;

        System.out.printf("NUMBER = %d\n", employeeNumber);
        System.out.printf("SALARY = U$ %.2f\n", salary);

        scanner.close();
    }
}
