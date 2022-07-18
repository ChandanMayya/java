import java.util.Scanner;

public class strbfr {
    public static void main(String[] args) {
       /* String sb1="Hell0";
        StringBuffer sb = new StringBuffer(sb1);
        System.out.println("buffer before: "+sb);
        System.out.println("charAt(1): "+sb.charAt(1));
        System.out.println("Capacity before: "+sb.capacity());
        sb.setCharAt(1,'i');
        sb.setLength(2);
        System.out.println("buffer after: "+sb);
        System.out.println("charAt(1) after: "+sb.charAt(2));*/ 
       
        /*String ss;
        int a=42;
        StringBuffer sb2=new StringBuffer(4);
        System.out.println(sb2);
        System.out.println(sb2.length());
        System.out.println(sb2.capacity() );
        ss=sb2.append("a =").append(a).append("!").toString();
        System.out.println(sb2.append("Programming"));
        System.out.println(sb2);
        */

        /*StringBuffer sb=new StringBuffer("I Keshava");
        sb.insert(2, "love ");
        System.out.println(sb); 
        sb.append("...");
        System.out.println(sb);*/

        StringBuffer br=new StringBuffer("AVAHSEK");
        StringBuffer s=new StringBuffer("");
      /*  System.out.println("Enter the string:");
        Scanner sc=new Scanner(System.in);
        br=sc.next(pattern)*/
        for(int i=br.length()-1,j=0;i>=0;i--,j++)
        s.insert(j,br.charAt(i));
        System.out.println(s);
    }
}
