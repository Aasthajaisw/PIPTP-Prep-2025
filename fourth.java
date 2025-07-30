public class fourth {
    public static void main(String args[]){
        int a=3;
        int b=5;
        System.out.println(func(a, b));
    }
    public static int func(int a,int b){
        int c;
        for(c=2;c<4;c++){
            if(a%2< b%3){
                a=4%3;
            }
            else{
                if(5%3>b){
                    a=b;
                }
                b=1;
            }
        }
        return a+b;
    }
    
}
