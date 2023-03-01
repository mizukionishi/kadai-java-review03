package baseball;

public class Review03 {

    public static void main(String[] args) {
        BaseBallTeam baseballteam1 = new BaseBallTeam("東京ヤクルトスワローズ", 80,59, 4);
        BaseBallTeam baseballteam2 = new BaseBallTeam("横浜DeNAベイスターズ", 73, 68,2 );
        BaseBallTeam baseballteam3 = new BaseBallTeam("阪神タイガース", 68, 71, 4);
        BaseBallTeam baseballteam4 = new BaseBallTeam("読売ジャイアンツ", 68, 72, 3);
        BaseBallTeam baseballteam5 = new BaseBallTeam("広島東洋カープ", 66, 74, 3);
        BaseBallTeam baseballteam6 = new BaseBallTeam("中日ドラゴンズ", 66, 75, 2);

        baseballteam1.report();
        baseballteam2.report();
        baseballteam3.report();
        baseballteam4.report();
        baseballteam5.report();
        baseballteam6.report();

    }

}
