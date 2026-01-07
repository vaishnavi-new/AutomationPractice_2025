package Recollect;


public class FindDupWithTwo 
{
    public static void main(String[] args) {
        String givenString="ABCDE";
        String givenString2="EDBCA";
        
        if(givenString.length()==givenString2.length())
        {
            for(int i=0;i<givenString.length();i++)
            {
                char ch1=givenString.charAt(i);
                for(int j=0;j<givenString2.length();j++)
                {
                
                  char ch2=givenString2.charAt(j);

                if(ch1==ch2)
                {
                    System.out.println("Matched:" +givenString.charAt(i));
                    break;
                }
                else
                {
                	 System.out.println("Not Matched:" +givenString.charAt(i));
                }
                
                }
            }
        }
        
         
    }
}