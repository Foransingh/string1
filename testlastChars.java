class lastChars
{
	public String lastChars(String a, String b) 
	{
  		String result="";
  		if(a.length()>=1 && b.length()>=1)
  		{
  			return result+a.charAt(0)+b.charAt(b.length()-1);
  		}
  		else if(b.length()!=0 && a.length()==0)
  		{
  			return result+'@'+b.charAt(b.length()-1);
  		}
  		else if(a.length()!=0 && b.length()==0 )
  		{
  			return result+a.charAt(0)+'@';
  		}
  		else
  		return result+'@'+'@';
	}
}

public class testlastChars
{
	public static void main(String args[])
	{
	lastChars l=new lastChars();
	System.out.println(l.lastChars("foran","singh"));
	}
}