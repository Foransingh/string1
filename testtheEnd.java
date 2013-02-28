class theEnd
{
	public String theEnd(String str, boolean front) 
	{
  		String temp="";
  		if(front==true)
  		{
  			return temp+str.charAt(0);
  		}
  		else
  			return temp+str.charAt(str.length()-1);
	}
}

public class testtheEnd
{
	public static void main(String args[])
	{
	theEnd t=new theEnd();
	System.out.println(t.theEnd("foran",true));
	}
}