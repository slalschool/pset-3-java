import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Homework 1: ");
        int hw1 = scan.nextInt();

        System.out.print("Homework 2: ");
        int hw2 = scan.nextInt();

        System.out.print("Homework 3: ");
        int hw3 = scan.nextInt();

        System.out.print("Quiz 1: ");
        int qz1 = scan.nextInt();

        System.out.print("Quiz 2: ");
        int qz2 = scan.nextInt();

        System.out.print("Test 1: ");
        int tst1 = scan.nextInt();

        double grade = 0.15 * (hw1 + hw2 + hw3) / 3 + 0.35 * (qz1 + qz2) /2 + 0.5 * tst1;
        System.out.printf("%n%.2f%%.", grade);
    }
}