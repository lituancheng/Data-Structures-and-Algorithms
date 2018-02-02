import org.junit.Test;

import java.util.Arrays;

/**
 * 冒泡排序测试
 *
 * @author ltc
 * @create 2018-02-02 11:07
 **/
public class BubbleSortTest {

    @Test
    public void test(){
        int [] array = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        BubbleSort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
