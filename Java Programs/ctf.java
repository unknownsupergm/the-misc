import java.util.Scanner;
class Ctf
{
	public static void main(String[] args)
	{
		int c;
		float f;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the celsius temperature");
		c=sc.nextInt();
		f = (c*9/5)+32;
		System.out.println("The Fahrenheit Temperature is "+f);
	}
}