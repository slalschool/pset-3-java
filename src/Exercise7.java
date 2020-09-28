import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Salary: ");
        double salary = scan.nextDouble();

        System.out.print("401(k): ");
        double four1K = scan.nextDouble();

        System.out.print("Federal: ");
        double federal = scan.nextDouble();

        System.out.print("State: ");
        double state = scan.nextDouble();

        double pay = salary * (1 - four1K / 100) * (1 - (state + federal) / 100) / 24;
        System.out.printf("%n$%,.2f.", pay);
    }
}