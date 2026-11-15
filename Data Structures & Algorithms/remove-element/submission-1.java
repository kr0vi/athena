class Solution {
    public int removeElement(int[] nums, int val) {
        // change all the value in nums to be max value which is = to target
        // sort that so all the max goes to last
        int k =nums.length;
        for(int i = 0 ;i<nums.length;i++){
            if(nums[i]==val){
                nums[i] = Integer.MAX_VALUE;
                k--;
            }
        }
        Arrays.sort(nums);
        return k;
    }
}