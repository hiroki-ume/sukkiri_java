public class Main {
    public static  void main(String[] args){
        int [] scores = {20, 30, 40, 50, 80};
        int sum = 0;
        for(int i = 0; i < scores.length; i++){
            sum += scores[i];
        }
        int avg = sum / scores.length;
        System.out.println("合計点：" + sum);
        System.out.println("平均点：" + avg);

        // ５０点以上の科目の数を調べる
        int count = 0;
        for (int i = 0; i < scores.length; i++){
            if (scores[i] >= 50) {
                count ++;
            }
        }
        System.out.println("５０点以上の科目の数は：" + count);

        System.out.println("-----------");

        // DNAの記号をランダムに表示するプログラム
        int[] seq = new int [10];

        // 塩基配列をランダムに生成
        for (int i = 0; i < seq.length; i++) {
            seq[i] = new java.util.Random().nextInt(4);
        }

        // 生成した塩基配列の記号を表示
        for (int i = 0; i < seq.length; i++) {
            char[] base = {'A', 'T', 'G', 'C'};
            System.out.print(base[seq[i]] + " ");
        }

        // 拡張for文
        for (int value : scores) {
            System.out.println(value);
        }

        // nullの利用(エラーになる)

        // int[] array = {1, 2, 3};
        // array = null;
        // array[0] = 10;

        // 二次元配列の利用
        System.out.println("--------------");
        int[][] scores1 = new int[2][3];
        scores1[0][0] = 40;
        scores1[0][1] = 50;
        scores1[0][2] = 60;
        scores1[1][0] = 80;
        scores1[1][1] = 70;
        scores1[1][2] = 60;
        System.out.println(scores1[1][1]);
        System.out.println("--------------");


        // 親配列と子配列
        int[][] scores2 = {{40, 50, 60}, {80, 60, 70}};
        System.out.println(scores2.length);
        System.out.println(scores2[0].length);

    }
}
