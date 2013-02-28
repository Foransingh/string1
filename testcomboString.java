class comboString
{	
	public String comboString(String a, String b) 
	{
	String temp="";
	if(a.length()>b.length())
  		{
  		temp=b;
  		b=a;
  		a=temp;
  		}
  	return a+b+a;
	}
}

public class testcomboString
{
	public static void main(String args[])
	{
	comboString c=new comboString();
	System.out.println(c.comboString("hi","foran"));
	}
}