
public class Price {

    public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ

    int price1 = 155;
    int tax1 = tax(price1);
    System.out.print(price1 + "円の商品の税込価格は" + (price1 + tax1) + "円(消費税は" + tax1 + "円)です。");

    }

    public static int tax(int price) {

    int taxper = 10;
    return price * taxper / 100;
    }

}
