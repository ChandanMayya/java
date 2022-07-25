class shape{
    double height,width;
    void print_sup(){
        System.out.println("Im in the super class: shape");
    }
}
class triangle extends shape{
    String s;
    void print_sub(){
        System.out.println("Im in the sub class: triangle");
    }
}
public class inherit_demo{
    public static void main(String[] args) {
        triangle t1 = new triangle();
        t1.print_sup();
        t1.print_sub();
    }
}