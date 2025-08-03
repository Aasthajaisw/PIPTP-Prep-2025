import java.util.*;
public class factorial{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(fact(n));
    }
    public static int fact(int n){
        if(n<=1) return n;
        else if(n%2==0){
            return n+fact(n/2);
        }
        return fact((n+1)/2)+fact((n-1)/2);
    }
    
}