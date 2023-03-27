public class Ternary_op {
    public static void main(String[] args) {
        int a=2;
        int b=1;
        int c=3;
        String res=(a%2==0)? "even number":"odd number";
        System.out.println(res);
        int ank = (a<b)?(a<c? a:b) : (b<c? b: c);
        System.out.println(ank);
        if(a<b)
        {
            if(a<b){
                System.out.println(a);
            }
            else{
                System.out.println(c);
            }
        }
        else{
            if(b<c)
            {
                System.out.println(b);
            }
            else{
                System.out.println(c);
            }
        }

    }
    
}
