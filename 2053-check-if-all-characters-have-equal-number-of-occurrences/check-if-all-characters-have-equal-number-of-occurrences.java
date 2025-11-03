class Solution {
    public boolean areOccurrencesEqual(String s) {
       int n = s.length();
       int[] freq = new int[26];

         for (char c : s.toCharArray()) {
            freq[c - 'a']++; 
        }
        int target = 0;
        for (int f: freq){
            if (f>0){
                target = f;
                break;
            }
        }
        for (int f : freq){
            if (f>0 && f!= target){
                return false ;

            }
        }
        return true;
    }
}

  