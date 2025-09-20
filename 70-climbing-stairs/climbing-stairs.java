class Solution {
    public int climbStairs(int n) {
       if(n <=3) return n ;

       int curr =0;
       int i = 3;
       int j = 2;

       for (int k =3; k<n; k++){
        curr = i +j;
        j=i;
        i= curr;
       }
       return curr;
        
    }
}