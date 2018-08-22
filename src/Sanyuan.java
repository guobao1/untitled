/**
 * @author maguobao
 * @date 2018/08/08
 * @time 9:45
 */
public class Sanyuan {
	public static void main(String[] args) {
		// 三元表达式
		int a = 11; //整租
		int b = 2; //合租
		int qq=4;
		int c = a > b ? 3 : 4;
		int d = true ? 3 : 4;
		int e = false ? 3 : 4;
		System.out.println("c=" + c);
		System.out.println("d=" + d);
		System.out.println("e=" + e);
		int f = (a == 1 ? 1 : qq);
		for (int i = 1; i <=f ; i++) {
			System.out.println("1111111");
			switch (i) {
				case 1:
					System.out.println("A");
					break;
				case 2:
					System.out.println("B");
					break;
				case 3:
					System.out.println("C");
					break;
				case 4:
					System.out.println("D");
					break;
				case 5:
					System.out.println("E");
					break;
				case 7:
					System.out.println("11111111");
					break;
				default:
			}
		}

	}
}
