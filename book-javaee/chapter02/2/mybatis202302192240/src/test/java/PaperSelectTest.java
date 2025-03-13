import java.util.Random;

/**
 * Auther:bingli
 * ClassName:PaperSelectTest
 * Package:PACKAGE_NAME
 * Description:
 *
 * @date:2023/3/2-03-02 13:31
 * @author:2550976002@qq.com
 * @version:1.0
 */
public class PaperSelectTest {

    public static void main(String[] args) {

        Random random = new Random();

        for (int i = 1; i < 46; i++) {
            int index1 = random.nextInt(14) + 1;
            System.out.println(i + "---" + index1);
            if (i > 40) {
                int index2 = random.nextInt(14) + 1;
                System.out.println(i + "---" + index2);
            }
        }

    }

}
