import com.kitcenter.app.classwork.lesson5.MathFunc;
import org.junit.Assert;
import org.junit.Test;

public class MathFuncTestNegative {

    @Test // a is negative
    public void multipleTestWhen_a_negative() {
        int a = -2, b = 2, expRes = -4;
        Assert.assertEquals(expRes, MathFunc.multiply(a, b));
    }

    @Test // b is negative
    public void multipleTestWhen_b_negative() {
        int a = 2, b = -2, expRes = -4;
        Assert.assertEquals(expRes, MathFunc.multiply(a, b));
    }

    @Test // "a" and "b" are negative
    public void multipleTestWhen_both_negative() {
        int a = -2, b = -2, expRes = 4;
        Assert.assertEquals(expRes, MathFunc.multiply(a, b));
    }

}
