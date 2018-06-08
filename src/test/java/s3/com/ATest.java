package s3.com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ATest
{
    @Test
    public void testSum()
    {
        A a = new A();
        int sum = a.sum(4, 2);
        assertEquals( 6, sum );
    }

    @Test
    public void testMinus()
    {
        A a = new A();
        int diff = a.minus(4, 3);
        assertEquals( 1, diff );
    }

    @Test
    public void testSquare()
    {
        A a  =  new A();
        int square = a.square(3);
        assertEquals( 9, square );
    }
}
