public class Main {
    public static void main(String[] args) {
        String str = "壱百満"; // 文字列 "壱百満" を代入
        try {
            int value = Integer.parseInt(str); // ここで例外が発生
            System.out.println(value);
        } catch (NumberFormatException e) {
            System.out.println("例外が発生しました: " + e.getMessage());
        }
    }
}