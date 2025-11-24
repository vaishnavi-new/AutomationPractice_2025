package JavaPracticePrograms;

public class FindStringDupInArray 
{
public static void main(String[] args) 
{
	 String[] arr = {"java", "c", "python", "java", "c", "ruby"};
		System.out.println("Duplicates elements are");

	 for(int i=0;i<arr.length;i++)
	 { 
		 for(int j=i+1;j<arr.length;j++)
		 {
			 if(arr[i].equals(arr[j]))
			 {
				 System.out.println(arr[i]);
			 }
		 }
	 }
}
}
