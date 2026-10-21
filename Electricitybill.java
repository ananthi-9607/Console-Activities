import java.util.*;
public class Electricitybill{
    public static void main(String[]args){
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the number of units consumed:");
        int units=x.nextInt();
        double bill=0;
        if(units<=100){
            bill=units*2;
        }
        else if(units<=200&&units>100){
            bill=units*3;
        }
        else if(units<=300&&units>200){
            bill=units*4;
        }
        else{
            bill=units*5;
        }
        System.out.println("The electricity bill is: " + bill);
    }
}