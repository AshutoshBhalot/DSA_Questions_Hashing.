public class TestAreArraysEqual {
    public static void main(String[] args) {
        assert AreArraysEqual.areArraysEqual(new int[]{1, 2, 3, 4}, new int[]{4, 3, 2, 1});
        assert !AreArraysEqual.areArraysEqual(new int[]{1, 2, 3, 4}, new int[]{1, 2, 2, 4});
        assert AreArraysEqual.areArraysEqual(new int[]{}, new int[]{});
        assert !AreArraysEqual.areArraysEqual(new int[]{1}, new int[]{1, 1});
        System.out.println("All test cases passed for AreArraysEqual.");
    }
}

