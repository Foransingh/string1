class endsLy
{
	public boolean endsLy(String str) 
	{
  		if(str.length()>=2)
  		{
  			if(str.substring(str.length()-2,str.length()).equals("ly"))
  				return true;
  			else
  				return false;
  		}
  		else
  			return false;
	}
}

public class testendsLy
{
	public static void main(String args[])
	{
	endsLy e=new endsLy();
	System.out.println(e.endsLy("likely"));
	}
}