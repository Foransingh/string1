class firstHalf
{
	public String firstHalf(String str) 
	{
  		return str.substring(0,str.length()/2);
	}
}

public class testfirstHalf
{
	public static void main(String args[])
	{
	firstHalf f=new firstHalf();
	System.out.println(f.firstHalf("nice"));
	}
}