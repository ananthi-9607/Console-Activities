import java.util.*;

public class Day1 {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        double amount = x.nextDouble();
        if (amount < 0) {
            System.out.print("Invalid amount");
        }
        double discount = 0;
        if (amount >= 6000) {
            discount = amount * 0.20;
        }
        double finalamount = amount - discount;

        System.out.println("Amount" + amount);
        System.out.println("Discount" + discount);
        System.out.println("final Amount" + finalamount);
    }
}
