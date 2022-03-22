class Solution {
    public List<List<Integer>> permute(int[] nums) {
   List<List<Integer>> list = new ArrayList<>();
   // Arrays.sort(nums); // not necessary
   backtrack(list, new ArrayList<>(), nums);
   return list;
}

private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums){
   if(tempList.size() == nums.length){
      list.add(new ArrayList<>(tempList));
   } else{
      for(int i = 0; i < nums.length; i++){ 
         if(tempList.contains(nums[i])) continue; // element already exists, skip
         tempList.add(nums[i]);
         backtrack(list, tempList, nums);
         tempList.remove(tempList.size() - 1);
      }
   }
}
}
/*
package com.leet;

import java.util.ArrayList;
import java.util.List;

public class BackTracking {
	public static void main(String args[])
	{
		Solution s=new Solution();
		List<List<Integer>> l=s.permute(new int[] {1,2,3});
		System.out.println(l);
	}
}
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> l=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
         help(arr,nums,l);
        return l;
    }
    void help(List<Integer> l,int[] nums, List<List<Integer>> lm)
    {
        if(l.size()==nums.length)
        {
        	lm.add(l);
        }
        else {
	        for(int i=0;i<nums.length;i++)
	        {
	            if(!l.contains(nums[i]))
	            {
	                l.add(nums[i]);
	               help(l,nums,lm); 
	               l.remove(l.size() - 1);
	            }
	        }
        }
        //return l;
    }
}
*/