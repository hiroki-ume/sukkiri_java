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
	}
    // 引数ありのメソッド
    public static void hello(String name){
      System.out.println(name + "こんにちは");
    }
    // 複数の引数を渡すメソッド
    public static void add(int x, int y) {
        int ans = x + y;
        System.out.println(x + "+" + y + "=" + ans);
    }
}
