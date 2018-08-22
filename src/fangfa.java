/**
 * @author maguobao
 * @date 2018/08/21
 * @time 22:48
 */
public class fangfa {
	// 方法调用 使主方法简洁   一般都是调用主方法
	public static void main(String[] args) {
		swichCaseMain(2);
		intType();
		numberType("帅");
		System.out.println(numberType("帅"));
		testReturnNull(3);

	}

	public static void swichCaseMain(int a) {
		int f = (a == 1 ? 1 : 3);
		for (int i = 1; i <= f; i++) {
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

	public static void intType() {
		System.out.println("int类型");
	}

	public static int numberType(String b) {
		return 11;
	}

	public static void testReturnNull(int c) {
		if (c != 3) {
			return;
		}
		System.out.println("请输入宝大爷");
	}
}
