class Solution {
    public int fib(int n) {
        if(n == 0)
            return 0;
        if(n == 1 || n == 2)
            return 1;
        int a = 0;
        int b = 1;
        int c = 0;
        for(int i=n; i>1; i--){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
