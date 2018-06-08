package s3.com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BTest
{
    @Test
    public void testDiv()
    {
        B b = new B();
        int div = b.div(4, 2);
        assertEquals( 2, div );
    }

    @Test
    public void testMult()
    {
        B b = new B();
        int prod = b.mult(4, 3);
        assertEquals( 12, prod );
    }
}
