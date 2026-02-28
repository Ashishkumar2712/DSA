class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String, List<String>> ans = new HashMap<>();

        for (String s:strs){
        int[] count = new int[26];

        for (char ch:s.toCharArray())
        count [ch - 97]++;

        StringBuilder key = new StringBuilder();
        for (int i=0; i<26; i++){
            key.append (',');
            key.append (count[i]);
        }
    
    if (!ans.containsKey(key.toString()))
    ans.put(key.toString(), new ArrayList<>());

      ans.get(key.toString()).add(s);
    }


        return new ArrayList<>(ans.values());


         
    }
}