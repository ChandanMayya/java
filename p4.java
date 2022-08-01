import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        // account a1 = new account("KESHAVA", 50101123);
        // a1.display();
        // a1.deposit(25000);
        // a1.display();
        // a1.withdraw(2000);
        // a1.display();
        int ano,choice;
        double amt;
        String owner;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the owner name:\t");
        owner=sc.next();
        System.out.println("Enter the account number:\t");
        ano=sc.nextInt();
        account a1=new account(owner, ano);
       
        Boolean opt=true;
        while(opt){
            System.out.println("[][][][][][]][][][] MENU [][][][][][]][][][]]");
            System.out.print("1.DEPOSIT\t2.WITHDRAW\n3.DISPLAY\n Enter your Choice");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter the amount to deposit:");
                    amt=sc.nextDouble();
                    a1.deposit(amt);
                    break;
                case 2:
                    System.out.println("Enter the amount to withdraw:");
                    amt=sc.nextDouble();
                    a1.withdraw(amt);
                    break;
                case 3:
                    a1.display();
                    break;
                }
            System.out.println("Do you want to contine (true/false) ");
            opt=sc.nextBoolean();
        }
    }
    
}
class account{
    String owner;
    int accountno;
    double balance;
    account(String own, int ano){
        owner=own;
        accountno=ano;
        balance=500;
        System.out.println("New account created with minimum balance!");
    }
    void deposit(double val){
        balance += val;
    }
    void withdraw(double val){
      //  try{
            if(balance-val<=500){
            System.out.println("LEss BALance");
           // throw Exception
            //return;
          //  }
           // catch(Exception e){};
        }
        balance -= val;
    }
    void display(){
        System.out.println("Owner name:"+owner);
        System.out.println("Account Number:"+accountno);
        System.out.println("Balance is "+balance);
    }
}
