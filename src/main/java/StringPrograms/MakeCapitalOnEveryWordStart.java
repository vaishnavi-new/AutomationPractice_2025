package StringPrograms;

public class MakeCapitalOnEveryWordStart
{
    public static void main(String[] args)
    {
        String givenString="Tiruchendhur murugan is always with me.";
        String[] givenStringArr=givenString.split("\\s");
     for (String sys : givenStringArr )
     {
         System.out.println(sys);
     }
        StringBuffer sb=new StringBuffer();

        for(int i=0;i<givenStringArr.length;i++)
        {
            sb.append(Character.toUpperCase(givenStringArr[i].charAt(0)))
                    .append(givenStringArr[i].substring(1))
                   .append(" ");




        }
        System.out.println(sb);
    }
}
