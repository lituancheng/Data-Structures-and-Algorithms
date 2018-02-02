/**
 * 选择排序
 *
 * @author ltc
 * @create 2018-02-02 12:15
 **/
public class SelectSort {

    public static void sort(int[] array){
        for(int n=0;n<array.length-1;n++){  //n是待交换元素下标
            int minIndex = n;
            for(int i=n+1;i<array.length;i++){
                if(array[i]<array[minIndex]){
                    minIndex = i;   //记录最小元素位置
                }
            }
            if(minIndex != n){
                int temp = array[n];
                array[n] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }
}
