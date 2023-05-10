class Calc{
    public int add(int n1, int n2)
    {
        int result = n1+n2;
        return result;
    }
}
public class Method_overloading {
        public static void main(String[] args) {
            Calc obj= new Calc();
            int res=obj.add(65, 5);
            System.out.println(res);
            System.out.println("This is Overloading Program");
        }
    
}
