import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {

//    //Req. 1
//    @Test(expected = RuntimeException.class)
//    public void whenMoreThan2NumbersAreUsedThenExceptionIsThrown() {
//        StringCalculator.add("1,2,3");
//    }

    //Req. 1
    @Test
    public void when2NumbersAreUsedThenNoExceptionIsThrown() {
        StringCalculator.add("1,2");
    }

    //Req. 1
    @Test(expected = RuntimeException.class)
    public void whenNonNumberIsUsedThenExceptionIsThrown() {
        StringCalculator.add("1,X");
    }

    //Req. 2
    @Test
    public void testWhenEmptyStringIsPassedAddMethodReturnsZero() {
        Assert.assertEquals(0,StringCalculator.add(""));
    }

    //Req.3
    @Test
    public void testWhenTwoNumbersArePassedAddMethodReturnTheSum() {
        Assert.assertEquals(1+2,StringCalculator.add("1,2"));
    }

//    //Req.3
//    @Test
//    public void testSumWithOneNegativeNumbers() {
//        Assert.assertEquals(-1+2,StringCalculator.add("-1,2"));
//    }

    //Req.4
    @Test
    public void testMultipleNumbersWithAddMethod() {
        Assert.assertEquals(1+2+3+4+5,StringCalculator.add("1,2,3,4,5"));
    }

    //Req.5
    @Test
    public void testAddMethodToHandleNewLines() {
        Assert.assertEquals(1+2+3+4+5,StringCalculator.add("1,2,3,4n5"));
    }

    //Req.6
    @Test(expected = UnsupportedOperationException.class)
    public void testOnlyPositiveNumbersAllowed() {
        Assert.assertEquals(-1+2,StringCalculator.add("-1,2"));
    }

    //Req. 7
    @Test
    public void testNumbersAboveThousandAreIgnored() {
        Assert.assertEquals(2,StringCalculator.add("1000,2"));
    }

    //Req. 9
    @Test
    public void testThatDelimitersCanBeOfAnyLength() {
        Assert.assertEquals(6,StringCalculator.add("//[—]\\n1—2—3"));
    }




}
