public class Third{
    public static void main(String args[]){
        int a=8;
        int b=8;
       int res= func(a,b);
       System.out.println(res);

    }
    public static int func(int a,int b){
        if(a>0 && b>0 && a+b>0){
            return a+func(a-2,b-2)+b;
        }
        else{
            return a^b;
        }
        
    }
}