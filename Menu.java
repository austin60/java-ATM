import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Menu {
    //String option;
    int total=0;


    Map<Integer,String> intro=new HashMap<>();
    Scanner sc=new Scanner(System.in);
     

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
void menuLoop(){
     Menu menu=new Menu();
     menu.basicMenu();
     System.out.println("Enter option: ");
     int opt=sc.nextInt();
     navigate(opt);
  } 

void checkBalance(){
    System.out.println("Current balance : " + total);
    menuLoop();
  }

void withdraw(int amnt){
    if (amnt>total){
        System.out.println("Low balance.Cannot complete transaction");
        menuLoop();
    }
    else{
        total=total-amnt; 
        System.out.println("New balance is "+ total);
        menuLoop();
        
    }
    
  }

void deposit(int amnt){
     total+=amnt;
     System.out.println("New balance is "+ total);
     menuLoop();
  }

  void exit(){
    Menu menu=new Menu();
    menu.basicMenu();
  }

  void navigate(int option){
    transact();
    switch(option){
        case 1:
           checkBalance();
           break;
        case 2:{
           System.out.println("Enter ammount to withdraw : ");
           int w=sc.nextInt();
           //System.out.println(w);
           withdraw(w);
           }
           break;
        case 3:
           System.out.println("Enter ammount to deposit : ");
           int d=sc.nextInt(); 
           //System.out.println(d);
           deposit(d);
           break;
        case 4:
           basicMenu();
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
