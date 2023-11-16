import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Test1 {
	public static void main(String[] args) {

		// 改行

		System.out.println("問１");

		// 問題1: 下記条件になるようログの出力を行いなさい。

		// 条件１ 例外でヌルポが発生させヌルポをキャッチした場合のみログ出力がされるプログラムにする事
		try {
			throwNullPointerException();
		} catch (NullPointerException e) {

			// 条件２ "middleskill log" という名前のログのインスタンスを生成する事
			Logger logger = Logger.getLogger("middleskill log");

			// 条件３ srcディレクトリ内に "middleskill.log" としてログ出力される設定にする事
			try {
				FileHandler fileHandler = new FileHandler("src/middleskill.log");
				logger.addHandler(fileHandler);
				fileHandler.setFormatter(new SimpleFormatter());

				// 条件４ ログの内容はコンソールに出ている赤文字と同じ内容のものが表示される事
				logger.setLevel(Level.ALL);

				// 条件５ 格納するログメッセージは "ミドルスキルログが発生しました。" という文言にする事
				logger.log(Level.SEVERE, "ミドルスキルログが発生しました。", e);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	private static void throwNullPointerException() {
		throw new NullPointerException();
	}
}
