package Recollect;

public class ReverseCharacters {

	public static void main(String[] args)
	{
		String givenString=" Madam, Tiruchendhur Muruga is always great";

		for(int i=givenString.length()-1;i>=0;i--)
		{
			System.out.print(givenString.charAt(i));
		}
	}

}
