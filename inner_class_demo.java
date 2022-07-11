public class inner_class_demo {
    public static void main(String[] args) {
        outer obj=new outer();
        outer.inner ob2=obj.new inner();
        ob2.imethod();
        obj.display();
    }
}

class outer{
    int outer_x=10;
    class inner{
        int inner_y=20;
        void imethod(){
            System.out.println("Accessing outer class variable from inner class..\n");
            System.out.println(outer_x);
            System.out.println(outer_x+inner_y);
        }
    }
    void display(){
        inner ob1=new inner();
        System.out.println("The value of inner class variable accessing from outer class:"+ob1.inner_y);
    }
}
