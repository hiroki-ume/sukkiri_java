public class Main {
    public static void main(String[] args){
        // エスケープシーケンス
        System.out.println("私の好きな記号は二重引用符（¥"）です");
        System.out.println("合計金額は¥¥1,000です");

        // インクリメント
        int a = 100;
        a ++;
        System.out.println(a);

        // 強制的な型変換
        int age = (int)3.2;
        System.out.println(age);

        // 異なる型同士の計算
        double d = 8.5 / 2;
        long l = 5 + 2L;
        System.out.println(d);
        System.out.println(l);

        // 命令実行
        String name = "すがわら";
        String message;
        message = name + "さん、こんにちは！";
        System.out.println(message);

        // 改行なし画面出力の命令
        String name1 = "すがわら";
        System.out.print("私の名前は");
        System.out.print(name1);
        System.out.print("です");

        // 大きい方の数値を代入する命令
        int f = 5;
        int h = 10;
        int m = Math.max(f, h);
        System.out.println("比較実験：" + f + "と" + h + "とで大きい方は、、" + m);

        // String型をint型に変換
        // String age = "31";
        // int n = Integer.parseInt(age);
        // System.out.println("あなたは来年、" + (n + 1) + "歳になりますね");

        // 乱数を発生させる
        int r = new java.util.Random().nextInt(90);
        System.out.println("あなたは多分" + r + "歳ですね？");

        // キーボードから入力を受け付ける命令
        System.out.println("あなたの名前を入力してください。");
        String yourName = new java.util.Scanner(System.in).nextLine();
        System.out.println("あなたの年齢を入力してください。");
        int yourAge = new java.util.Scanner(System.in).nextInt();
        System.out.println("ようこそ、" + yourAge + "歳の" + yourName + "さん");

    }
}
