import java.util.Scanner;

public class constructor_demo {
    public static void main(String[] args) {
        int choice;
        float l,b,h,vol;
        Scanner sc=new Scanner(System.in);
        System.out.println("1. Cube\t2.Cuboid\nEnter your choice:\t");
        choice=sc.nextInt();
        switch(choice){
            case 1:
                    System.out.println("Enter the side:\t");
                    l=sc.nextFloat();
                    demo cube=new demo(l);
                    vol=cube.Volume();
                    cube.print();
                    cube.print(vol);
                    break;
            case 2:
                    System.out.println("Enter the length, breadth and height :\t");
                    l=sc.nextFloat();
                    b=sc.nextFloat();
                    h=sc.nextFloat();
                    demo cuboid=new demo(l,b,h);
                    vol=cuboid.Volume();
                    cuboid.print();
                    cuboid.print(vol);
                    break;
        }
    }
        
}

class demo{
    float l,b,h;
    demo(float l){
        this.l=this.b=this.h=l;
    }
    demo(float l,float b,float h){
        this.l=l;
        this.b=b;
        this.h=h;
    } 
    float Volume(){
        return(l*b*h);
    }
    void print(){
        System.out.println("Method Overloading..\n");
    }
    void print(float v){
        System.out.println("The volume is:\t"+v);
    }
}
