class makeOutWord
{
	public String makeOutWord(String out, String word) 
	{
  		return out.substring(0,2)+word+out.substring(2,4);
  	}
}

public class testmakeOutWord
{
	public static void main(String args[])
	{
	makeOutWord m=new makeOutWord();
	System.out.println(m.makeOutWord("hihi","foran"));
	}
}