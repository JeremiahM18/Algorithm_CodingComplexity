/* Question 5: Remove Element

 */

public class Q5 {

    public int remove(int[] nums, int val) {
        if(nums == null || val < 0){
            return nums.length;
        }

        // Count how many times val appears in the array
        int count = 0;
        for (int num : nums){
            if(num == val){
                count++;
            }
        }

        int[] result = new int[nums.length - count];

        int k = 0;
        for (int num : nums){
            if(num != val){
                result[k++] = num;
            }
        }

        return result.length;
    }

}
