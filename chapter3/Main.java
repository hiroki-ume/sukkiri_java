public class Main {
    public static void main(String[] args){
        boolean tenki = true;
        if (tenki == true) {
            System.out.println("洗濯をします");
            System.out.println("散歩にいきます");
        } else {
            System.out.println("DVDを見ます");
        }

        // トイレの空きを待つ繰り返し
        boolean doorClose = false;
        while (doorClose == true) {
            System.out.println("ノックする");
            System.out.println("１分待つ");
        }

        // すっきりしないコード例
        System.out.println("あなたの運勢を占います");
        int fortune = new java.util.Random().nextInt(4) + 1;
        if (fortune == 1) {
            System.out.println("大吉");
        } else if (fortune == 2) {
            System.out.println("中吉");
        } else if (fortune == 3) {
            System.out.println("吉");
        } else {
            System.out.println("凶");
        }

        // break文忘れ
        System.out.println("あなたの運勢を占います");
        switch (fortune) {
            case 1:
                System.out.println("大吉");
            case 2:
                System.out.println("中吉");
            case 3:
                System.out.println("吉");
            case 4:
                System.out.println("凶");
        }

        // あえてbreak文を書かない
        switch (fortune) {
            case 1:
            case 2:
                System.out.println("いいね！");
                break;
            case 3:
                System.out.println("普通です");
                break;
            case 4:
            case 5:
                System.out.println("うーん。。。");
        }

        // 基本的なfor文
        for (int i = 0; i < 10; i++){
            System.out.println("こんにちは");
        }

        // ループ変数の内容を表示
        for (int n = 0; n < 3; n++) {
            System.out.print("現在" + (n + 1) + "周目→");
            System.out.println("");
        }

        // 九九の出力
        for (int f = 1; f < 10; f++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(f * j);
                System.out.print("　");
            }
            System.out.println(" ");
        }
    }
}
