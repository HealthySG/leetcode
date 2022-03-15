class Solution {
    public int maximumGain(String s, int x, int y) {
               if(x > y){
            String rem = removex(s,x);
            String rem2 = removey(rem,y);
            return sumx+sumy;
        }else{
            String rem = removey(s,y);
            String rem2 = removex(rem,x);
            return sumx+sumy;
        }
    }
    
    int sumx = 0;
    int sumy = 0;
	//to remove the "ab" from string
    public String removex(String s, int x){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(!stack.isEmpty() && stack.peek() == 'a' && s.charAt(i) == 'b'){
                stack.pop();
                sumx += x;
            }else{
                stack.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while(stack.isEmpty() == false){
            sb.append(stack.pop());
        }
        sb.reverse();
        return sb.toString();
    }
    
	//to remove "ba" from string
    public String removey(String s, int y){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(!stack.isEmpty() && stack.peek() == 'b' && s.charAt(i) == 'a'){
                stack.pop();
                sumy += y;
            }else{
                stack.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while(stack.isEmpty() == false){
            sb.append(stack.pop());
        }
        sb.reverse();
        return sb.toString();
    }

    }
