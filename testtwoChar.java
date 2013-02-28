class twoChar
{
	public String twoChar(String str, int index) 
	{
  		if(index+2<=str.length())
  		{
  			if(index<0)
  			{
  				return str.substring(0,2);
  			}
  			else
  				return str.substring(index,index+2);
  		}
  		else
  			return str.substring(0,2);
	}
}

public class testtwoChar
{
	public static void main(String args[])
	{
	twoChar t=new twoChar();
	System.out.println(t.twoChar("foran",1));
	}
}