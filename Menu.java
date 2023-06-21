import java.util.HashMap;
import java.util.Map;
//import java.util.Scanner;


public class Menu {
    String option;
    public int total;
    Map<Integer,String> intro=new HashMap<>();

   void transact(){
     intro.put(1, "Check balance");
     intro.put(2, "Withdraw");
     intro.put(3, "Deposit");
     intro.put(4, "Exit");
   }

   void basicMenu(){
    // set values in intro Menu (Map)
     transact();

    System.out.println("Select Option");
    //print menu items
    for (Integer key:intro.keySet()){
        System.out.println(key +" -> "+ intro.get(key));
    }
   }

  void navigate(int option){
    transact();
    switch(option){
        case 1:
           System.out.println(intro.get(1));
           break;
        case 2:
           System.out.println(intro.get(2));
           break;
        case 3:
           System.out.println(intro.get(3));
           break;
        case 4:
           System.out.println(intro.get(4));
           break;
        default:{
           System.out.println("Invalid option");
           basicMenu();
           System.out.println("Enter option: ");
           //opt= uid.nextInt();
        }
    }
   
    } 
   
    
}
