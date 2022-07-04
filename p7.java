import java.util.Scanner;

public class p7 {
    public static void main(String[] args) {
        employee [] e=new employee[5];
        Scanner s=new Scanner(System.in);

        System.out.println("Enter the 5 employee records:\n");
        for(int i=1;i<6;i++){
            System.out.println("Record:"+i);
            System.out.println("Enter SSN:");
            int ssn=s.nextInt();
            System.out.println("Enter EMp name:");
            String name=s.next();
            System.out.println("Enter Salary:");
            int sal=s.nextInt();
            System.out.println("Enter Date of Birth:");
            String dob=s.next();
            e[i]=new employee(ssn, sal, name, dob);
            System.out.println("Record "+i+" data are:\n");
            e[i].printData();
        }
    }
}
class employee{
    private int SSN,E_SAl;
    private String E_Name,Date;
    employee(int SSN,int E_SAL,String E_Name,String Date){
        this.SSN=SSN;
        this.E_SAl=E_SAL;
        this.E_Name=E_Name;
        this.Date=Date;
    }
void printData(){
    System.out.println("SSN is:"+SSN+"\tEname is:"+E_Name);
    System.out.println("DOB IS:"+Date+"\nSalary is:"+E_SAl);
}
}
