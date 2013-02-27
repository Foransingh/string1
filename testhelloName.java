class helloName
{
public String helloName(String name) 
	{
  	return "Hello "+name+"!";
	}
}

public class testhelloName
{
	public static void main(String args[])
	{
		helloName h=new helloName();
		System.out.println(h.helloName("foran"));
	}
}