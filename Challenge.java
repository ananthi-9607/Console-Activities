
import java.util.*;

public class Challenge {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        double purchaseamount = x.nextInt();
        double discount = 0;
        double delivarycharge;
        if (purchaseamount >= 10000) {
            discount = purchaseamount * 0.20;
        } else if (purchaseamount >= 5000 && purchaseamount <= 10000) {
            discount = purchaseamount * 0.10;
        } else {
            discount = purchaseamount * 0;
        }
        double finalamount = purchaseamount - discount;
        if (finalamount <= 50000) {
            delivarycharge = 0;
        } else {
            delivarycharge = 100;
        }
        System.out.println("Purchased Amount" + purchaseamount);
        System.out.println("Discount" + discount);
        System.out.println("Final Amount" + finalamount);
        System.out.println("Delivary Charge" + delivarycharge);

    }
}
