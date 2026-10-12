class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
     HashMap<Integer,Integer>map=new HashMap<>();
    int l=0,sum=0;
     for(int i=0;i<grid.length;i++)
     {
        for(int j=0;j<grid.length;j++)
        {
            sum+=grid[i][j];
            if(map.containsKey(grid[i][j]))
            map.put(grid[i][j],map.get(grid[i][j])+1);
            else
            map.put(grid[i][j],1);
        }
     }
        for(int key:map.keySet())
        {
            if(map.get(key)==2)
            l=key;
        }
        sum-=l;
        int len=grid.length*grid.length;
        int tot=len*(len+1)/2;
        return new int[]{l,tot-sum};
     }   
    }
