
import java.util.Scanner;

public class Day2 {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int salary = x.nextInt();
        double allowance = 0;
        allowance = salary * 0.20;
        double deduction = 0;
        deduction = salary * 0.05;
        double netsalary = salary + allowance - deduction;
        System.out.println("Salary" + salary);
        System.out.println("Allowance" + allowance);
        System.out.println("Deduction" + deduction);
        System.out.print("NetSalary" + netsalary);
    }
}
