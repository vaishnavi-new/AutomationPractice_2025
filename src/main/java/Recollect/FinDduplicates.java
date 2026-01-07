package Recollect;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class FinDduplicates
{
	public static void main(String[] args) {
        String givenString="Vaishnavipriya45678@$&";
        String resultString=givenString.replaceAll("[^A-Za-z0-9]","");
        System.out.println(resultString);
        HashMap<Character,Integer> hsmp=new HashMap<>();
        
        for(int i=0;i<resultString.length();i++)
        {
            if(resultString.charAt(i)=='a' || resultString.charAt(i)=='i' )
            {
                int count =0;
                if(hsmp.containsKey(resultString.charAt(i)))
                {
                    count=hsmp.get(resultString.charAt(i));
                    hsmp.put(resultString.charAt(i),++count);
                }
                else
                {
                    hsmp.put(resultString.charAt(i),1);
                }
            }
           
        }
        System.out.println(hsmp);
    }
}