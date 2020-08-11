package lab3;

import java.util.Scanner;

public class roundoff {

	public static void main(String[] args) {
		 Scanner obj=new Scanner(System.in);
		System.out.println("enter  number to be round off");
		float n=obj.nextFloat();
		System.out.printf("roundoff number="+convert.nint(n));
		}

}
class convert
{
     static int nint(float n)
	{
		int result=(int)Math.round(n);
		return(result);
	}
}