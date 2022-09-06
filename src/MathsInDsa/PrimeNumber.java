package MathsInDsa;

public class PrimeNumber {
    public static void main(String[] args) {
        int n=12;
        System.out.println(n+" is prime: "+isPrime(n));  // T(n)= O(root n)
        //printing all the prime numbers less than n
        System.out.println("Prime numbers:");  // T(n)= O(n*root n)
        for (int i=2;i<n;i++){

            System.out.println(i+" is prime: "+isPrime(i));
        }
    }

    static boolean isPrime(int n){
        //base case
        if(n==0 || n==1){
            return false;
        }
        int i=2;
        while(i*i<=n){   //i*i=n => i= root(n)

            if(n%i==0) return false;

            i++;
        }
        return true;
    }
}
