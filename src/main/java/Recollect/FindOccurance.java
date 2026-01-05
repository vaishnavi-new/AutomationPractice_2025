package Recollect;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindOccurance 
{
public static void main(String[] args) 
{
	String givenString="Madam, Tiruchendhur Muruga is always great";
	givenString=givenString.toLowerCase();
	HashMap<Character,Integer> hsmp=new HashMap<>();
	
	for(int i=0;i<givenString.length();i++)
	{
		int count=0;
		if(hsmp.containsKey(givenString.charAt(i)))
		{
			count=hsmp.get(givenString.charAt(i));
			hsmp.put(givenString.charAt(i),++count);
		}
		else
		{
			
			hsmp.put(givenString.charAt(i),1);
		}
	}
	/*
	 * Iterator<Map.Entry<Character,Integer>> itr=hsmp.entrySet().iterator();
	 * while(itr.hasNext()) { Map.Entry<Character,Integer> entry=itr.next();
	 * System.out.println(entry.getKey()+" - > "+entry.getValue()); }
	 */
	
	Iterator<Map.Entry<Character, Integer>>	itr=hsmp.entrySet().iterator();
	while(itr.hasNext())
	{
		Map.Entry<Character, Integer> entry=itr.next();
		System.out.println(entry.getKey()+" - > "+entry.getValue()); 
		
	}
}
}
