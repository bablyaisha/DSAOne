package MathsInDsa;

public class XORofNumber {
    public static void main(String[] args) {
//        int n=6;
//            System.out.println("XOR value is: "+ xor_value(n));
        System.out.println(xor_range(3,9));
    }
    //xor from 0 to a
    static int xor_value(int a){

            if (a % 4 == 0) {
                return a;
            }if (a % 4 == 1) {
                return 1;
            }if (a % 4 == 2) {
                return a + 1;
            }if (a % 4 == 3) {
                return 0;
            }
        return 0;
    }

    //xor from a to b
    static int xor_range(int a,int b){
        int ans= xor_value(b)^xor_value(a-1);
        return ans;
    }
}
