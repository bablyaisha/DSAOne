import java.util.Scanner;

public class Duplicates {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println(duplicate(a));
    }
    //for +ve numbers
    static int duplicate(int[] arr){
            int unique=0;
        for (int n:arr) {
            unique^=n;
        }
        return unique;
    }

}
