
import java.util.Collections;
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        Collections.sort(nums, Collections.reverseOrder());
        int largestSum = 0;
        for (int i = 0; i < nums.size() - 1; i++) {
            if (!nums.get(i).equals(nums.get(i+1))) {
                int sum = nums.get(i) + nums.get(i+1);
                if (sum > largestSum) {
                    largestSum = sum;
                }
            }
        }
        return largestSum;
    }
}