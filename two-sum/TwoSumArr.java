
import java.util.Arrays;

public class TwoSumArr {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        printArray(twoSum(arr, 9));
        
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] complement = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (target >= complement.length) {
                complement = ensureExtraCapacity(complement);
            }
            if (complement[nums[i]] > 0) {
                return new int[] {complement[nums[i]], i};
            }
            if (nums[i] <= target) {
                complement[target - nums[i]] = i;
            }
        }
        return null;
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[arr.length - 1] + "]");
    }

    private static int[] ensureExtraCapacity(int[] arr) {
        return Arrays.copyOf(arr, arr.length * arr.length);
    }
}

