
public class Clock {

    public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ

    int hour = 20;
    int minute = 46;
    int second = 14;
    System.out.print(getsecond(hour,minute,second));
    
    }
    
    public static int getsecond(int hour2,int minute2,int second2){
    
    int result = hour2*3600 + minute2*60 +second2;
    return result;
    }
    
}
