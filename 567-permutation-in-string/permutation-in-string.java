class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int n = s1.length();
        int m = s2.length();

        if (n>m) return false ;

       int[] s1count = new int[26];
       int[] s2count = new int[26];


       for (int i=0; i<n; i++){
        s1count[s1.charAt(i) - 'a' ]++;
        s2count[s2.charAt(i) - 'a']++;

       }
       for (int i=0; i < m-n; i++){
        if(matches(s1count, s2count )) return true ;

        s2count[s2.charAt(i) - 'a']--;
        s2count[s2.charAt(i+ n)-'a']++;
       }
       return matches(s1count , s2count);
        }
        private boolean matches (int[] s1count, int[] s2count ){
            for (int i=0; i<26; i++){
                if(s1count[i] != s2count[i]) return false ;
            }
              return true ;
         
    }
}