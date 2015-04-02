package math;


import org.junit.*;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class IMathTest {

    private static IMath statMath;

    public IMath math;

    @BeforeClass
    public static void setUpClass(){
        statMath = new IMathImpl();
    }

    @AfterClass
    public static void tearDownClass(){
        statMath = null;
    }


    @Before
    public void setUp(){
        math = new IMathImpl();
    }

    @After
    public void tearDown(){
        math = null;
    }

    @Test
    public void testSumSimple(){
        int out = math.sum(12,12);
        int expected = 24;
        Assert.assertEquals(expected, out);
    }

    @Test(expected = Exception.class)
    public void testDivideByZero(){
        math.divide(12,0);
    }

    @Test
    public void testDivideByZeroDouble(){
        Assert.assertTrue(
                Double.isInfinite(
                    math.divide(12.0, 0.0)));
    }



}
