import java.lang.invoke.VarHandle.AccessMode;
import java.util.Scanner;

class LessBalanceException extends Exception{
    LessBalanceException(double amt){
        System.out.println("Withdrawing"+amt+"is invalid");
    }
}

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
    void withdraw(int ano,double amount) throws LessBalanceException{
        int k=-1,found=0;
        for(int i=0;i<2;i++){
            if(a[i].ano==ano){
                k=i;
                found=1;
                break;
            }
            if(found==1){
               if((a[k].balance<500)||(a[k].balance<amount)){
                    throw new LessBalanceException(amount);
                }else{
                    a[i].balance-=amount;
                    display(a[k].ano);    
                }
            }else{
                System.out.println("Account number doees not exist");
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
        int k=-1,found=0;
        for(int i=0;i<2;i++){
            if(a[i].ano==ano){
                k=i;
                found=1;
                break;    
            }
            if(found==1){
                System.out.println("Acount details");
                System.out.println(uname+"\t"+a[k].ano+"\t"+a[k].balance);
                System.out.println("=================================");
            }
        }
    }
    void deposit(int ano, double amount){
        int found=0,k=-1;
        for(int i=0;i<2;i++){
            if(a[i].ano==ano){
                a[i].balance+=amount;
                found=1;
                k=i;
                break;
            }
            if(found==1){
                System.out.println("Balance Updated!");
                display(a[k].ano);     
            }else{
                System.out.println("Account number does not exists");
            }
        }
    }
}



public class bank {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Create account with minimum balance 500");
        System.out.println("Enter Owner name");
        String name=sc.next();
        int accno;
        user u=new user(name);
        u.create_acnt();
        System.out.println("Acount created successfully");
        Boolean opt=true;
        while(opt){
            System.out.println("1.Balance\n2.Deposite\n3.Withdrawal");
            System.out.println("Enter your choice");
            int ch=sc.nextInt();
            switch(ch){
                case 1: System.out.println("Account details");
                        System.out.println("Enter the account number");
                        accno=sc.nextInt();
                        u.display(accno);
                        break;
                case 2: System.out.println("Enter the account number");
                        accno=sc.nextInt();
                        System.out.println("Enter the amount to deposite");
                        Double amt=sc.nextDouble();
                        u.deposit(accno,amt);
                        break;
                case 3: try {
                                System.out.println("Enter account number");
                                accno=sc.nextInt();
                                System.out.println("Enter amount to withdrawal");
                                Double amount=sc.nextDouble();
                                u.withdraw(accno,amount);
                        } catch (LessBalanceException e) { }
                        break;
                    //TODO: handle exception
            }
        }
    }
    
}
}
