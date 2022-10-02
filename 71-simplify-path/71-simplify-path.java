class Solution {
    public String simplifyPath(String path) {
        Deque<String> q = new ArrayDeque<>();
        for(String in : path.split("/")) {
            if(in.length()==0 || in.equals(".")) continue;
            else if(in.equals("..")) {
                if(!q.isEmpty()) q.removeLast();
            }
            else {
                q.addLast(in);
            }
        }
        if(q.isEmpty()) 
            return "/";
        StringBuilder R = new StringBuilder();
        while(!q.isEmpty()) {
            R.append("/").append(q.removeFirst());
        }
        return R.toString();
    }
}