public class Myarrays_Test {
    public static void main(String[] args) {
        MyArrays m1 = new MyArrays();

        int[] arr = new int[]{1,2,3,45,5,6,7,8,9,10,55,60};
        System.out.println("arr最大值为"+m1.getMax(arr));
        System.out.println("arr平均值"+m1.getavg(arr));
        m1.print(arr);
        int ars = m1.search(arr,55);
        System.out.println("找到了，在位置"+ars);
    }
}
