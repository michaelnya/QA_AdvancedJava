/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doe.john.tests;

import doe.john.math.SimpleCalculator;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author Administrator
 */
public class SimpleCalculatorTest {

    public SimpleCalculatorTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        //initialise all required data
        TestHelper.testDbConnection();
    }

    @AfterClass
    public static void tearDownClass() {
        
    }

    @Before
    public void setUp() {
        
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testAdd() {
        int expectedResult = 8;
        int actualResult = doe.john.math.SimpleCalculator.add(3, 5);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMultiplication() {
        int expectedResult = 39;
        int actualResult = doe.john.math.SimpleCalculator.multiply(13, 3);
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void should_display_empty_basket_with_number_of_items_Total_zero(){

        int expectedTotal = 0;
        
       List<String> basket=   SimpleCalculator.getBasket();
       
        assertEquals(expectedTotal, basket.size());
        
    }
    
    
}
