class Solution {
    public int maximumTastiness(int[] price, int k) {
       //  int n=price.length;
       //  Arrays.sort(price);
       // int min=0;
       // int max=price[n-1]-price[0]; // 20
       //  while(min<max)
       //  {
       //      System.out.println("Min is--" + min);
       //      System.out.println("Max is--" + max);
       //      int mid=(min+max)>>1; // 4
       //      System.out.println("Mid is--" + mid);
       //      if(ispossible(price,mid,k))
       //      {
       //          max=mid-1; 
       //      }
       //      else
       //      {
       //          min=mid+1;
       //      }
       //  }
       //  return max;
          Arrays.sort(price);
    int lo = 0, hi = 1000_000_000;
    while (lo < hi) {
        int mid = lo + (hi - lo) / 2;
        if (check(mid, price, k)) lo = mid + 1;
        else hi = mid;
    }
    return lo - 1;
    }
 boolean check(int x, int[] price, int k) {
    int last = price[0], count = 1, i = 1;
    while (count < k && i < price.length) {
        if (price[i] - last >= x) {
            last = price[i]; count++;
        }
        i++;
    }
    return count == k;
}
}