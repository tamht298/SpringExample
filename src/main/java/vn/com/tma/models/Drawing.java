package vn.com.tma.models;

import org.springframework.beans.factory.annotation.Value;

public class Drawing {
    private Shape shape;
    private String author;

    public Drawing(Shape shape) {
        this.shape = shape;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void preparing() {
        System.out.println("Preparing ...");
    }

    public void draw() {
        shape.draw();
    }
}
