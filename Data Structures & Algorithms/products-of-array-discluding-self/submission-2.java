class Solution {

    public int findProduct(int[] nums, int index){
        // finds product of array except 1 index;
        int product = 1;
        for(int i = 0; i <nums.length;i++){
            if(index!=i){
                product *=nums[i];
            }
        }
        return product;
    }

    public int[] productExceptSelf(int[] nums) {
        int[] copy = Arrays.copyOf(nums, nums.length);
        int totalProduct = 1;
        for(int num : nums){
            totalProduct*=num;
        }

        for(int i =0 ;i < nums.length; i ++ ){
            if(nums[i]==0){
                nums[i] = findProduct(copy,i);
                continue;
            }
            nums[i] = totalProduct/nums[i];
        }
        return nums;
    }
}  
