import java.util.HashMap;

public class Client {

HashMap<Integer,Integer> userCred=new HashMap<>();
Menu menu=new Menu();
//variable declaration
 int total=0;
//login credentials
   void credentials(){
      userCred.put(1234,123456);
      userCred.put(4321,654321);

  }
  
//login with credentials
  void verify(int i,int y){
    credentials();
    //if userid is in records
    if( userCred.containsKey(i) )
    {
       //if pin mismatch
       if(userCred.get(i)!=y){
         System.out.println("ATM pin mismatch");
       }
       else{
        menu.basicMenu();
       // menu.navigate();
       // System.out.println("Success");
       }
    }
    //if userid is not recorded
    else{
        System.out.println("user ID has no match");
    }
  }

  void checkBalance(){
    System.out.println("Current balance : " + total);
  }

  int withdraw(int amnt){
    return total-amnt; 
  }

  int deposit(int amnt){
    return total+amnt;
  }

  void exit(){
    Menu menu=new Menu();
    menu.basicMenu();
  }


}
