package yakyuu;

public class BaseBall {

    public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ

    BaseBallTeam Giants = new BaseBallTeam("読売ジャイアンツ", 77,64,2);
    BaseBallTeam BayStars = new BaseBallTeam("横浜DeNAベイスターズ",71,69,3);
    BaseBallTeam Tigers = new BaseBallTeam("阪神タイガース",69,68,6);
    BaseBallTeam Carp = new BaseBallTeam("広島東洋カープ",70,70,3);
    BaseBallTeam Dragons = new BaseBallTeam("中日ドラゴンズ",68,73,2);
    BaseBallTeam Swallows = new BaseBallTeam("東京ヤクルトスワローズ",59,82,2);
    
    Giants.report();
    BayStars.report();
    Tigers.report();
    Carp.report();
    Dragons.report();
    Swallows.report();
    }

}
