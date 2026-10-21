import java.util.*;
public class Bank{
    public static void main(String[]args){
        Scanner x=new Scanner(System.in);
        System.out.println("Enter your initial balance");
        int initialBalance=x.nextInt();
        int choice=0;
        while(choice!=4){
             System.out.println("1. Check Balance");
             System.out.println("2. Deposit");
             System.out.println("3. Withdraw");
              System.out.println("4. Exit");

              System.out.println("Enter your choice:");
             choice = x.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Your balance is:"+initialBalance);
                    break;
                case 2:
                    System.out.println("Enter the amount to deposit");
                   double deposit=x.nextDouble();
                    deposit=deposit+initialBalance;
                    System.out.println("Your balance is: "+deposit);
                    break;
                case 3:
                    System.out.println("Enter the amount to withdraw");
                    double withdraw=x.nextDouble();
                    withdraw=initialBalance-withdraw;
                    System.out.println("Your balance is: "+withdraw);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
           
        }
        x.close();
    }
}