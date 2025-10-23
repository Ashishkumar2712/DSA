class Solution {
    public int totalFruit(int[] fruits) {
       Map <Integer , Integer > map = new HashMap<>();
       int i =0;
       int maxlength = 0;
       int n = fruits.length;
       for (int j =0; j<n ; j++){
        map.put (fruits[j], map.getOrDefault(fruits[j],0)+1);

        while (map.size() > 2){
        map.put(fruits[i], map.get(fruits[i])-1);
        if (map.get(fruits[i])==0){
            map.remove (fruits[i]);
        }
        i++;
       }
        maxlength = Math.max(maxlength,j-i+1);
        }
        return maxlength;
    }
       }