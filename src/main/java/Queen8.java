public class Queen8 {

    static int count;   //解法数量

    int max = 8;

    int[] array = new int[max]; //下标表示行数，元素值表示列数

    public void check(int n){
        if(n == max){   //排列完成
            count++;
            print();
            return;
        }
        for(int i=0;i<max;i++){
            array[n] = i;
            if(judge(n)){
                check(n+1);
            }
        }
    }

    private boolean judge(int n){
        for(int i=0;i<n;i++){   //循环到n-1，排序掉同一行的情况
            if(array[n]==array[i] || Math.abs(n-i)==Math.abs(array[n]-array[i])){  //同列或处于对角线
                return false;
            }
        }
        return true;
    }

    private void print(){
        System.out.println("第"+count+"种解法：");
        for(int i=0;i<max;i++){
            for(int j=0;j<max;j++){
                if(array[i] == j)
                    System.out.print("1  ");
                else
                    System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Queen8().check(0);
        System.out.println(count);
    }
}