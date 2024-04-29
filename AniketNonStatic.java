public class AniketNonStatic{
	
 void sum()//Non parameterized without return 
//static nahi hoga to object banana parega hoga to nahi banana parega
	{
		int x= 10;
		int y = 20;
		int z = x+y;
		System.out.println("Sum = :"+z);
	}
 void add(int x,int y)//parameterized  without return
{
	int z = x+y;
	
	System.out.println("add = :"+z);
}
	
 public static void main(String [] args)
	{
	AniketNonStatic t = new AniketNonStatic(); //object (AniketNonStatic) -> Reference varible
	
    t.sum();	//Function call 
	
	t.add(20,30);
}
}