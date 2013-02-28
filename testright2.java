class right2
{
	public String right2(String str) 
	{
  		String front=str.substring(str.length()-2,str.length());
  		String end=str.substring(0,str.length()-2);
  		return front+end;
	}
}

public class testright2
{
	public static void main(String args[])
	{
	right2 r=new right2();
	System.out.println(r.right2("foran"));
	}
}