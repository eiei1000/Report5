public class Main {
    public static void main(String[] args) {
        // String型変数strにnullを代入
        String str = null;

        try {
            // str.length()を呼び出し
            System.out.println(str.length());
        } catch (NullPointerException e) {
            // NullPointerExceptionをキャッチ
            System.out.println("NullPointerExceptionが発生しました。");
            // エラーメッセージを表示
            System.out.println("エラーメッセージ: " + e.getMessage());
        }
    }
}