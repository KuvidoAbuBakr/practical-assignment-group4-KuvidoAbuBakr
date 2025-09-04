/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package PartB;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author abuba
 */
public class ElectronicsTest {
    Electronics test = new Electronics();
    
   public void populate(){
        test.El[0] = new Electronics ("Iphone", 900, 40);
    }
    
    public ElectronicsTest() {
    }

    /**
     * Test of Sell method, of class Electronics.
     */
    @Test
    public void testSell() {
        populate();
       int Expected = 30;
       int Actual = test.decrease(10,0);
       assertEquals(Expected,Actual);
    }

    /**
     * Test of Buy method, of class Electronics.
     */
    @Test
    public void testBuy() {
       populate();
       int Expected = 50;
       int Actual = test.Increase(10,0);
       assertEquals(Expected,Actual);
    }

    /**
     * Test of NewItem method, of class Electronics.
     */
    @Test
    public void testNewItem() {
    }

    /**
     * Test of GetDetails method, of class Electronics.
     */
    @Test
    public void testGetDetails() {
    }

    /**
     * Test of ExitSeriesApplication method, of class Electronics.
     */
    @Test
    public void testExitSeriesApplication() {
    }
    
}
