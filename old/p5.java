import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        int [] a;
        int sum=0,n,i;
        a=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("nter the value for n:");
        
        n=sc.nextInt();
        System.out.println("Enter the array values:");
        for(i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(i=0;i<n;i++)
            sum+=a[i];
        System.out.println("The Sum is "+sum);

        }
}
