//error not possible in java int x //global variable???
public class VariableUses{

	int y=100; //instance variable
	 static int z=200; //static variable
	//instance method
	void testMethod()
	{
		int lvar=22; //local variable
		System.out.println(y);
		System.out.println(z);
		System.out.println(lvar);
	}
	public static void main(String []args){
	   //static area
	   		//System.out.println(y);//to access must create object
	   		VariableUses sc=new VariableUses();
	   		System.out.println(sc.y);//100
	   		System.out.println(z);//200
	   		//error xxxSystem.out.println(lvar);(out of scope)
	}
}