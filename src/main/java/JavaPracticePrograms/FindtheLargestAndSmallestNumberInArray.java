package JavaPracticePrograms;

public class FindtheLargestAndSmallestNumberInArray
{
public static void main(String[] args) 
{
	int[] givenArr= {2,4,6,8,35,89,35,247,4,8367,26,2,97,467};
	int largestOne=givenArr[0],smallestOne=givenArr[0];
	
	for(int i=0;i<givenArr.length;i++)
	{
		if(givenArr[i]>largestOne)
		{
			largestOne=givenArr[i];
		}
		if(givenArr[i]<smallestOne)
		{
			smallestOne=givenArr[i];
		}
	}
	System.out.println("Largest  : "+largestOne);
	
	System.out.println("SmallestOne : "+smallestOne);
	
}
}
