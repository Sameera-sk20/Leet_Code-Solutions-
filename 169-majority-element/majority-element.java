class Solution {
    public int majorityElement(int[] nums) {
        /*HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            map.put(nums[i],map.get(nums[i])+1);
            else
            map.put(nums[i],1);
        }
        for(int key:map.keySet())
        {
            if(map.get(key)>nums.length/2)
            return key;
        }
        return -1;*/
        int count=0;
        int element=0;
        for(int i=0;i<nums.length;i++)
        {
            if(count==0)
            {
                element=nums[i];
                count++;
            }
            else if(nums[i]==element)
            count++;
            else
            count--;
        }
        int count1=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==element)
            count1++;
            if(count1>nums.length/2)
            return nums[i];
        }
        return -1;
    }
}