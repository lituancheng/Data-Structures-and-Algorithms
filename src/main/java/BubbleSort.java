/**
 * 冒泡排序
 *
 * @author ltc
 * @create 2018-02-02 11:04
 **/
public class BubbleSort {

    public static void sort(int[] array){
        for(int n=0;n<array.length-1;n++){  //外层循环次数
            for(int i=0;i<array.length-1-n;i++){    //内层比较次数
                if(array[i]>array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
    }

}
