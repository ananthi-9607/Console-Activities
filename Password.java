import java.util.*;
public class Password{
    public static void main(String[]args){
        Scanner x=new Scanner(System.in);
        
        int attempts=0;
        while(attempts<3){
            String username=x.next();
            String password=x.next();
        if(username.equals("admin") && password.equals("admin123")){
            System.out.println("Login Succesful");
            break;
            }
        else{
            System.out.println("Login Failed");
                attempts++;
            }
        }
        if (attempts == 3) {
    System.out.println("Too Many Attempts");
}
            
    
        
    }
}


