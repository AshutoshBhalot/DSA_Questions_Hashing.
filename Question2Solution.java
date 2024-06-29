import java.util.HashMap;

public class AreArraysEqual {
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        HashMap<Integer, Integer> elementCount = new HashMap<>();
        for (int num : arr1) {
            elementCount.put(num, elementCount.getOrDefault(num, 0) + 1);
        }
        for (int num : arr2) {
            if (!elementCount.containsKey(num) || elementCount.get(num) == 0) {
                return false;
            }
            elementCount.put(num, elementCount.get(num) - 1);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {4, 3, 2, 1};
        if (areArraysEqual(arr1, arr2)) {
            System.out.println("Arrays are equal.");
        } else {
            System.out.println("Arrays are not equal.");
        }
    }
}
