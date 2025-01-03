public class exe2 {
    public void method1(){
        for (int i = 0;i < 10;i++){
            for (int j = 0;j < 8;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public int method2(){
        for (int i = 0;i < 10;i++){
            for (int j = 0;j < 8;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        return 10 * 8;
    }
    public int method3(int m,int n){
        for (int i = 0;i < m;i++){
            for (int j = 0;j < n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        return m * n;
    }
}
