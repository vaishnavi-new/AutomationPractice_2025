package StringPrograms;

public class ReverseString
{
   public static String givenString="Tiruchendhur Murugan is always with me.";

    public static void main(String[] args)
    {

        for(int i=givenString.length()-1;i>=0;i--)
        {
            System.out.print(givenString.charAt(i));
        }

    }
}
