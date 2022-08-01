
interface Triangle{
    float area_triangle(float l, float b);
}
interface Rectangle{
    float area_rectangle(float l, float b);
}
class area implements Triangle, Rectangle{
    public float area_rectangle(float l,float b){
        return l*b;
    }
    public float area_triangle(float l, float b){
        return ((l*b)/2);
    }
}
public class intrfac_inherit {
    public static void main(String[] args) {
        area a=new area();
        System.out.println("Area of triangle: "+a.area_triangle(5, 5));
        System.out.println("Area of Rectangle: "+a.area_rectangle(5, 5));
    }
}