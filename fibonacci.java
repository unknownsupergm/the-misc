import java.util.Scanner;
public class fibonacci
{
    public static void main(String args[])
    {
        int a=0, b=1, c, d;
        System.out.println("The fibonacci program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit");
        d = sc.nextInt();
        System.out.print(a + " ");
        System.out.print(b + " ");
        for(int i = 3; i<=d; i++)
        {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}