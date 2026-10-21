import java.util.*;
public class MenuDriven{
    public static void main(String[]args){
        Scanner x=new Scanner(System.in);
        int a=x.nextInt();
        int b=x.nextInt();
        System.out.println("Enter your choice");
        int choice=x.nextInt();
        switch(choice){
            case 1:
                int c=a+b;
                System.out.println("Addition is"+c);
                break;
            case 2:
                int d=a-b;
                System.out.println("Subtraction is"+d);
                break;
            case 3:
                int f=a*b;
                System.out.println("Multiplication is"+f);
                break;
            case 4:
                if(b==0){
                    System.out.println("Division by zero is not allowed.");
                } else {
                    double g=(double)a/b;
                    System.out.println("Division is"+g);
                }
        }
    }
}