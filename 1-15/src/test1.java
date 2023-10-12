import java.util.Arrays;

public abstract class test1 {
	public static void main(String[] args) {
		//改行
		System.out.println("問１");
		//問１のメソッドを呼び出して出力してください（引数５と１０）
		System.out.println(add(5, 10));
		//改行

		System.out.println("問２");
		//問２のメソッドを呼び出して出力してください（引数"しんぶんし"）
		System.out.println(name("しんぶんし"));

		//改行

		System.out.println("問３");
		//問3のメソッドを呼び出して出力してください（引数,配列[5,3,1,9,4,8]）
		Integer[] i = { 5, 3, 1, 9, 4, 8 };
		sortDescendingOrder(i);
		System.out.println(Arrays.toString(i));

		//改行
		System.out.println("問４");
		//問4のメソッドを呼び出して出力してください（引数,配列[5,3,1,9,4,8]）
		int[] k = { 5, 3, 1, 9, 4, 8 };
		int minIndex = findMinIndex(k);
		System.out.println(minIndex);
	}

	//問題1:2つの整数を受け取り、それらの和を返すメソッドを作成してください。
	public static int add(int x, int y) {
		return x + y;
	}

	//問題2:文字列を受け取り、その文字列が回文であるかどうかを返すメソッドを作成してください。
	public static boolean name(String str) {
		String reversed = new StringBuilder(str).reverse().toString();
		return str.equals(reversed);
	}

	//問題3:整数の配列を受け取り、その配列の要素を降順にソートするメソッドを作成してください。(for文は利用しないこと)
	public static void sortDescendingOrder(Integer[] arr) {
		Arrays.sort(arr, (a, b) -> b - a);
	}

	//問題4:整数の配列を受け取り、その配列の中で最小値を持つ要素のインデックスを返すメソッドを作成してください。
	public static int findMinIndex(int[] arr) {
		int minIndex = 0;
		int minValue = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < minValue) {
				minValue = arr[i];
				minIndex = i;
			}
		}

		return minIndex;
	}
}


