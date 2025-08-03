import java.util.*;

public class fourth{
public static void main(String ags[]){
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    System.out.println(s(x,y));
}
public static int s(int x,int y){
    if(x==y){
        return x*y;
    }
    return s(x,(x+y)/2)+s((x+y)/2+1,y);
}
}