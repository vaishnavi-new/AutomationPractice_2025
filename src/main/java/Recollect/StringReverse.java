package Recollect;

public class StringReverse
{
public static void main(String[] args)
{
	String givenString="Tiruchendhur Muruga is always great";
	String[] strArr=givenString.split("\\s");
	
	for(int i=strArr.length-1;i>0;i--)
	{
		System.out.print(strArr[i]+" ");
	}
}
}
