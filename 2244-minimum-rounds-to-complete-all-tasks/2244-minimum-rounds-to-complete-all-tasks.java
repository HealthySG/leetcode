class Solution {
    public int minimumRounds(int[] tasks) {
       // int[] a=new int[1000000009];
        /*
        int n=tasks.length;
        Arrays.sort(tasks);
        int ans=0,c=0;
        for(int i=0;i<n-1;i++)
        {
            if(tasks[i]!=tasks[i+1])
            {
                if(c+1==1)
                {
                    c=0;
                    return -1;
                }
                    
                if(c+1==2)
                {
                      ans+=1;
                    System.out.println(ans);
                    c=0;
                }
                  
                else
                {
                    int check=(c+1)%3;
                    if(check!=0)
                        ans+=1;
                     ans+=check/3;
                     System.out.println(ans);
                     c=0;
                }
            }
            else
            {
                c++;
                 System.out.println("C  " + c);
            }
        }
        return ans;
        */
        HashMap<Integer,Integer>map=new HashMap<>();
        int count=0;
        for(int i=0;i<tasks.length;i++){
            map.put(tasks[i],map.getOrDefault(tasks[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> set :
             map.entrySet()){
            if(set.getValue()==1)return -1;
            if(set.getValue()%3!=0){
                count+=1;
            }
            count+=set.getValue()/3;
        }
        return count;
    }
}