/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics.pkg30.pkg10.tutorial;

/**
 *
 * @author Administrator
 * @param <T>
 */
public class Box<T> {

    private  T t;

    public Box(T t) {
        this.t = t;
    }

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

}
