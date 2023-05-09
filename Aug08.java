import java.util.Scanner;


class Triangle
	{
	double a,b,c;
	void inputsides ()
		{
			Scanner sc = new Scanner (System.in);
			System.out.println ("Enter the sides of the triangle");
			a=sc.nextDouble();
			b=sc.nextDouble();
			c=sc.nextDouble();
		}
		
		void areacal()
		{
			double s,ar;
			s=(a+b+c)/2;
			ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
			System.out.println("Area="+ar);
		}
	}

class Aug08{
	public static void main(String args[])
	{
		Triangle obj=new Triangle();
		obj.inputsides();
		obj.areacal();
	}
}



//position matters
//calling triangle separately