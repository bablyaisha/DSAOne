package MathsInDsa;

public class PascalsTriangle {
    public static void main(String[] args) {
         int n=10;
        System.out.println(row_sum(n));

    }
    static int row_sum(int n){
        //n is the row whose sum is required
        //M-1 T(N)= o(N)
        int sum=0;
//        for (int i = 0; i <n ; i++) {
//             sum+=(1<<i);
//        }
//        return sum;
//
        //M-2 T(N)=o(1)
        sum = 1<<n;
        return sum-1;


    }
}
