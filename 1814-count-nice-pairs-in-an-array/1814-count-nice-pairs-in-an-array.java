class Solution {
    public int countNicePairs(int[] nums) {
     /*   int l=nums.length;
        int mod=(int)Math.pow(10,9)+7;
        int ans=0;
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<l;i++)
        {
            int num=nums[i];
            int rev=0;
            while(num!=0)
            {
                int dig=num%10;
                rev=rev*10+dig;
                num/=10;
            }
            int j=Math.abs(nums[i]-rev);
            if(m.containsKey(j))
            {
                ans=(ans+m.get(j))%(1000000000+7);
                m.put(j,m.get(j)+1);
                
                
            }
            else
            {
                m.put(j,1);
                
            }
        }
        /*for(Map.Entry<Integer,Integer> e:m.entrySet())
        {
            int v=e.getValue()%mod;
            ans=(ans%mod+(v%mod*((v%mod)-1)/2)%mod)%mod;
        }*/
       // return ans;
        
            int n = nums.length;
        int pairs = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int reversed = rev(nums[i]);
            nums[i]-=reversed;
            Integer num = map.get(nums[i]);
            if(num == null){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i],num+1);
                pairs = (pairs+num)%(1000000000+7);
            }
        }
        return pairs;
    }
    public int rev(int number){
        int rev =0;
        while(number!=0){
            int d = number%10;
            number = number/10;
            rev = rev*10+d;
        }
        return rev;
    }
}