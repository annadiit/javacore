import com.kitcenter.app.classwork.lesson5.MathFunc;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;

public class MathFuncTest {
    @Test // junit framework annotation
    public void multipleTest() {
        int a = 1, b = 2, expRes = 2;
        Assert.assertEquals(expRes, MathFunc.multiply(a, b));
    }

    @Test // ExpRes in test is not equal to actual result
    public void multipleTest1 () {
        int a = 1000000, b = 2, expRes = 200;
        Assert.assertNotEquals  (expRes, MathFunc.multiply(a, b));
    }

    @Test // junit framework annotation
    public void multipleTest3() {
        int a = 1, b = 100, expRes = 100;
        Assert.assertEquals(expRes, MathFunc.multiply(a, b));
    }

    @Test // junit framework annotation
    public void multipleTest4() {
        int a = 1, b = 5, expRes = 5;
        Assert.assertEquals(expRes, MathFunc.multiply(a, b));
    }

   @Test//  a verification
   public void multipleLargeNumber() {
       int a = 1000000000, b = 2, expRes = 2000000000;
       Assert.assertEquals(expRes, MathFunc.multiply(a, b));
   }

    @Test//  b verification
    public void multipleLargeNumber2() {
        int b = 1000000000, a = 2, expRes = 2000000000;
        Assert.assertEquals(expRes, MathFunc.multiply(a, b));
    }

    @Test//  a, b verification
    public void multipleLargeNumber3() {
        int a = 1000000, b = 1000000, expRes = 100000000;
        Assert.assertNotEquals(expRes, MathFunc.multiply(a, b));
    }


}
