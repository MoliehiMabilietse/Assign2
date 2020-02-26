import org.junit.Ignore;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class ModiTest {

    private ModiTest Modi;
    private int string;

    @Before
    public void setUp() throws Exception {
        Modi = new ModiTest();
    }

    @Test
    public void testObjectEquality() {
        String results =Modi.strings("m", "m");
        Assert.assertEquals(results, true, true == true);
    }

    private String strings(String a, String a1) {
        return a;
    }

    @Test
    public void testObectIdentity() {
        String results =Modi.strings("mo", "di");
        Assert.assertNotSame(results, true);
    }

    @Test(timeout = 20)
    public void testTimeOut() {
        int results =Modi.stringLenght("String1");
        assertEquals(results, 0);
    }

    private int stringLenght(String string1) {
        return string;
    }

    @Test
    public void testFail() {
        Mo test = new Mo();
        int result = test.calculate(20, 3);
        assertEquals(23, result);
    }

    @Ignore
    @Test
    public void testDisabling() {
        int results =Modi.stringLenght("String1");
        assertEquals(results, 0);
    }
}

