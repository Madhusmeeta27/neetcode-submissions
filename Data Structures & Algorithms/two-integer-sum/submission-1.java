class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for(int i=0;i<nums.length-1;i++){
            int rem = target - nums[i];
            int j=i+1;
            while(j<nums.length){
                if(rem==nums[j]){
                    res[0] =i;
                    res[1] =j;
                    break;
                }
                j++;
            }
            if(res[0]==i && res[1]==j) break;
        }
        return res;
    }
}
