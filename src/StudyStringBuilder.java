import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

/**
 * @author maguobao
 * @date 2018/07/28
 * @time 18:52
 */
public class StudyStringBuilder {
	public static void main(String[] args) {
		// 比较String和StringBuilder
		StringBuilder stringBuilder=new StringBuilder();
		stringBuilder.append("启智");
		System.out.println(stringBuilder);
		System.out.println("----华丽的分割线 ------");
		for (int i = 1; i < 5; i++) {
			stringBuilder= stringBuilder.append("科技");
			System.out.println("第" + i + "次添加" + stringBuilder);
		}

	}



}
