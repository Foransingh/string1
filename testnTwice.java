class nTwice
{
	public String nTwice(String str, int n) 
	{
	  	String front=str.substring(0,n);
  		String back=str.substring(str.length()-n,str.length());
  		return front+back;
}

}

public class testnTwice
{
	public static void main(String args[])
	{
	nTwice n=new nTwice();
	System.out.println(n.nTwice("foran",3));
	}
}