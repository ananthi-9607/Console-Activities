import java.util.*;
public class Trainticket{
    public static void main(String[]args){
        Scanner x=new Scanner(System.in);
        int bookseats=0;
        int availableseats=100;
        System.out.println("Enter your choice");
        int choice=0;
        while(choice!=3){
            System.out.println("1.Book Ticket");
            System.out.println("2.check Available seats");
            System.out.println("3.Exit");
            choice=x.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter the no of seats to book");
                    bookseats=x.nextInt();
                    if(bookseats<=availableseats){
                        availableseats=availableseats-bookseats;
                        System.out.println("Ticket booked successfully");
                        break;
                    }
                    else{
                        System.out.println("Seats not available");
                        break;
                    }
                case 2:
                    System.out.println("Available seats are:"+availableseats);
                    break;
                case 3:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
        x.close();
    }
}

