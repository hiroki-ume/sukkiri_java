public class Main {
    public static void main(String[] args) {
	   // helloメソッドの呼び出し
	    System.out.println("メソッドを呼び出します");
	    hello("湊");
	    hello("朝香");
	    hello("菅原");
	    System.out.println("メソッドの呼び出しが終わりました");
	    System.out.println("--------------");

	   // addメソッドを呼び出す
	   add(100, 20);
	   add(300, 20);

	   System.out.println("--------------");

	   int ans = add(100, 10);
       System.out.println("計算の結果は" + ans + "です");

       System.out.println("--------------");

        //   戻り値をそのまま使う例
       System.out.println(add(add(10, 20), add(30, 40)));

       System.out.println("--------------");

        //   オーバーロード(引数の型が違う)
        System.out.println(add(10, 20));
        System.out.println(add(3.5, 2.7));
        System.out.println(add("Hello", "World"));

        System.out.println("--------------");

        // オーバーロード(引数の数が違う)
        System.out.println("10 + 20 = " + add(10, 20));
        System.out.println("10 + 20 + 30 = " + add(10, 20, 30));

        System.out.println("--------------");

        int[] array = {1, 2, 3};
        printArray(array);

        System.out.println("--------------");

        incArray(array);
        for (int i : array) {
            System.out.println(i);
        }

        System.out.println("--------------");

        // 戻り値が配列の場合
        array = makeArray(3);
        for (int i : array) {
            System.out.println(i);
        }
	}
    // 引数ありのメソッド
    public static void hello(String name){
      System.out.println(name + "こんにちは");
    }
    // 複数の引数を渡すメソッド
    public static int add(int x, int y) {
        int ans = x + y;
        System.out.println(x + "+" + y + "=" + ans);
        return ans;
    }
    // オーバーロード(引数の型が違う)
    public static double add(double x, double y) {
        return x + y;
    }
    public static String add(String x, String y) {
        return x + y;
    }

    // オーバーロード (引数の数が違う)
    public static int add(int x, int y, int z) {
        return x + y + z;
    }

    // 引数に配列を受け取る
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    public static void incArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i]++;
        }
    }

    public static int[] makeArray(int size) {
        int[] newArray = new int[size];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = i;
        }
        return newArray;
    }
}
