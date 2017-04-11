/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalvend;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author albert
 */
public class FXMLDocumentControllerTest {
    
    public FXMLDocumentControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
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

    /**
     * Test of selectedItems method, of class FXMLDocumentController.
     */
    @Test
    public void testSelectedItems() {
        System.out.println("selectedItems");
        FXMLDocumentController instance = new FXMLDocumentController();
        instance.selectedItems();
       
    }

    /**
     * Test of getFindTotal method, of class FXMLDocumentController.
     */
    @Test
    public void testGetFindTotal() {
        System.out.println("getFindTotal");
        FXMLDocumentController instance = new FXMLDocumentController();
        double expResult = 0.0;
        double result = instance.getFindTotal();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of findTotal method, of class FXMLDocumentController.
     */
    @Test
    public void testFindTotal() {
        System.out.println("findTotal");
        FXMLDocumentController instance = new FXMLDocumentController();
        instance.setFindTotal();
        
    }

    /**
     * Test of setChange method, of class FXMLDocumentController.
     */
    @Test
    public void testSetChange() {
        System.out.println("setChange");
        FXMLDocumentController instance = new FXMLDocumentController();
        instance.setChange();
        
    }

    /**
     * Test of getChange method, of class FXMLDocumentController.
     */
    @Test
    public void testGetChange() {
        System.out.println("getChange");
        FXMLDocumentController instance = new FXMLDocumentController();
        double expResult = 0.0;
        double result = instance.getChange();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of getMoney method, of class FXMLDocumentController.
     */
    @Test
    public void testGetMoney() {
        System.out.println("getMoney");
        FXMLDocumentController instance = new FXMLDocumentController();
        double expResult = 0.0;
        double result = instance.getMoney();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of setMoney method, of class FXMLDocumentController.
     */
    @Test
    public void testSetMoney() {
        System.out.println("setMoney");
        FXMLDocumentController instance = new FXMLDocumentController();
        instance.setMoney();
       
    }

    /**
     * Test of clear method, of class FXMLDocumentController.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        FXMLDocumentController instance = new FXMLDocumentController();
        instance.clear();
      
    }

    /**
     * Test of formatMoney method, of class FXMLDocumentController.
     */
    @Test
    public void testFormatMoney() {
        System.out.println("formatMoney");
        FXMLDocumentController instance = new FXMLDocumentController();
        String expResult = "";
        String result = instance.formatMoney();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of formatChange method, of class FXMLDocumentController.
     */
    @Test
    public void testFormatChange() {
        System.out.println("formatChange");
        FXMLDocumentController instance = new FXMLDocumentController();
        String expResult = "";
        String result = instance.formatChange();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setTextFields method, of class FXMLDocumentController.
     */
    @Test
    public void testSetTextFields() {
        System.out.println("setTextFields");
        FXMLDocumentController instance = new FXMLDocumentController();
        instance.setTextFields();
        
    }

    /**
     * Test of vend method, of class FXMLDocumentController.
     */
    @Test
    public void testVend() {
        System.out.println("vend");
        ActionEvent event = null;
        FXMLDocumentController instance = new FXMLDocumentController();
        instance.vend(event);
        
    }

    /**
     * Test of initialize method, of class FXMLDocumentController.
     */
    @Test
    public void testInitialize() {
        System.out.println("initialize");
        URL url = null;
        ResourceBundle rb = null;
        FXMLDocumentController instance = new FXMLDocumentController();
        instance.initialize(url, rb);
      
    }

    /**
     * Test of setScreenParent method, of class FXMLDocumentController.
     */
    @Test
    public void testSetScreenParent() {
        System.out.println("setScreenParent");
        ScreensController screenParent = null;
        FXMLDocumentController instance = new FXMLDocumentController();
        instance.setScreenParent(screenParent);
       
    }
    
}
