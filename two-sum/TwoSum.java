public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {2, 5, 5, 11};
        printArray(twoSum(arr, 10));
        
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] targetSum = {-1, -1};
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (i == j) {
                    continue;
                } else if (nums[i] + nums[j] == target) {
                    System.out.println("nums[" + i + "]" + " + " + "nums[" + j + "] = " + target);
                    targetSum[0] = i;
                    targetSum[1] = j;
                    return targetSum;
                }
            }
        }
        return targetSum;
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[arr.length - 1] + "]");
    }
}
