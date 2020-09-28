import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = scan.nextDouble();

        int amountCoins = (int)(100 * amount);
        int quarters = amountCoins/25;
        int dimes = (amountCoins - quarters * 25) / 10;
        int nickles = (amountCoins - quarters * 25 - dimes * 10) / 5;
        int pennies = (amountCoins - quarters * 25 - dimes * 10 - nickles * 5);

        System.out.printf("%nQuarters : " + quarters + "%nDimes    : " + dimes + "%nNickels  : " + nickles + "%nPennies  : " + pennies);
    }
}