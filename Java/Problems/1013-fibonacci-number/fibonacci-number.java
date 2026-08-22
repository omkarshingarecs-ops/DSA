class Solution {
    public int fib(int n) {

        if (n<=1){
            return n;
        }

        int fnm1 =1;
        int fnm2 = 0;
        for (int i = 2 ;i<= n; i++){
            int curr = fnm1 + fnm2 ;
            fnm2 = fnm1;
            fnm1 = curr;
        }
        return fnm1;
         
        
    }
}