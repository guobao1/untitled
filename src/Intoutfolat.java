import java.math.BigDecimal;

/**
 * @author maguobao
 * @date 2018/08/07
 * @time 14:22
 */
public class Intoutfolat {
	public static void main(String[] args) {
		// int 转folat
		int a=10;
		float b=a*1000;
		BigDecimal c=new BigDecimal(a);
		float b1=c.floatValue();
		System.out.println(b/1000.0);
		System.out.println(c);
		System.out.println(b1);
	}
}
