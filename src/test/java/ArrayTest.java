import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ArrayTest {
    Array array;

    public ArrayTest() {
        this.array = new Array();
    }

    @Test
    public void pullOutMethodShouldReturnValuesAfterLastValue4() {
        int[] input = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] output = {1, 7};

        Assert.assertArrayEquals(output, array.pull(input));
    }

    @Test
    public void pullOutMethodShouldReturnValuesAfterLastValue4_2() {
        int[] input = {1, 2, 4, 4, 2, 3, 4, 1, 7, 4, 2, 6, 7, 3};
        int[] output = {2, 6, 7, 3};

        Assert.assertArrayEquals(output, array.pull(input));
    }

    @Test
    public void pullOutMethodShouldReturnEmptyArrayWhenLastElementValue4() {
        int[] input = {1, 2, 3, 4};
        int[] output = {};

        Assert.assertArrayEquals(output, array.pull(input));
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void pullOutMethodShouldThrowRuntimeExceptionWhenArrayDoesNotContainValue4() {
        int[] input = {1, 2, 3};
        int[] output = {};

        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("В массиве нет элемента, содержащего значение 4");

        Assert.assertArrayEquals(output, array.pull(input));
    }

    @Test
    public void pullOutMethodShouldThrowRuntimeExceptionWhenArrayContainsNoElements() {
        int[] input = {};
        int[] output = {};

        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("Массив не должен быть пустым");

        Assert.assertArrayEquals(output, array.pull(input));
    }

    @Test
    public void checkMethodTest1() {
        int[] input = {1, 1, 1, 4, 4, 1, 4, 4};
        Assert.assertFalse(array.check(input));
    }

    @Test
    public void checkMethodTest2() {
        int[] input = {1, 2, 3};
        Assert.assertFalse(array.check(input));
    }

    @Test
    public void checkMethodTest3() {
        int[] input = {1, 2, 3, 4};
        Assert.assertFalse(array.check(input));
    }

    @Test
    public void checkMethodTest4() {
        int[] input = {2, 3};
        Assert.assertFalse(array.check(input));
    }

    @Test
    public void checkMethodTest5() {
        int[] input = {};
        Assert.assertFalse(array.check(input));
    }

    @Test
    public void checkMethodTest6() {
        int[] input = {1, 1, 1, 1, 1, 1};
        Assert.assertFalse(array.check(input));
    }

    @Test
    public void checkMethodTest7() {
        int[] input = {4, 4, 4, 4};
        Assert.assertFalse(array.check(input));
    }

    @Test
    public void checkMethodTest8() {
        int[] input = {1, 4, 4, 1, 1, 4, 3};
        Assert.assertFalse(array.check(input));
    }


}
