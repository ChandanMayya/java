import java.util.Scanner;

public class bank{
    String holder="USER";
    static acnt[] ac=new acnt[2];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<ac.length;i++){
            System.out.print("Enter the Account 1: ");
            ac[i]=new acnt(sc.nextInt());
            ac[i].display();
        }  
        System.out.println("_____MENU_____");
        System.out.print("1.DEPOSIT\t2.WITHDRAW\n3.BALANCE4.EXIT");
        switch(sc.nextInt()){
            case 1:
            case 2:
            case 3:
            case 4:

        }
    }
}

class acnt{
    int ano;
    double balance;
    acnt(int ano){
        this.ano=ano;
        balance=500;
    }
    void display(){
        System.out.println("Ano: "+this.ano);
        System.out.println("Balance: "+this.balance);
    }
    void deposit(double amt){
        
    }
    void withdraw(double amt){

    }
}