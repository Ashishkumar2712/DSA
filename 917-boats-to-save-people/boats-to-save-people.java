class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n = people.length;
        int count = 0;
        int i =0;
        int j = n-1;
        Arrays.sort(people);
        while (i<=j){
            if ((people[j] + people [i] <= limit)){
                i++;
            }
            j--;
            count++;
        }        
        return count ;
        
    }
}