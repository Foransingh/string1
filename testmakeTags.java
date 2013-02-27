class makeTags
{
	public String makeTags(String tag, String word) 
	{
  		return "<"+tag+">"+word+"</"+tag+">";
	}

}

public class testmakeTags
{
	public static void main(String args[])
	{
	makeTags m=new makeTags();
	System.out.println(m.makeTags("i","foran"));
	}
}