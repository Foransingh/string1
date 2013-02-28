class withoutEnd2
{
	public String withouEnd2(String str) 
	{
  		if(str.length()>=2)
  		{
  			String result=str.substring(1,str.length()-1);
  			return result;
  		}
  		else
  			return "";
	}
}

public class testfirstHalf
{
	public static void main(String args[])
	{
	withoutEnd2 w=new withoutEnd2();
	System.out.println(f.withoutEnd2("foran"));
	}
}