class Solution {
    public List<Integer> topStudents(String[] positive_feedback, String[] negative_feedback, String[] report, int[] student_id, int k) {
        HashMap<String,Integer> mp1=new HashMap<>();
        HashMap<String,Integer> mp2=new HashMap<>();
        for(int i=0;i<positive_feedback.length;i++){
            mp1.put(positive_feedback[i],3);
        }
        for(int i=0;i<negative_feedback.length;i++){
            mp2.put(negative_feedback[i],-1);
        }
        PriorityQueue<pair> pq=new PriorityQueue<>(new Comparator<pair>(){
            public int compare(pair a, pair b){
                if(a.score==b.score){
                    return a.id-b.id;
                }
                return b.score-a.score;
            }
        });
        for(int i=0;i<report.length;i++){
            String s=report[i];
            String [] arr=s.split(" ");
            int score=0;
            for(int j=0;j<arr.length;j++){
                if(mp1.containsKey(arr[j])) score+=mp1.get(arr[j]);
                if(mp2.containsKey(arr[j])) score+=mp2.get(arr[j]);
            }
            pq.offer(new pair(student_id[i],score));
        }
        List<Integer> ans=new ArrayList<>();
        while(k>0){
            ans.add(pq.poll().id);
            k--;
        }
        return ans;
    }
}
class pair{
    int id;
    int score;
    pair(int id,int score){
        this.id=id;
        this.score=score;
    }
}