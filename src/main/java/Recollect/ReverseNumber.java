package Recollect;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		int givenNumber=456673,reverseNumber=0;
		
		while(givenNumber!=0)
		{
			reverseNumber=reverseNumber*10;
			reverseNumber=reverseNumber+givenNumber%10;
			givenNumber=givenNumber/10;
					
		}
		System.out.println(reverseNumber);
	}

}
