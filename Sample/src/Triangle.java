
public class Triangle {

    public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ

    int a = 8;
    int b = 7;
    int c = 2;
    if(a==b&&b==c){
        System.out.println("三角形ABCは正三角形です");
    }
    else if(a==b||a==c||b==c){
        System.out.println("三角形ABCは二等辺三角形です");
    }
    else{
        System.out.println("三角形ABCは不等辺三角形です");
    }
    }
    
    

}
