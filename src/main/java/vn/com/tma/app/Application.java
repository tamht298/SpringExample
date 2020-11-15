package vn.com.tma.app;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import vn.com.tma.models.Drawing;
import vn.com.tma.models.Shape;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Drawing drawing = (Drawing) context.getBean("drawing");

        drawing.draw();
        System.out.println("Shape hashcode:" + drawing.hashCode());
        System.out.println("Shape in drawing: " + drawing.getShape().hashCode());

        Drawing drawing1 = (Drawing) context.getBean("drawing");
        drawing1.draw();
        System.out.println("Shape1 hashcode:" + drawing1.hashCode());
        System.out.println("Shape1 in drawing1: " + drawing1.getShape().hashCode());


        Shape shape = (Shape) context.getBean("shape");
        System.out.println("shape: " + shape.hashCode());

        Shape shape1 = (Shape) context.getBean("shape");
        System.out.println("shape1:" + shape1.hashCode());


    }
}
