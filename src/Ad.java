/**
 * @author maguobao
 * @date 2018/07/25
 * @time 2:56
 */
public class Ad {
    public static void main(String[] args) {
        //利用时间戳生成随机数   时间戳为13位
        String id = String.valueOf(System.currentTimeMillis());
        //暂定编号 LP+  10位数
       // settlement.setNumber("JS" + id.substring(3, 13));
        System.out.println("JS" + id.substring(2, 12));
    }
}
