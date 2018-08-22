import sun.net.www.content.text.plain;

import java.math.BigDecimal;

/**
 * @author maguobao
 * @date 2018/08/21
 * @time 23:30
 */
public class learnOverLoad {
	public static void main(String[] args) {
		multiply(3, 5);
		System.out.println(multiply(3, 5));
		System.out.println(multiply(3, 5,1));
		System.out.println(multiply(3.00, 5.00,2,1));
		mainTest(1,1,1);
	}

	public static int multiply(int a, int b) {
		return a * b;
	}

	public static int multiply(int a, int b, int c) {
		return a * b * c;
	}
	public static double multiply(double a, double b, int c,int d) {
		return a * b * c;
	}

	public static void mainTest(int a, int b, int c)  {
		System.out.println("43w4");
	}


}
