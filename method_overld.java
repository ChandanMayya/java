public class method_overld {
    public static void main(String[] args) {
        double area;
        float l=10,b=5;
        double bb=10.5,hh=10.5;
        find_area ar=new find_area();
        area=ar.area(10);
        System.out.println("Area of square of l,b = 5 is\t"+area);
        area=ar.area(l,b);
        System.out.println("Area of rectangle of l=2 and b=3 is:\t"+area);
        area=ar.area(bb,hh);
        System.out.println("Area of triangle of l=3 and h=5 is:\t"+area);
    }
    

}
class find_area{
    double area(float l){
        return 2*l;
    }
    double area(float l,float b){
        return l*b;
    }
    double area(double l,double h){
        return ((l*h)/2);
    }
}
