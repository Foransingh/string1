class withoutEnd
{
	public String withoutEnd(String str) 
	{
  		return str.substring(1,str.length()-1);
	}

}

public class testwithoutEnd
{
	public static void main(String args[])
	{
	withoutEnd w=new withoutEnd();
	System.out.println(w.withoutEnd("foran"));
	}
}