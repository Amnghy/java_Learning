package com.atguigu06._polymorpism.exec1;

public class GeometricTest {
    public static void main(String[] args) {
        GeometricTest test = new GeometricTest();
        Circle c = new Circle("red",1.0,2.3);
        Circle c2 = new Circle("blue",1.0,3.3);
        test.displayGeometricObjet(c);
        test.displayGeometricObjet(c2);
        boolean isEquals = test.equalsArea(c,c2);
        if(isEquals){
            System.out.println("������");
        }else {
            System.out.println("��������");
        }
    }

    /**
     * �Ƚ���������ͼ������Ƿ����
     * @param g1
     * @param g2
     * @return true �����ȣ�false ��������
     */
    public boolean equalsArea(GeometricObject g1,GeometricObject g2){
        return g1.findArea() == g2.findArea();

    }

    public void displayGeometricObjet(GeometricObject g){
        System.out.println("����ͼ�ε�����ǣ�"+g.findArea());

    }
}
