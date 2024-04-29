public class Aniket{
	
static void sum()
	{
		int x= 10;
		int y = 20;
		int z = x+y;
		System.out.println("Sum = :"+z);
	}
static void morningwalk()
	{
		System.out.println("Morning wlak Metheod");
	}
static void add(int x,int y)
{
	int z = x+y;
	
	System.out.println("add = :"+z);
}
	
 public static void main(String [] args)
	{
		
	System.out.println("Main Method ");
	
	   //int x = 20;
	//System.out.printf("%d",x);
	
	//Test t = new Test(); //object 
	
    sum();	//Function call 
	 
	morningwalk();  //Function call 
	
	add(20,30);
}
}