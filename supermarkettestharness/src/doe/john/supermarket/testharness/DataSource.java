package doe.john.supermarket.testharness;


import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrator
 */
public class DataSource {

    private static List<String> names = new ArrayList<>();

    public static List<String> getNames() {
        names.add("Tofu");
        names.add("Milk");
        names.add("Baked Beans");
        names.add("Butter");
        names.add("Marmite");
        names.add("Toothpaste");
        return names;
    }
}
