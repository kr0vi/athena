class Solution {

    public int[] productExceptSelf(int[] nums) {
       // prefix array  - array containing all product before a certain element (including elem)
       // postfix array - array containing all product after a certain element (including elem)
       // array = [5,2,3]
       // prefix = [5,10,30]
       // postfix = [30,6,3]
       // ans - for an x element  = prefix(elem) * postfix(elem)
       int[] prefixArr = new int[nums.length];
       int[] postfixArr = new int[nums.length];
       int prefixProduct = 1;
       int postfixProduct = 1;
       for(int i = 0 ; i< nums.length; i++){
            prefixProduct *= nums[i];
            prefixArr[i] = prefixProduct;

            postfixProduct *= nums[nums.length-1-i];
            postfixArr[nums.length-1-i] = postfixProduct;
       }

       for(int i =0;  i<nums.length; i++){
        if(i==0){
            nums[i] = postfixArr[i+1];
        }
        else if(i==nums.length-1){
            nums[i] =prefixArr[i-1];
        }
        else{
            nums[i] = prefixArr[i-1] * postfixArr[i+1];
        }
       }
        return nums;
    }
}  
