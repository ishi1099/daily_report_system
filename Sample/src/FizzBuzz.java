
public class FizzBuzz {

    public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ

    int a = 1;

    for(a = 1; a <= 100; a++){
        if(a % 3 == 0){
            System.out.print("Fizz");
        }
        if(a % 5 == 0){
            System.out.print("Buzz");
        }
        if(a % 3 != 0 && a % 5 != 0){
            System.out.print(a);
        }
        System.out.println();

        }

    }

}
