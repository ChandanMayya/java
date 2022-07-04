public class p6 {
    public static void main(String[] args) {
        student s=new student();
        s.getData(5, "Jigujje");
        s.printData();
    }
}
class student{
    int usn;
    String name;
    void getData(int u,String n){
        this.usn=u;
        this.name=n;
    }
    void printData(){
        System.out.println("USN is:"+usn+"\tNAme is:"+name);
    }
}
