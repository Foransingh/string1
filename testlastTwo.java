class lastTwo
{
	public String lastTwo(String str) 
	{
		if(str.length()>1)
		{
  			return str.substring(0,str.length()-2)+str.charAt(str.length()-1)+str.charAt(str.length()-2);
  		}
  		else
  			return str;
	}
}

public class testlastTwo
{
	public static void main(String args[])
	{
	lastTwo l=new lastTwo();
	System.out.println(l.lastTwo("foran"));
	}
}