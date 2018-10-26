package ec.edu.utpl.arqapp.racional;

import ec.utpl.edu.arqapp.racional.Rational;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class Testracional {

    Rational r1 = new Rational(1,3);
    Rational r2 = new Rational(1,2);

    @Test(expected = IllegalArgumentException.class)
    public void Testdenominator(){
        Rational r = new Rational(1,0);
    }

    @Test
    public void TesttoString(){
        Rational r = new Rational(1,2);
        assertEquals("resultado esperado","1/2",r.toString());
    }

    @Test
    public void testisLessThan(){
        assertEquals(true,r1.isLessThan(r2));
    }

    @Test
    public void testgetGreater(){
        assertEquals(r2,r1.getGreater(r2));
    }

    @Test
    public void testplus(){
        assertEquals(5,r1.plus(r2).getNumerator());
        assertEquals(6,r1.plus(r2).getDenominator());
    }

    @Test
    public void testminus(){
        assertEquals("1/-6",r1.minus(r2).toString());

    }

    @Test
    public void testtimes(){
        assertEquals(1,r1.times(r2).getNumerator());
        assertEquals(6,r1.times(r2).getDenominator());
    }

    @Test
    public void testdivides(){
        assertEquals(2,r1.divides(r2).getNumerator());
        assertEquals(3,r1.divides(r2).getDenominator());

    }
}
