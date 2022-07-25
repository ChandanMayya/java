public class p4 {
    public static void main(String[] args) {
        account a1 = new account("KESHAVA", 50101123);
        a1.display();
        a1.deposit(25000);
        a1.display();
        a1.withdraw(2000);
        a1.display();    
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
    }
    void deposit(double val){
        balance += val;
    }
    void withdraw(double val){
        balance -= val;
    }
    void display(){
        System.out.println("Balance is "+balance);
    }
}
