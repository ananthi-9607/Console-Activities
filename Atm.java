import java.util.*;
public class Atm{
    public static void main(String[]args){
        Scanner x=new Scanner(System.in);
        int balance=x.nextInt();
        int withdraw=x.nextInt();
        if(balance<=0){
            System.out.println("Insufficient Balance");
        }
        if(withdraw>balance){
            System.out.println("Insufficient Balance");
        }
        else{
       
            double newBalance=balance-withdraw;
            System.out.println("Withdrawal successful.");
            System.out.println("New balance: " + newBalance);
        }
    }
}


