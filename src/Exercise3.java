import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Height: ");
        double height = scan.nextDouble();

        System.out.print("Width: ");
        double width = scan.nextDouble();

        double area = (height * width) * (25.4 * 25.4);
        System.out.printf("%n%,.2f square millimeters", area);
    }
}