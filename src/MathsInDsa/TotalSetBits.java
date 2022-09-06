package MathsInDsa;

public class TotalSetBits {
    public static void main(String[] args) {
        int n=254;
        System.out.println(Integer.toBinaryString(n));
        System.out.println("Number of set bits are: "+setBits(n));
    }

    static int setBits(int n){
        //M-1
        int count=0;
//        while (n>0){
//            count++;
//            n=n-(n&(-n));
//        }
        //M-2
        while (n>0){
            count++;
            n=n&(n-1);
        }
        return count;
    }
}
