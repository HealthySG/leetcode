// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}
// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        sumofsubset(0,0,ans,arr,N);
        Collections.sort(ans);
        return ans;
    }
   void sumofsubset(int ind,int sum,ArrayList<Integer> ans,List<Integer> arr,int N)
    {
        if(ind==N)
        {
            ans.add(sum);
            return;
        }
        sumofsubset(ind+1,sum+arr.get(ind),ans,arr,N);
        sumofsubset(ind+1,sum,ans,arr,N);
    }
    
}