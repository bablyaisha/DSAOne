package MathsInDsa;

public class Seive {
    public static void main(String[] args) {
           int n=40;
           boolean[] primes= new boolean[n+1];
           seive_eratosthenes(n,primes);
    }

    static void seive_eratosthenes(int n , boolean[] primes){
        if(n==0 || n==1){
            System.out.println("Not prime");
        }
      //convention - true means not prime and false means prime, as initially the boolean array returns false.
        for (int i = 2; i*i<=n ; i++) {
            if(!primes[i]){
                for (int j=2*i;j<=n;j+=i ){
                    primes[j]=true;  //true means not prime
                }
            }
        }
        System.out.println("Prime numbers are: ");
        for (int i = 2; i <=n ; i++) {
            if(!primes[i])
            System.out.print(i+" ");
        }
    }

}
