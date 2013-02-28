class atFirst
{
	public String atFirst(String str) 
	{
  		if(str.length()>=2)
  		{
  			return str.substring(0,2);
  		}
  		else if(str.length()==1)
  		{
  			return str+'@';
  		}
  		else
  		return str+"@@";
	}
}

public class testatFirst
{
	public static void main(String args[])
	{
	atFirst a=new atFirst();
	System.out.println(a.atFirst("foran"));
	}
}