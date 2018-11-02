/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.pkg29.pkg10.tutorial;

import com.qa.domain.Address;
import com.qa.domain.Circle;
import com.qa.domain.Coordinate;
import com.qa.domain.Printer;
import com.qa.domain.Shape;
import com.qa.domain.ShapeException;
import com.qa.domain.Triangle;
import com.qa.interfaces.Printable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class Collections2910Tutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ShapeException {
        // TODO code application logic here
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            //populate the array by referencing the array index position
            numbers[i] = (int) (Math.random() * 100);
        }

        List<Integer> scores = new ArrayList<>();
        scores.add(1);
        scores.add(10);

        double sum = 0;
        for (Integer o : scores) {
            sum += o;
        }
        System.out.println(sum);

        sortShapes();
        
        Collections2910Tutorial.<String,Integer>process(args, 5);
        
        Printable address  = new Address("122 Eagles Rest", "Lower Zambezi", "10101");
        Printer.doPrint(address);
        
        Printable triangle =new Triangle(3, 4, 5);
        Printer.doPrint(triangle);
        
        Shape s  = (Shape)triangle;
        
        
    }

    private static <T, U> void process(T[] things, U something) {

    }
    
    
    private static <E> void print(E[] list){
        
    }
    
    private static<E extends Shape> void print(List<E> shapes){
        
    }

    private static void sortShapes() throws ShapeException {
        List<Shape> triangles = new ArrayList<>();
        
        triangles.add(new Triangle(4,3,5));
        triangles.add(new Triangle(40, 30, 50));
        
        Collections.sort(triangles);
        
        triangles.forEach((t) -> {
            System.out.println(t);
        });        

    }

}
