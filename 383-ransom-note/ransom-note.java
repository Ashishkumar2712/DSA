class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
    if (ransomNote.length() > magazine.length()) return false;
     int[] count = new int [26];
        
        for (char ch:magazine.toCharArray())
            count[ch - 97]++;
            for (char ch:ransomNote.toCharArray()){
                count[ch - 97]--;

                if (count [ch-97]<0)
                return false;
                
            
        }
        return true;
    }

    }
