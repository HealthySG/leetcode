class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] lastIndexOfLetters = new int[26];
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) {
            lastIndexOfLetters[s.charAt(i) - 'a'] = i;
        }
        int start = 0;
        int end = lastIndexOfLetters[s.charAt(0) - 'a'];
        int curr = start;
        
        while(curr <= end) 
        {
            if(curr == end) {
                result.add(end - start + 1);
                if(end < s.length() - 1) {
                    start = end + 1;
                    end = lastIndexOfLetters[s.charAt(end + 1) - 'a'];
                }
            }
            if(lastIndexOfLetters[s.charAt(curr) - 'a'] > end) 
            {
                end = lastIndexOfLetters[s.charAt(curr) - 'a'];
            }
            curr++;
        }
        return result;
    }
}