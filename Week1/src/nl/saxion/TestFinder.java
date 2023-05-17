package nl.saxion;
import nl.saxion.Finder;
import nl.saxion.Result;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestFinder {
    @Test
    public void NumbersInRandomOrderTest() {
        int[] nums = { 3 , 2 , 4 , 6 };
        Result result = new Finder().find(nums);
        assertEquals ( 2 , result.smallest());
        assertEquals ( 6 , result.largest());
    }

    @Test
    public void SinglePositiveIntegerTest() {
        int[] nums = {1};
        Result result = new Finder().find(nums);
        assertEquals(1, result.smallest());
        assertEquals(1, result.largest());
    }

    @Test
    public void NegativeAndZeroTest() {
        int[] nums = {-1, 0};
        Result result = new Finder().find(nums);
        assertEquals(-1, result.smallest());
        assertEquals(0, result.largest());
    }

    @Test
    public void SingleSmallNegativeNumberTest() {
        int[] nums  = {-1};
        Result result = new Finder().find(nums);
        assertEquals(-1, result.smallest());
        assertEquals(-1, result.largest());
    }

    @Test
    public void BigNumbersTest() {
        int[] nums  = {100030, 102394193};
        Result result = new Finder().find(nums);
        assertEquals(100030, result.smallest());
        assertEquals(102394193, result.largest());
    }

    @Test
    public void BigNegativeAndPositiveNumbersTest() {
        int[] nums  = {-313021, -2412934, 1249932, 3040320};
        Result result = new Finder().find(nums);
        assertEquals(-2412934, result.smallest());
        assertEquals(3040320, result.largest());
    }

    @Test
    public void singleNegativeDigitTest() {
        int[] nums  = {-1000};
        Result result = new Finder().find(nums);
        assertEquals(-1000, result.smallest());
        assertEquals(-1000, result.largest());
    }
}
