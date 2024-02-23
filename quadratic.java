import java.lang.math;
import java.util.Scanner;

class Quadratic{
	public static void main(String xx[])
	{
		int a,b,c;
		System.out.println("Enter roots of a,b,c");
		Scanner s1=new Scanner(System.in);
		a=s1.nextInt();
		b=s1.nextInt();
		c=s1.nextInt();
		double d=b*b-4*a*c;
		System.out.println("a="+a+"b="+b+"c="+c);
		if(a==0)
		{
			System.out.println("Not a Quadratic Equation");
		}
		else if(d>0)
		{
		System.out.println("The equation has 2 real & different solutions");
		double r1=(-b+math.sqrt(d)/(2*a));
		double r2=(-b-math.sqrt(d)/(2*a));
		System.out.println("r1="+r1);
		System.out.println("r2="+r2);
		}
		else if(d==0)
		{
		    System.out.println("The equation has real and equal solutions");
		    double r1=-b/(2*a);
		    double r2=-b/(2*a);
		    System.out.println("r1="+r1);
		    System.out.println("r2="+r2);
		}
		else if(d<0)
		{
		    System.out.println("The equation has unreal solutions");
		}
	}
}
		    
		
		