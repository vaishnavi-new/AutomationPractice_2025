package JavaPracticePrograms;

public class FindDuplicatesInArray 
{
public static void main(String[] args)
{
	int[] givenArr= {2,4,6,8,35,89,35,247,4,8367,26,2,97,467,8};
	
	System.out.println("Duplicates elements are");
	for(int i=0;i<givenArr.length;i++)
	{
		for(int j=i+1;j<givenArr.length;j++)
		{
			if(givenArr[i]==givenArr[j])
			{
				System.out.print(givenArr[i]+" ");
			}
		}
	}
}
}
