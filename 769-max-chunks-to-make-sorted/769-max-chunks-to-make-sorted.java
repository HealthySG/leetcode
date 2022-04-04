class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n=arr.length;
        int ans=0;
       /* while(i<n && arr[i]==i)
        {
            ans++;
            i++;
        }
        while(j>0 && arr[j]==j)
        {
            ans++;
            j--;
        }
        if(i==n && j==0)
            return n;
        else if(j==0)
            return 1;
        for(int k=i;k<=j;)
        {
            if(k+1<j && Math.abs(arr[k]-arr[k+1])==1)
            {
                ans+=1;
                k+=2;
            }
            else
            {
                ans++;
                k++;
            }
        }
        */
        int max=0;
        for(int i=0;i<n;i++)
        {
            max=Math.max(arr[i],max);
            if(max==i)
            {
                ans++;
                max=0;
            }
        }
        return ans;
    }
}