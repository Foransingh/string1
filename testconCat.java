class conCat
{
	public String conCat(String a, String b) 
	{
		String result="";
		if(a.length()>0 && b.length()>0)
		{
			char a1=a.charAt(a.length()-1);
			char b1=(b.charAt(0));
  			if(a1==b1)
  			{
  			return a+b.substring(1,b.length());
  			}
  		}
  		return result+a+b;
	}
}

public class testconCat
{
	public static void main(String args[])
	{
	conCat c=new conCat();
	System.out.println(c.conCat("fora","an"));
	}
}