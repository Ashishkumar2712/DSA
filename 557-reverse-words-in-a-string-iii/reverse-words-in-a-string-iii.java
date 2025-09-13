class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int i =0;
        int n = arr.length;

        for (int j=0; j<=n; j++){
            if (j==n || arr[j]== ' '){
                reverse (arr, i , j-1);
               i=  j+1;
            }
        }
        return new String(arr);
    }
    private void reverse (char[] arr , int k, int l){
        while (k < l){
        char temp = arr[k];
        arr[k++] = arr[l];
        arr[l--] = temp;
    }

         
    }
}