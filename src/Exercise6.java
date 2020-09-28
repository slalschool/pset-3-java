import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Wage: ");
        double wage = scan.nextDouble();

        System.out.print("Monday: ");
        int Mon = scan.nextInt();

        System.out.print("Tuesday: ");
        int Tue = scan.nextInt();

        System.out.print("Wednesday: ");
        int Wed = scan.nextInt();

        System.out.print("Thursday: ");
        int Thu = scan.nextInt();

        System.out.print("Friday: ");
        int Fri = scan.nextInt();

        System.out.print("Saturday: ");
        int Sat = scan.nextInt();

        System.out.print("Sunday: ");
        int Sun = scan.nextInt();

        double total = wage * (Mon + Tue + Wed + Thu + Fri + Sat + Sun);
        System.out.printf("%n$%,.2f.", total);
    }
}