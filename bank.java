import java.util.Scanner;

class user{
    String uname;
    user(String uname){
        this.uname=uname;
    }
    class account{
        int ano=0;
        double balance=0;
      account(int ano,double balance){
            this.ano=ano;
            this.balance=balance;
        }
    }
    account[] a=new account[2];
    void withdraw(int ano,double balance){
        for(int i=0;i<2;i++){
            if(a[i].ano==ano){
               if(a[i].balance-balance<500){
                    System.out.println("Minimum balance must be retained..");
                    return;
                }else{
                    a[i].balance-=balance;
                    System.out.println("Withdraw Successful!");
                    System.out.println("Balance: "+a[i].balance);
                }
            }else{
                System.out.println("Not Account: "+i);
            }
        }
    }
    Scanner sc=new Scanner(System.in);
    void create_acnt(){
        for(int i=0;i<2;i++){
            System.out.print("Enter the accont number: ");
            int ano=sc.nextInt();
            System.out.print("Enter the balance (500 minimum)");
            double amount=sc.nextDouble();
            if(amount>499){
                a[i]=new account(ano, amount);
            }
            else{
                System.out.println("Minimum is 500");
            }
        }
    }
    void display(int ano){
        for(int i=0;i<2;i++){
            if(a[i].ano==ano){
                System.out.println("User: "+uname);
                System.out.println("Account number: "+a[i].ano);
                System.out.println("Balance: "+a[i].balance);
            }else{
                System.out.println("Not "+i);
            }
        }
    }
    void deposit(int ano, double amount){
        for(int i=0;i<2;i++){
            if(a[i].ano==ano){
               // System.out.print("Enter amount to deposit: \t");
              //  Double amount=sc.nextDouble();
                if(amount>0){
                    a[i].balance+=amount;
                    System.out.println("Balance Updated!");
                    System.out.println("Balance: "+a[i].balance);
                }else{
                    System.out.println("Amount must be greater than zero!");
                }
            }else{
                System.out.println("Not "+i);
            }
        }
    }
}


public class bank {
    public static void main(String[] args) {
        System.out.print("Enter the user name: ");
        Scanner sc=new Scanner(System.in);
        String uname=sc.next();
        user usr=new user(uname);
        usr.create_acnt();
        usr.display(100);
        usr.display(111);
        usr.deposit(100, 5000);
        usr.deposit(111, 5000);
        usr.display(100);
        usr.display(111);
        usr.withdraw(100, 1000);
        usr.display(100);
        usr.withdraw(111, 1000);
        usr.display(111);
    }
}