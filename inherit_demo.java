class shape{
    private double height,width;
   shape(double h,double w){
        height = h;
        width = w;
        System.out.println("Im super cls");
    }
    double getWidth(){
        return width;
    }
    double getHeight(){
        return height;
    }
    void setWidth(double w){
        width=w;
    }
    void setHeight(double h){
        height=h;
    }
    void print_sup(){
        System.out.println("Im in the super class: shape");
    }
}
class triangle extends shape{
    triangle(double h, double w) {
        super(h, w);
    }
    String s;
    double area(){
        return getHeight()*getWidth()/2;
    }
    void print_sub(){
        System.out.println("Im in the sub class: triangle");
    }
}
public class inherit_demo{
    public static void main(String[] args) {
        triangle t1 = new triangle(10,10);
       // t1.setHeight(20);
       // t1.setWidth(20);
        t1.print_sup();
        t1.print_sub();
        System.out.println("Area is "+t1.area() );
    }
}