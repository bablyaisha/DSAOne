public class calculate_a_power_b {
    public static void main(String[] args) {
        int base=3,power=6;
        System.out.println(calculate(base,power));
    }

    static int calculate(int base,int power){
        int ans=1;
        while (power>0){
            if((power&1)==1){    //if 0 then ignoring
                ans*=base;
            }
              base*=base;
            power=power>>1;
        }
        return ans;
    }
}
