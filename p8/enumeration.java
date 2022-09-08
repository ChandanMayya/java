package p8;

public class enumeration {
    public enum DayOfWeek{
        MONDAY(1),TUESDAY(2),WEDNESDAY(3),THURSDAY(4),FRIDAY(5),SATURDAY(6),SUNDAY(7);
        public int val;
        DayOfWeek(int val){
        this.val=val;
        }
        Boolean isWorkday(){
            if(val<6){
                return true;
            }else
                return false;
        }
    }
    public static void main(String[] args) {
        DayOfWeek D;
        System.out.println("Monday is workday"+DayOfWeek.MONDAY.isWorkday() );
        System.out.println("Sunday is workday"+DayOfWeek.SUNDAY.isWorkday() );
    }
    
    
}
