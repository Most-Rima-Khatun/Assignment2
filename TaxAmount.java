import java.util.Scanner;

public class TaxAmount {
    public static void main() {
        Scanner input = new Scanner(System.in);
        double income;
        double tax;
        int status;
        System.out.println("Enter your Status single for 1 and married for 2:");
        status = input.nextInt();
        System.out.println("Enter your income:");
        income = input.nextDouble();
        tax = 0;
        if (status == 1) {
            System.out.println("single");
            if (income < 8000) {
                tax = income * 0.15;
            } else if (income < 32000) {
                tax = income * 0.25;
            } else {
                tax = income * 0.10;
            }
            System.out.println("Amount of Tax :" + tax);
        } else if (status == 2) {
            System.out.println("Married");
            if (income < 16000) {
                tax = income * 0.15;
            } else if (income < 64000) {
                tax = income * 0.25;
            } else {
                tax = income * 0.10;
            }
            System.out.println("Amount of Tax :" + tax);
        } else {
            tax = income * 0.10;
            System.out.println("Amount of Tax :" + tax);
        }
    }
}
