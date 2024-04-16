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
            System.out.println("面积相等");
        }else {
            System.out.println("面积不相等");
        }
    }

    /**
     * 比较两个几何图形面积是否相等
     * @param g1
     * @param g2
     * @return true 面积相等，false 面积不想等
     */
    public boolean equalsArea(GeometricObject g1,GeometricObject g2){
        return g1.findArea() == g2.findArea();

    }

    public void displayGeometricObjet(GeometricObject g){
        System.out.println("几何图形的面积是："+g.findArea());

    }
}
