class  AA
{
	int x = 10;
	static int y = 20;
//static class non static(NO-direct call)- me bhi call kar sakte hai i
//but non static ko static me call nahi kar sakte hai
void show()
	{
		System.out.println(x);//direct call
    }
    AA()
    {
		System.out.println(x);//direct call
	}
static void display()
		{
			System.out.println("display ");
         }
void hi()
{
	System.out.println(y);
}
public static void main(String [] args)
   {
	   System.out.println(new AA().x);//object call
	   AA a = new AA();//Object Referrence call
       System.out.println(a.x);
       new AA().show();
       a.hi();
       a.show();
       a.display();
   }
}
