class Solution {
    public int removeElement(int[] nums, int val) {
        // iterate over every num, which is not equal to val put in index 
        int index =0;
        for(int i = 0 ;i<nums.length;i++){
            if(nums[i]!=val){
                nums[index] =nums[i];
                index++;
            }
        }
        return index;
    }
}