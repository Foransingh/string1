class hasBad
{
	public boolean hasBad(String str) 
	{
		if(str.length()>=3)
		{
 			int track=str.indexOf("b");
 			if(track>=0 && track<=1 && track+3<=str.length())
 			{
 				if(str.substring(track,track+3).equals("bad"))
 				{
 					return true;
 				}
 			}
  		}
  		return false;
	}
}

public class testhasBad
{
	public static void main(String args[])
	{
	hasBad h=new hasBad();
	System.out.println(h.hasBad("xadxx"));
	}
}