class shape{
    double height,width;
    shape(){
        height = 20;
        width = 20;
    }
    void print_sup(){
        System.out.println("Im in the super class: shape");
    }
}
class triangle extends shape{
    String s;
    double area(){
        return height*width/2;
    }
    void print_sub(){
        System.out.println("Im in the sub class: triangle");
    }
}
public class inherit_demo{
    public static void main(String[] args) {
        triangle t1 = new triangle();
        t1.print_sup();
        t1.print_sub();
        System.out.println("Area is "+t1.area() );
    }
}