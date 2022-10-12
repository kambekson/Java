import java.util.Scanner;
import java.util.Random;

public class Bubble {
    public static void sort(int[] n) {
        for (int i = 0; i < n.length - 1; i++) {
            for (int j = n.length - 1; j > i; j--) {
                if (n[j - 1] > n[j]) {
                    int t = n[j - 1];
                    n[j - 1] = n[j];
                    n[j] = t;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Random rand = new Random();
        int n = cin.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=rand.nextInt((54)+1);
            System.out.print(a[i]+" ");
        }System.out.println(" ");
        sort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
