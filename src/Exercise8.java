import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Students : ");
        double students = scan.nextInt();

        System.out.print("Teachers : ");
        double teachers = scan.nextInt();

        System.out.print("Capacity : ");
        double capacity = scan.nextInt();

        double total = students + teachers;
        double busReq = (total + capacity - 1) / capacity;
        double overflow = total % capacity;
        System.out.printf("%nBuses Required: " + busReq + "%nOverflow passengers: " + overflow);
    }
}