package p9;

public class p9 {
    public static void main(String[] args) {
        static_stack s1=new static_stack(10);
        dynamic_stack d1=new dynamic_stack(5);
        for(int i=0;i<15;i++){
        s1.push('A');
        }
        for(int i=0;i<15;i++){
            System.out.println(s1.pop());
        }
        for(int i=0;i<15;i++){
            d1.push('A');
        }
        for(int i=0;i<15;i++){
            System.out.println(d1.pop());
        }
    }

    
}
