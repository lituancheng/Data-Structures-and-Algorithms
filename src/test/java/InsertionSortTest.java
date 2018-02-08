import org.junit.Test;

import java.util.Arrays;

/**
 * 插入排序测试
 *
 * @author ltc
 * @create 2018-02-08 11:19
 **/
public class InsertionSortTest {

    @Test
    public void test(){
        int[] array = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        InsertionSort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
