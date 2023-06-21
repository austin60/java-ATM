import java.util.Scanner;

public class Main {
    public static void main(String arg[]){
       int id,pin,opt=0;
       Client login=new Client();
       Menu menu=new Menu();
          
       System.out.println("Enter userID");
       try (Scanner uid = new Scanner(System.in)) {
        id=uid.nextInt();
           System.out.println("Enter ATM pin");
           pin=uid.nextInt();
           login.verify(id,pin);  
           System.out.println("Enter option: ");
           opt= uid.nextInt();
           //enable navigation if 
            if(opt>0){
               menu.navigate(opt);
             }
            else{
                System.out.println("oops ");
            }
    }
      // System.out.println(opt);
     
    }
    
}
