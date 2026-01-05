package Recollect;

import java.util.Iterator;

public class MakingFirstCharactersASCaptial
{
public static void main(String[] args)
{
	String givenString="Madam, Tiruchendhur Muruga is always great";
	String[] strArr=givenString.split("\\s");
	StringBuffer sb=new StringBuffer();
	
	for(int i=0;i<strArr.length;i++)
	{
		sb.append(Character.toUpperCase(strArr[i].charAt(0))).append(strArr[i].substring(1))
		.append(" ");
	}
	System.out.println(sb);
}
}
