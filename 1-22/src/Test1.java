import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test1 {
	public static void main(String[] args) {
		String shinyaBirthday = "1998/03/19";
		String minamiBirthday = "2000/02/14";
		String furuyamaBirthday = "1998/09/12";
		//改行
		System.out.println("問１");
		//問題1:現在の時刻を出力してください
		Date date = new Date();
		System.out.println(date.toString());
		
		//改行
		System.out.println("問２");
		//問題2:shinyaBirthdayとminamiBirthdayを日付型に変更し条件式で誕生日を比較し早い方の日付を文字列型で出力しなさい。
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

	        try {
	            Date shinyaDate = sdf.parse(shinyaBirthday);
	            Date minamiDate = sdf.parse(minamiBirthday);

	            if (shinyaDate.before(minamiDate)) {
	                System.out.println(sdf.format(shinyaDate));
	            } else if (minamiDate.before(shinyaDate)) {
	                System.out.println(sdf.format(minamiDate));
	            } else {
	                System.out.println(sdf.format(shinyaDate));
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		//改行
		System.out.println("問３");
		//問題3:furuyamaBirthdayに５年2ヶ月追加した値を文字列型で表示しなさい
		 Calendar cal = Calendar.getInstance();
	        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
	        try {
	            Date furuyamaDate = sdf1.parse(furuyamaBirthday);

	            cal.setTime(furuyamaDate);
	            cal.add(Calendar.YEAR, 5);
	            cal.add(Calendar.MONTH, 2);

	            Date d1 = cal.getTime();
	            System.out.println(sdf1.format(d1));
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}
	}