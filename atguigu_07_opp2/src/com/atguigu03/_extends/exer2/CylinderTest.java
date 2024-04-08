package com.atguigu03._extends.exer2;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cyds = new Cylinder();

        cyds.setRadius(2.3);
        cyds.setLength(1.4);

        System.out.println(cyds.findVolume());
        System.out.println(cyds.findArea());

    }
}
