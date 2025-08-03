
import java.util.*;
public class third{
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();
            int y=sc.nextInt();
            System.out.println(f(x,y));
    }
    public static int f(int x,int y){
        if(y==0||y==x){
            return 1;
        }
        return f(x-1,y) +f(x-1,y-1);
    }
}