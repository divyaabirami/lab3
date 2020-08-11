package lab3;

import java.util.Scanner;

public class majority {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter boolean value for i,j,k");
		major.i=obj.nextBoolean();
		major.j=obj.nextBoolean();
		major.k=obj.nextBoolean();
		System.out.println("majority is "+major.maj());
	}

}
class major
{
	static boolean i,j,k;
	static boolean maj()
	{
	return(i&j==true || j&k==true || i&k==true);
	}
}