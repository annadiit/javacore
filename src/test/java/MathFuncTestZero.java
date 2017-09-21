import com.kitcenter.app.classwork.lesson5.MathFunc;
import org.junit.Assert;
import org.junit.Test;

public class MathFuncTestZero {

    @Test  // "a" is equal to 0
    public void multipleTestWhen_a_zero() {
        int a = 0, b = 2, expRes = 0;
        Assert.assertEquals(expRes, MathFunc.multiply(a, b));
    }

    @Test // "b" is equal to 0
    public void multipleTestWhen_b_zero() {
        int a = 2, b = 0, expRes = 0;
        Assert.assertEquals(expRes, MathFunc.multiply(a, b));
    }


    @Test // "a" and "b"  are equal to 0
    public void multipleTestWhen_both_zero() {
        int a = 0, b = 0, expRes = 0;
        Assert.assertEquals(expRes, MathFunc.multiply(a, b));
    }

}



