import java.util.Scanner;
public class teylor {
    public static int fact(int f) {
        f=4;
                if (f==1) return 1;
                for (int i=1; i<f; i++ ){
                    f*=i;
                } return f;
    }
    public static double power(double x, int n){
        float p= 1.0F;
        for (int i=1; i<=n; i++){
            p*=x;
        } return p;
    }
    public static void main (String[] args){

        int n=15;
        float sum=0;
        double x = 2;
        double k = 1;
        k*=(-1);
        for (int i = 1; i <= n; i+=2){
            sum+=k*power(x, i)/fact(i);
        }
        System.out.println(sum);
    }
}