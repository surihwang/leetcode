class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if (nums.length == 1)
            return (double) nums[0] / k;

        int sum = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (i + 1 >= k) {
                max = Math.max(max, sum);
                sum -= nums[i + 1 - k];
            }
        }

        return (double) max / k;
    }
}