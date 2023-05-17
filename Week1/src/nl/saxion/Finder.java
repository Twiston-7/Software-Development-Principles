package nl.saxion;

public class Finder {
    public Result find(int[] nums) {
        int smallest = nums[0];
        int largest = nums[0];

        for (int i : nums) {
            if (i < smallest) {
                smallest = i;
            }
            if (i > largest) {
                largest = i;
            }
        }
        return new Result(smallest, largest);
    }

    public Integer findMin(int[] nums) {
        int smallest = Integer.MAX_VALUE;

        if (nums.length == 0 ) {
            return null;
        }

        for (int n : nums) {
            if (n < smallest) {
                smallest = n;
            }
        }
        return smallest;
    }
}
