/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.seriesmodel;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author abuba
 */
public class SeriesTest {
    Series test = new Series();
    
    public void populate(){
        test.details[0] = new Series ("100", "Hi", "14", "15");
        test.count = 1;
    }
    
    public SeriesTest() {
    }

    /**
     * Test of Capture method, of class Series.
     */
    @Test
    public void testCapture() {
    }

    /**
     * Test of CorrectAgeRestriction method, of class Series.
     */
    @Test
    public void testCorrectAgeRestriction() {
       boolean Expected = true;
       boolean Actual = test.CorrectAgeRestriction("15");
       assertEquals(Expected,Actual);
    }
    
     @Test
    public void testCorrectAgeRestrictionfail() {
        boolean Expected = false;
        boolean Actual = test.CorrectAgeRestriction("1");
        assertEquals(Expected,Actual);
    }

    /**
     * Test of Search method, of class Series.
     */
    @Test
    public void testSearch() {
       populate();
       int Expected = 1;
       int Actual = test.Search("100");
       assertEquals(Expected,Actual);
    }
    
    @Test
    public void testSearchfail() {
       populate();
       int Expected = 0;
       int Actual = test.Search("101");
       assertEquals(Expected,Actual);
    }

    /**
     * Test of update method, of class Series.
     */
    @Test
    public void testUpdate() {
        populate();
       int Expected = 1;
       int Actual = test.Search("100");
       assertEquals(Expected,Actual);
    }
    
    public void testUpdatefail() {
        populate();
       int Expected = 1;
       int Actual = test.Search("101");
       assertEquals(Expected,Actual);
    }

    /**
     * Test of delete method, of class Series.
     */
    @Test
    public void testDelete() {
       populate();
       int Expected = 1;
       int Actual = test.Search("100");
       assertEquals(Expected,Actual);
    }
    
    public void testDeletefail() {
        populate();
       int Expected = 1;
       int Actual = test.Search("101");
       assertEquals(Expected,Actual);
    }
    

    /**
     * Test of SeriesReport method, of class Series.
     */
    @Test
    public void testSeriesReport() {
    }

    /**
     * Test of ExitSeriesApplication method, of class Series.
     */
    @Test
    public void testExitSeriesApplication() {
    }
    
}
