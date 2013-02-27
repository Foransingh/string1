class makeAbba
{
	public String makeAbba(String a, String b) 
	{
  	return a+b+b+a;
	}
}

public class testmakeAbba
{
	public static void main(String args[])
	{
	makeAbba m=new makeAbba();
	System.out.println(m.makeAbba("hi","foran"));
	}
}