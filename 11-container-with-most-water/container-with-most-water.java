class Solution {
    public int maxArea(int[] height) {
         int i=0,j=height.length-1;
        int area=Integer.MIN_VALUE;
    while(i!=j)
        {
            int l=(j-i)*Math.min(height[i],height[j]);
            area=Math.max(area,l);
            if(height[i]<height[j])
            i++;
            else
            j--;
        }
        /*for(int i=0;i<height.length;i++)
        {
            for(int j=i+1;j<height.length;j++)
            {
                int l=(j-i)*Math.min(height[i],height[j]);
                area=Math.max(area,l);
            }

        }*/
        return area;
    }
}