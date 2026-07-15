class Solution {
    public int[] productExceptSelf(int[] nums) {
        PrefixProduct pProd  = new Solution.PrefixProduct(nums);
        int[] res = new int[nums.length];
        for(int i = 0; i< nums.length;i++){
            res[i]= pProd.calc(i);
        }
        return res;
    }

    class PrefixProduct{
        public int[] prefix;
        public int[] suffix;


        PrefixProduct(int[] nums) {
            prefix = new int[nums.length];
            suffix = new int[nums.length];
            
            var prevPref  = 1;
            var prevSuf = 1;
            for(int i =0; i < nums.length; i++){
                prefix[i] = prevPref * nums[i];
                prevPref = prefix[i];

                suffix[nums.length-i-1] = prevSuf * nums[nums.length-i-1];
                prevSuf = suffix[nums.length-i-1];

            }
        }

        public int calc(int i){
            int leftRes = i==0?1: prefix[i-1];
            int rightRes = i== suffix.length-1 ?1: suffix[i+1];
            return leftRes * rightRes;
        }
    }
}  
