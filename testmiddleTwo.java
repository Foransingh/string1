class middleTwo
{
	public String middleTwo(String str) 
	{
		int length=str.length()/2;
  		return str.substring(length-1,length+1);
	}
}

public class testmiddleTwo
{
	public static void main(String args[])
	{
	middleTwo m=new middleTwo();
	System.out.println(m.middleTwo("foransingh"));
	}
}