import java.util.Arrays;

public class MyArrays {

    /**
     * 获取int数组最大值
     * @param arr 要获取最大值的数组
     * @return 数组最大值
     */
    public int getMax(int[] arr){
        int max = arr[0];
        for (int i = 1;i < arr.length;i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * 获取最小值数组
     * @param arr
     * @return 最小值
     */
    public int getmin(int[] arr){
        int min = arr[0];
        for (int i = 1;i < arr.length;i++){
            if (min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    public int getsum(int[] arr){
        int sum = arr[0];
        for (int i = 1;i < arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }
    public int getavg(int[] arr){
        return getsum(arr) / arr.length;
    }
    public void print(int[] arr){
        System.out.print("[");
        for (int i = 0;i < arr.length;i++){
            if(i==0){
                System.out.print(arr[i]);
            }else {
                System.out.print(","+arr[i]);
            }
        }
        System.out.print("]");
    }
    public int[] copy(int[] arr){
        int[] newarr = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            newarr[i] = arr[i];
        }

        return newarr;
    }
    public void reverse(int[] arr){
//        for(int i = 0;j = arr.length - 1;i < j;i++,j--){
//
//        }
    }
    public void sort(int[] arr){
        for(int j = 0;j<arr.length-1;j++){
            for(int i=0;i<arr.length - 1 -j;i++){
                if(arr[i]>arr[i+1]){
                    int tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                }
            }
        }
    }

    /**
     * 使用线性查找算法，查找指定元素
     * @param arr 待查找的元素
     * @param number 查找的元素
     * @return 返回-1则未找到，返回值为位置
     */
    public int search(int[] arr,int number){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == number){
                return i+1;
            }
        }

        return -1;
    }


}
