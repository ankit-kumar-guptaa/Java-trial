import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter your age :");
        int age= scan.nextInt();
        System.out.println("Age is:"+age);

        
    }
}
