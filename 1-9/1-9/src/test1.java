public class test1 {
        public static void main(String[] args) {
                
			//1.数字の5と9の変数を定義し、足した数字を出力しなさい。
			int a = 5;
			int b = 9;
			int c = a + b;
			System.out.println(c);
			
			//2.64ビット整数の「1111111111」を定義し2倍した値を出力しなさい。
            long num = 1111111111L;
            System.out.println(num*2);
            
            
			//3.boolean型の変数の値に不正な文字列比較を入れてfalseを出力してください。 

            boolean result = true;

            String input = "ABCD";
            if (input.equals("abcd")) {
            	result = true; 
            } else {
            	result = false; 
            }

            System.out.println(result);
        
        }
        }
