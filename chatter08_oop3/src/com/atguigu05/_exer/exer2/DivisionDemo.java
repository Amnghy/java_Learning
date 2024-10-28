package com.atguigu05._exer.exer2;

public class DivisionDemo {
    public static void main(String[] args) {


        try {
            int n = Integer.parseInt(args[0]);
            int m = Integer.parseInt(args[1]);

            int result = divide(m, n);
            System.out.println(result);
        } catch (BeloZeroExcetion e) {
            System.out.println(e.getMessage());
        }catch (NumberFormatException e){
            System.out.println("�������Ͳ�һ��");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ȱ�������в���");
        }catch (ArithmeticException e){
            System.out.println("��0");
        }


    }



    public static int divide(int m,int n) throws BeloZeroExcetion{
        if(m < 0 || n < 0){
            throw new BeloZeroExcetion("������ڸ���");
        }
        return m / n;
    }
}
