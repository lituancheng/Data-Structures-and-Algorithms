import org.junit.Test;

import java.util.Arrays;

/**
 * 选择排序测试
 *
 * @author ltc
 * @create 2018-02-02 12:19
 **/
public class SelectSortTest {

    @Test
    public void test(){
        int[] array = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        SelectSort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
