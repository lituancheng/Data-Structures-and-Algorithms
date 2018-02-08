import org.junit.Test;

/**
 * 八皇后测试
 *
 * @author ltc
 * @create 2018-02-08 11:11
 **/
public class Queen8Test {

    @Test
    public void test(){
        new Queen8().check(0);
        System.out.println("\n共有"+Queen8.count+"种解法");
    }
}
