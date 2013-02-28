class middleThree
{
	public String middleThree(String str) 
	{
  		String result="";
  		int middle=str.length()/2;
  		return str.substring(middle-1,middle+2);
	}
}

public class testmiddleThree
{
	public static void main(String args[])
	{
	middleThree m=new middleThree();
	System.out.println(m.middleThree("foran"));
	}
}