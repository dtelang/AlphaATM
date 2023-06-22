import java . util.Scanner;


// operation performed by ATM
// 1 withdraw
// 2 deposit cash
// 3 Transfer cash
// 4 check bank balance


class account {

    public int pin; // Pin Number
    public String name; // Account Name
    public int balance; // Bank Balance

        public static void checkOp(int opNum,int aPin,String name,int amount,int balance){

            if(opNum == 1) {

                int withdraw = balance - amount;
                System.out.println("Before Withdraw Bank Balance is : " + balance);
                balance = withdraw;
                System.out.println("After Withdraw Bank Balance is : " + balance);
            }
            else if(opNum == 2){

                    int deposit =  balance+amount;
                System.out.println("Before Deposit Bank Balance is : " + balance);
                    balance = deposit;
                System.out.println("After Deposit Bank Balance is : " + balance);
            }
            else if(opNum == 3){


                System.out.println("Pin Number is : " + aPin);
                System.out.println("Account Name  " + name);
                System.out.print("Bank Balance : " + balance);

            }

        }

}

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.println("\n \nWell Come to Dipak Cooperative Bank \n \n");

        System.out.println("Enter 1 for Withdraw\nEnter 2 for Deposit\nEnter 3 for check information");
        System.out.print("Enter any option : ");
        int opNum = sc.nextInt();


        System.out.print("Enter Pin Number => ");
        int userPin = sc.nextInt();


        System.out.print("Enter amount : ");
        int amount = sc.nextInt();

        account a1  = new account();
        a1.name = "Dipak Telang";
        a1. pin = 770916;
        a1.balance = 100000000;


        account a2= new account();
        a2.name = "Sumit Telang";
        a2. pin = 928410;
        a2.balance = 150;


        account a3= new account();
        a3.name = "Avinash Telang";
        a3.pin = 8282;
        a3.balance = 100;


        account a4= new account();
        a4.name = "Mukesh Ambani";
        a4.pin = 549951;
        a4.balance = 4879221 ;


         if(userPin ==a1.pin){
             account.checkOp(opNum,a1.pin,a1.name,amount,a1.balance);
         } else if (userPin ==a2.pin) {
             account.checkOp(opNum,a2.pin,a2.name,amount,a2.balance);
         }
         else if (userPin ==a3.pin) {
             account.checkOp(opNum,a3.pin,a3.name,amount,a3.balance);
         }
         else if (userPin ==a4.pin) {
             account.checkOp(opNum,a4.pin,a4.name,amount,a4.balance);
         }else{
             System.out.print("Wrong Pin Number ");
         }

     }
  }