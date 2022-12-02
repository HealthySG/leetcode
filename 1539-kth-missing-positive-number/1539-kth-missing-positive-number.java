class Solution {
    public int findKthPositive(int[] arr, int k) {
        // Set<Integer> st=new HashSet<>();
        // for(int i:arr)
        //     st.add(i);
        // int i=1,c=0;
        // while(c!=k)
        // {
        //     if(!st.contains(i))
        //         c++;
        //     i++;
        // }
        // return i-1;
         int l=0,h=arr.length;
         while(l<h)
         {
             int mid=(l+h)>>1;
             if((arr[mid]-(mid+1))>=k)
             {
                 h=mid;
             }
             else
             {
                 l=mid+1;
             }
         }
      return l+k;
        // return arr[l]+k-(arr[l]-(l+1));
        // else
        //     return arr[l-1]+k;
}
}