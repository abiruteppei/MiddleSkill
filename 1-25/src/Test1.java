import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test1 {
	public static void main(String[] args) {
		//改行
		System.out.println("問１");
		//問題1:下記条件になるようログの出力を行いなさい。

		//条件１　例外でヌルポが発生させヌルポをキャッチした場合のみログ出力がされるプログラムにする事
		//条件２　"middleskill log"という名前のログのインスタンスを生成する事
		//条件３　srcディレクトリ内に"middleskill.log"としてログ出力される設定にする事
		//条件４　ログの内容はコンソールに出ている赤文字と同じ内容のものが表示される事
		//条件５　格納するログメッセージは"ミドルスキルログが発生しました。"という文言にする事

		final Logger logger = Logger.getLogger("middleskill log");

		try {
			FileHandler fileHandler = new FileHandler("src/middleskill.log");
			logger.addHandler(fileHandler);

			ConsoleHandler consoleHandler = new ConsoleHandler();
			logger.addHandler(consoleHandler);

			String str = null;
			str.toString();
		} catch (IOException e) {

			logger.log(Level.INFO, "ミドルログが発生しました。");
		}
	}
}
