/**
 * @author maguobao
 * @date 2018/08/22
 * @time 0:31
 */
public class learnDIgui {
	/**
	 * 递归
	 */
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < 101; i++) {
			sum += i;
			if (i == 100) {
				System.out.println(sum);
			}
		}
		main1();
		System.out.println(sum(100));
		System.out.println(sumCount(100));
		System.out.println(multiply(100));
	}

	// while 求和
	public static void main1() {
		int sum = 0;
		int i = 0;
		while (i <= 100) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}

	// 递归求和  递归缺点:处理不当会导致栈溢出
	public static int sum(int num) {
		if (num == 1) {
			return 1;
		}
		return num + sum(num - 1);
	}

	public static double multiply(int num) {
		if (num == 1) {
			return 1;
		}
		return num * multiply(num - 1);
	}

	public static double sumCount(int num) {
		if (num == 1) {
			return 1;
		}
		return multiply(num) + sumCount(num - 1);
	}
// 测试一下
}
