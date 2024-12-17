public class Main {
    public static void main(String[] args) {
        String str = "壱百満"; // 文字列を代入
        try {
            int value = Integer.parseInt(str); // 変換を試みる
            System.out.println(value); // 成功した場合、変換された値を出力
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatExceptionが発生しました。"); // 例外発生時のメッセージ
            System.out.println("エラーメッセージ: " + e.getMessage()); // 例外の詳細メッセージ
        }
    }
}