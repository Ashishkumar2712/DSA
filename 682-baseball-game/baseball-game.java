class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer> st = new Stack<>();
        int total = 0;
        int n = operations.length;
        for (int i=0; i<n; i++){
            String num = operations[i];
        

        if ( num.equals("+")){
            int val1= st.pop();
            int val2= st.pop();
            int k = val1+val2 ;
            st.push(val2);
            st.push(val1);
            st.push(k);

        }
        else if (num.equals("D")){
            st.push(2*st.peek());

        }
        else if (num.equals("C")){
            st.pop();

        }else {
            st.push(Integer.parseInt(num));
        }
        
    }
    while (st.size()> 0){
        total += st.pop();
    }
    return total;
    }
}