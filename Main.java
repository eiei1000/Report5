public class Main {
    public static void main(String[] args) {
        // String型変数strをnullで初期化
        String str = null;

        // str.length()を呼び出すとNullPointerExceptionが発生する
        System.out.println(str.length());
    }
}