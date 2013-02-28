class left2
{
	public String left2(String str) 
	{
  	String front=str.substring(2,str.length());
  	String end=str.substring(0,2);
  	return front+end;
	}
}

public class testleft2
{
	public static void main(String args[])
	{
	left2 l=new left2();
	System.out.println(l.left2("foran"));
	}
}