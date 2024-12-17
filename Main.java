public class Main {
    public static void main(String[] args) {
        String str = null;
        
        try {
            // strがnullなので、ここでNullPointerExceptionが発生する
            System.out.println(str.length());
        } catch (NullPointerException e) {
            // 例外処理
            System.out.println("NullPointerExceptionが発生しました。");
            System.out.println("エラーメッセージ: " + e.getMessage());
        }
    }
}
