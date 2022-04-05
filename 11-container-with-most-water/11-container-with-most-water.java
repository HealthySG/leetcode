class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1,w=0,h=0,maxarea=0;
        while(i<j)
        {
            w=j-i;
            h=Math.min(height[i],height[j]);
            maxarea=Math.max(maxarea,h*w);
            if(height[i]<height[j])
            {
               
                i++;
            }
            else
            {
                j--;
            }
        }
        return maxarea;
    }
}