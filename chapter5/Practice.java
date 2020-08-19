public class Practice {
    public static void main(String[] args) {
        introduceOneself();

        System.out.println("-----------------");

        email("こんにちは", "hiroki@gmail", "お世話になります");

        System.out.println("-----------------");

        email("saaya@gmail", "またあとで");
    }

    // 5-1
    public static void introduceOneself() {
        String name = "hiroki";
        int age = 24;
        double height = 171.2;
        char zodiac = '丑';

        System.out.println("こんにちは、私の名前は" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "です");
        System.out.println("干支は" + zodiac + "です");
    }

    // 5-2
    public static void email(String title, String address, String text) {
        System.out.println(address + "に、以下のメールを送信しました。");
        System.out.println("件名：" + title);
        System.out.println("本文：" + text);
    }

    // 5-3
    public static void email(String address, String text) {
        System.out.println(address + "に以下のメールを送信しました");
        System.out.println("件名：無題");
        System.out.println("本文：" + text);
    }

}
