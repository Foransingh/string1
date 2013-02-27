class extraEnd
{
	public String extraEnd(String str) 
	{
		String result="";
  		if(str.length()>=2)
  		{
  			result=str.substring(str.length()-2,str.length());
  		}
  		return result+result+result;
	}
}

public class testextraEnd
{
	public static void main(String args[])
	{
	extraEnd e=new extraEnd();
	System.out.println(e.extraEnd("foran"));
	}
}