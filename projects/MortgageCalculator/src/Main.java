import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        final int monthsPerYear = 12;
        final int percentage = 100;

        System.out.print("Principal: ");
        int principal = input.nextInt();

        System.out.print("Annual Interest Rate: ");
        double annualInterestRate = input.nextDouble();
        double monthlyInterestRate = annualInterestRate / ( percentage * monthsPerYear);
        System.out.println("Monthly Interest Rate: " + monthlyInterestRate);

        System.out.print("Period (Years): ");
        int period = input.nextInt();
        int monthlyPeriod = period * monthsPerYear;
        System.out.println("Monthly Period: " + monthlyPeriod);

        double result = Math.pow(1 + monthlyInterestRate, monthlyPeriod);

        double mortgage = principal * ( ( monthlyInterestRate * result ) / (result - 1) );

        System.out.println("Mortgage: " + currency.format(mortgage));


    }
}