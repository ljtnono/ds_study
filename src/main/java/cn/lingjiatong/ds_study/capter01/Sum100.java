package cn.lingjiatong.ds_study.capter01;

/**
 * 计算1到100的和
 *
 * @author Ling, Jiatong
 * Date: 2023/5/18 09:57
 */
public class Sum100 {

    public static int sum100Demo1() {
        int result = 0;
        for (int i = 1; i <= 100; i++) {
            result += i;
        }
        return result;
    }

    public static int sum100Demo2() {
        // 等差数列求和
        return (100 + 1) * 100 / 2;
    }

    public static void main(String[] args) {
        System.out.println(sum100Demo2());
    }
}
