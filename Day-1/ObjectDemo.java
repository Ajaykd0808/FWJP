import java.lang.reflect.Method;

class ObjectDemo
{
	public static void main(String args[])
	{
		// Create an object of MethodDemo

		MethodDemo mt1=new MethodDemo();
		mt1.a=10;
		mt1.b=20;
		mt1.add();
		mt1.sub();

		MethodDemo mt2=new MethodDemo();
		mt2.a=50;
		mt2.b=20;
		mt2.add();
		mt2.sub();
		

	}


}
