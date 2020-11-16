package vn.com.tma.models;

public class Circle implements Shape {


    @Override
    public void draw() {
        System.out.println("Drawing circle ...");
    }

    @Override
    public Shape getShape() {
        return this;
    }

}