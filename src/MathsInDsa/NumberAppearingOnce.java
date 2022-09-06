package MathsInDsa;

public class NumberAppearingOnce {
    public static void main(String[] args) {
        int[] a={5, 5, 4, 8, 4, 5, 8, 9, 4, 8};
        int n=3;
        System.out.println(singleNum(a,n));
    }
    static int singleNum(int[] arr,int n){
          int[] countSetBit = new int[32];

        for (int i: arr) {
            for (int k = 0; k <32 ; k++) {
                int kthSetBit= 1<<k;

                if((arr[i]&kthSetBit )==kthSetBit){
                    countSetBit[k]++;
                }
            }

        }
        int occuredOnce=0;
        for (int i = 0; i < 32; i++) {
            countSetBit[i]=countSetBit[i]%n;

            if(countSetBit[i]==1){
                occuredOnce=occuredOnce|(1<<i);
            }
        }
        return occuredOnce;
    }
}
