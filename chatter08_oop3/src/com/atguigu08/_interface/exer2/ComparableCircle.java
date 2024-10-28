package com.atguigu08._interface.exer2;

public class ComparableCircle extends Circle implements CompareObject{
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    //根据对象半径的大小
    @Override
    public int compareTo(Object o) {
        if (this == o){
            return 0;
        }
//        if (o instanceof ComparableCircle){
//            ComparableCircle c = (ComparableCircle) o;
//            this.getRadius() - c.getRadius()
//        }
        if (o instanceof ComparableCircle){
            ComparableCircle c = (ComparableCircle) o;
//            if (this.getRadius() > c.getRadius()){
//                return 1;
//            }else if (this.getRadius() < c.getRadius()){
//                return -1;
//            }else {
//                return 0;
//            }
            return Double.compare(this.getRadius(),c.getRadius());
        }
        return 2;
    }
}
