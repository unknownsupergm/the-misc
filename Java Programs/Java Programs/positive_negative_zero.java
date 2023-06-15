import java.util.*;
public class positive_negative_zero
{
    public static void main(String args[])
    {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        a=sc.nextInt();
        if(a>0)
            System.out.println(a + " is positive.");
        else
        {
            if(a==0)
                System.out.println("Did you ener zero?");
            else
                System.out.println(a+ " is negative.");
        }
    }
}