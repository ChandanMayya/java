package p10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class fileprog {
    public static void main(String[] args) {
        String file1,file2;
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Enter the file to read:");
            file1=sc.next();
            System.out.println("Enter the file to write:");
            file2=sc.next();
            FileInputStream f1=new FileInputStream(file1);
            FileOutputStream f2=new FileOutputStream(file2);
            int val=0;
            val=f1.read();
            while(val!=-1){
                f2.write(val);
                val=f1.read();
            }
            f1.close();
            f2.close();
            f1=new FileInputStream(file2);
            val=0;
            System.out.println("Value of File2: ");
            val=f1.read();
            while(val!=-1){
                System.out.print((char)val);
                val=f1.read();
            }
            f1.close();
        } 
        catch(FileNotFoundException exe)
        {
            System.out.println("File is not available");
        }catch (Exception e) {
            System.out.println("Some Exception..");
        }
    }
}
