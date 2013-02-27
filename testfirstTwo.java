class firstTwo
{
	public String firstTwo(String str) 
	{
  		if(str.length()>=2)
  		{
  			return str.substring(0,2);
  		}
  		else
  			return str;
	}
}

public class testfirstTwo
{
	public static void main(String args[])
	{
	firstTwo f=new firstTwo();
	System.out.println(f.firstTwo("foran"));
	}
}