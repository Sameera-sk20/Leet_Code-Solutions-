class Solution {
    public int maxProduct(int[] nums) {
        /*int pro=0,max=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                 pro=(nums[i]-1)*(nums[j]-1);
                if(pro>max)
                max=pro;
            }
            pro=0;
        }
        return max;*/
        Arrays.sort(nums);
        return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
    }
}