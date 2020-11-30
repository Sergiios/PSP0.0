package PSP0;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @autor Sergio Santos da Silva
 */
public class OlimpiadaTest {

    private Olimpiada A, B; 

    @Before
    public void test(){
        ArrayList<Integer> aux = new ArrayList(Arrays.asList(1,2,3,4,5,5,4,3,2,1));
        ArrayList<Integer> aux2 = new ArrayList(Arrays.asList(500,500,500,500,500));
        
        A = new Olimpiada(aux, 3);
        B = new Olimpiada(aux2, 2);
    }
    
    @Test
    public void testGetVitoriosos() {
        assertEquals(4,A.GetVitoriosos());
        assertEquals(5,B.GetVitoriosos());
    }
    
    @Test
    public void testGetDesvioPadraoWin() {
        assertEquals(0.50,A.GetDesvioPadraoWin(),0.01);
        assertEquals(0.00,B.GetDesvioPadraoWin(),0.01);
    }
    
    @Test
    public void testGetMediaWin() {
        assertEquals(4.50,A.GetMediaWin(),0.01);
        assertEquals(500.00,B.GetMediaWin(),0.01);
    }
    
     @Test
    public void testGetDesvioPadrao() {
        assertEquals(1.41,A.GetDesvioPadrao(),0.01);
        assertEquals(0.00,B.GetDesvioPadrao(),0.01);
    }
 
    @Test
    public void testGetMedia() {
        assertEquals(3.00,A.GetMedia(),0.01);
        assertEquals(500.00,B.GetMedia(),0.01);
    } 
}
