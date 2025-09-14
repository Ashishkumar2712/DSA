class Solution {
    public int lengthOfLongestSubstring(String s) {
       Set<Character> Set = new HashSet<>();
        int maxlength = 0; 
        int i=0;

        for (int j=0; j<s.length(); j++){
         
         while (Set.contains(s.charAt(j))){
            Set.remove(s.charAt(i));
            i++;
         }
         Set.add (s.charAt(j));
         maxlength = Math.max(maxlength, j-i+1);  

        }

        return maxlength;
    }
}

