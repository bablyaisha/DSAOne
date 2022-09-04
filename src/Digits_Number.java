public class Digits_Number {
    public static void main(String[] args) {
          int n=6;
          int base=2; //binary me
          // base=10 means decimal

        System.out.println(digit(n,base));
    }
    static int digit(int n,int b){

        return (int)(Math.log(n)/Math.log(b))+1;

    }
}
