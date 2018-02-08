/**
 * 插入排序
 *
 * @author ltc
 * @create 2018-02-08 11:15
 **/
public class InsertionSort {

    public static void sort(int[] array){
        for(int i=1;i<array.length;i++){    //i前面的元素都已排好序
            int temp = array[i];    //待插入元素
            int j = i - 1;
            for(;j>=0&&array[j]>temp;j--){  //所有元素都小于待插入元素，或者找到了插入位置
                array[j+1] = array[j];  //元素后移
            }
            array[j+1] = temp;  //由于上一步j--，所以此处是j+1
        }
    }
}
