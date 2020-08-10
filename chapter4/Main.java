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
    }
}
