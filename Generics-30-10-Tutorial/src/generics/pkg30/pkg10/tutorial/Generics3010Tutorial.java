/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics.pkg30.pkg10.tutorial;

/**
 *
 * @author Administrator
 */
public class Generics3010Tutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        print(new Integer[]{2, 3, 6, 7, 3, 6, 7});
        print(new String[]{"2", "3", "6 january", "7", "3", "6", "7"});
        
        Box<Integer> myBox  = new Box<>(12);
        int x = myBox.get();
        myBox.set(13);
        
    }

    /**
     * This methods prints arrays in reverse order
     * @param <T>
     * @param items 
     */
    public static <T> void print(T[] items) {
        for (int i = 0; i < 10; i++) {
            //implement an efficent reverse algorithm
        }
    }

}
