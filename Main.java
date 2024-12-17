public class Main {
    public static void main(String[] args) {
        // ステップ1: NullPointerExceptionを発生させるコード
        String str = null;
        System.out.println(str.length()); // ここで NullPointerException が発生
    }
}