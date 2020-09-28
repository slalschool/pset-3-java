import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Height: ");
        double height = scan.nextDouble();

        System.out.print("Width: ");
        double width = scan.nextDouble();

        double perimeter = (height + width) * 5.08;
        System.out.printf("%n%,.2f centimeters", perimeter);
    }
}