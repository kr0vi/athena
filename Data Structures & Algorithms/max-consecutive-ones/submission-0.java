class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0;
        int currOnes = 0;

        for(int elem:nums){

            if(elem==1){
                currOnes++;
            }
            else{
                if(maxOnes<currOnes){
                    maxOnes=currOnes;
                }
                currOnes = 0;
            }
        }
        if(maxOnes<currOnes){
            return currOnes;
        }
        return maxOnes;
    }
}