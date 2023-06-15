import java.util.*;
public class odd_or_even
{
    public static void main(String args[])
    {
        int a;
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter a number:");
        a = ob.nextInt();
        if(a%2==1)
        {
            System.out.println(a + " is odd.");
        }
        else
        {
            System.out.print(a+ " is even.");
        }
    }
}