import java.util.*;
public class Bonus{
    public static void main(String[]args){
        Scanner x=new Scanner(System.in);
        int salary=x.nextInt();
        double bonus=0;
        int rating=x.nextInt();
        if(rating>=5){
            bonus=salary*0.20;
        }
        else if(rating>=4 && rating<5){
            bonus=salary*0.10;
        }
        else if(rating>=3 && rating<4){
            bonus=salary*0.05;
        }
        else{
            bonus=0;
        }
        double finalsalary=salary+bonus;
        System.out.println("Salary"+ salary);
        System.out.println("Bonus"+ bonus);
        System.out.println("FinalSalary"+ finalsalary);
    }
}