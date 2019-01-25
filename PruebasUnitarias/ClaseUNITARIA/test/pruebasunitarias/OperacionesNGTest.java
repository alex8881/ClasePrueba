package pruebasunitarias;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OperacionesNGTest {
    
    public OperacionesNGTest() {
    }
    @BeforeClass
    public static void setUpClass() throws Exception {
    }
    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    @BeforeMethod
    public void setUpMethod() throws Exception {
    }
    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    @Test
    public void testSuma() {   
        System.out.println("Suma");
        float num1 = 2.0F;
        float num2 = 2.0F;
        Operaciones instance = new Operaciones();
        float expResult = 4.0F;
        float result = instance.Suma(num1, num2);
        assertEquals(result, expResult, 15.0);
    }
    @Test
    public void testResta() {
        System.out.println("Resta");
        float num1 = 0.0F;
        float num2 = 0.0F;
        Operaciones instance = new Operaciones();
        float expResult = 0.0F;
        float result = instance.Resta(num1, num2);
        assertEquals(result, expResult, 0.0);   
    }
    @Test
    public void testMultiplicacion() {
        System.out.println("Multiplicacion");
        float num1 = 0.0F;
        float num2 = 0.0F;
        Operaciones instance = new Operaciones();
        float expResult = 0.0F;
        float result = instance.Multiplicacion(num1, num2);
        assertEquals(result, expResult, 0.0);
    }
    @Test
    public void testDivision() {
        System.out.println("Division");
        float num1 = 0.0F;
        float num2 = 0.0F;
        Operaciones instance = new Operaciones();
        float expResult = 0.0F;
        float result = instance.Division(num1, num2);
        assertEquals(result, expResult, 0.0);
    }
    
}
