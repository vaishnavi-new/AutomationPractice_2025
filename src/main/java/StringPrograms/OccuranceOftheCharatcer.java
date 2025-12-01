package StringPrograms;

import java.util.HashMap;

public class OccuranceOftheCharatcer extends ReverseString
{
    public static String givenString="Tiruchendhur Murugan is always with me.";
    public static void main(String[] args)
    {
        HashMap<Character,Integer> hsmp=new HashMap<>();
       for(int i=0;i<givenString.length();i++)
       {
           int count=0;
           if(hsmp.containsKey(givenString.charAt(i)))
           {
               count=count+hsmp.get(givenString.charAt(i));
               hsmp.put(givenString.charAt(i),++count);
           }
           else
           {
               hsmp.put(givenString.charAt(i),1);

           }
       }
        System.out.print(hsmp);

    }
}
