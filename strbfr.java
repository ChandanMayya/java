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

        StringBuffer sb=new StringBuffer("I Keshava");
        sb.insert(2, "love ");
        System.out.println(sb); 
    }
}
