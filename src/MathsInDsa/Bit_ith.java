package MathsInDsa;

public class Bit_ith {
    public static void main(String[] args) {
       int n=97;
        int i=2;
        System.out.println("without change "+n+" is "+ Integer.toBinaryString(n));
//        System.out.println("Numeric rep: "+ithBit(n,i));

//        System.out.println("Numeric rep in set Bit: "+setBit(n,i));
//        System.out.println("Numeric rep in set Bit: "+reset(n,i));
        System.out.println(position_right(n));
        //Binary representation
//        System.out.println("Bianry rep: "+Integer.toBinaryString(ithBit(n,i)));
//        System.out.println("Bianry rep in set Bit: "+Integer.toBinaryString(setBit(n,i)));
//        System.out.println("Bianry rep in set Bit: "+Integer.toBinaryString(reset(n,i)));


    }
    //find the ith Bit.
    static int ithBit(int n,int i){
          return n&(1<<(i-1));
    }
    //set the ith Bit.  //set bit means 0->1 and 1->1

    static int setBit(int n,int i){
        return n | (1<<(i-1));
    }
    //Reset ith Bit.

    static int reset(int n,int i){
       return n& ~(1<<(i-1));   //mask is compliment of 1<<(i-1) and reset means 0->0 and 1->0
    }
    //find the position of right most set bit
     static int position_right(int n){
        return n& -n;
     }

}
