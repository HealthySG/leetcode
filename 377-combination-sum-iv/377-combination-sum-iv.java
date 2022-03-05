class Solution {
    public int combinationSum4(int[] nums, int target) {
        int res=0;
        Arrays.sort(nums);
        HashMap<String,Integer> m=new HashMap<>();
      return rec(nums,target,0,res,m);  
    }
    int rec(int[] nums,int target,int idx,int res,HashMap<String,Integer> m)
    {
        if(target==0)
            return 1;
        else if(target<0 || idx==nums.length)
            return 0;
    	  String Key=target+"Satyam";
        if(m.containsKey(Key))
        {
        	return m.get(Key);
        }

        res=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<=target)
            {
               res=res+rec(nums,target-nums[i],i,res,m);
            }
            else
            {
            	break;
            }
        }
        //System.out.println("Res is " + res);  
          m.put(Key,res);       
        return res;
    }
    
}