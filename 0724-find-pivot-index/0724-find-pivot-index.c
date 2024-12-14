int pivotIndex(int* nums, int numsSize) {
    int sum = 0;
    for (int i = 0; i < numsSize; i++)
        sum += nums[i];
    int left = 0;
    for (int i = 0; i < numsSize; i++) {
        if (i == 0)
            left = 0;
        else
            left += nums[i - 1];
        int pivot = i;
        int right = sum - left - nums[pivot];

        if (right == left)
            return pivot;
    }
    return -1;
}