public class majorityElement {
    public static int findMajorityElement(int[] nums) {
        int majorityElement = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                majorityElement = nums[i];
                count = 1;
            } else if (nums[i] == majorityElement) {
                count++;
            } else {
                count--;
            }
        }

        // Verify if the majority element appears more than n/2 times
        int majorityThreshold = nums.length / 2;
        count = 0;
        for (int num : nums) {
            if (num == majorityElement) {
                if (++count > majorityThreshold) {
                    return majorityElement;
                }
            }
        }

        return -1; // No majority element found
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 5, 5, 5, 5};
        int majorityElement = findMajorityElement(nums);
        System.out.println("Majority Element: " + majorityElement);
    }
}

