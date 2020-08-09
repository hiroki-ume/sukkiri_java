public class Practice {
    public static void main(String[] args) {
        System.out.println("お腹が空いていたら1を、空いていなかったら0を入力してください");
        int isHungry = new java.util.Scanner(System.in).nextInt();

        System.out.println("こんにちは");
        System.out.println(isHungry == 0 ? "お腹がいっぱいです" : "はらぺこです");
        if (isHungry == 1) {
            System.out.println("なにを食べたいですか？");
            String food = new java.util.Scanner(System.in).nextLine();
            System.out.println(food + "をいただきます");
        }

        System.out.println("ごちそうさまでした");
        System.out.println("--------------------");

        // 練習３−４
        System.out.println("晴れならtrue、晴れじゃなければ空欄で構いません。");
        String tenki = new java.util.Scanner(System.in).nextLine();
        if (tenki.equals("true")) {
            System.out.println("晴れなので、洗濯をします");
            System.out.println("散歩をします");
        } else {
            System.out.println("晴れじゃないので、DVDを見ます");
            System.out.println("寝ます");
        }
        System.out.println("------------");

        // 練習３−５
        System.out.print("「メニュー」１：検索　２：登録　３：削除　４：変更");
        int selected = new java.util.Scanner(System.in).nextInt();

        switch(selected) {
            case 1:
                System.out.println("検索します");
                break;
            case 2:
                System.out.println("登録します");
                break;
            case 3:
                System.out.println("削除します");
                break;
            case 4:
                System.out.println("変更します");
                break;
        }

        System.out.println("----------------");

        // 練習３−６
        System.out.println("数当てゲーム");
        int ans = new java.util.Random().nextInt(10);

        for (int i = 0; i < 5; i++) {
            System.out.println("0~9 の数字を入力してください");
            int num = new java.util.Scanner(System.in).nextInt();

            if (num == ans) {
                System.out.println("アタリ！");
                break;
            } else {
                System.out.println("違います");
            }
        }
        System.out.println("ゲームを終了します");
    }
}
