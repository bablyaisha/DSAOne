public class PowerOfTwo {
    public static void main(String[] args) {
        int n=64;
        System.out.println(power_two(n));
    }
    static boolean power_two(int n){

        if(n==0){
            return false;
        }
        if((n&(n-1))==0){
            return true;
        }

        return false;
    }
}
