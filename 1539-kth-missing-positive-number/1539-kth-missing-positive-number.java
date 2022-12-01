class Solution {
    public int findKthPositive(int[] arr, int k) {
        Set<Integer> st=new HashSet<>();
        for(int i:arr)
            st.add(i);
        int i=1,c=0;
        while(c!=k)
        {
            if(!st.contains(i))
                c++;
            i++;
        }
        return i-1;
        // int l=1;h=arr.length;
        // while(l)
}
}