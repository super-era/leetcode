import java.util.Hashtable;

public class TwoSumHashed {
    
    public static void main(String[] args) {
        int[] arr = {2, 5, 5, 11};
        printArray(twoSum(arr, 10));
        
    }

    public static int[] twoSum(int[] nums, int target) {
        Hashtable<Integer, Integer> ht1 = new Hashtable<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];          // complement = nums[j] where nums[i] + nums[j] = target
            if (ht1.containsKey(complement)) {      // check the hash table for a match for nums[j] added previously (and therefore CANNOT be the same index). note that the very first iteration of this statement will always be false because the hash table contains NO values yet.
                return new int[] {ht1.get(complement), i};      // method ends because target indexes were found
            }
            ht1.put(nums[i], i);        // if there is no match, then add the current i value to the table and keep going
        }
        return null;        // in case there are no values in the argument array that sum to the target value
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[arr.length - 1] + "]");
    }
}
