package lab3;

public class staticvariable {

	public static void main(String[] args) {
		System.out.println("1st increment");
		counter obj=new counter();
		obj.inc();
		System.out.println("2st increment");
		counter obj1=new counter();
		obj1.inc();
		

	}

}
class counter
{
	static int i=0;
	int j=0;
	void inc()
	{
		i=i+1;
		j=j+1;
		System.out.println(" static counter="+i);
		System.out.println(" counter="+j);
	}

	}


