package InterviewJava.Array;

public class ClassTwoForConstructor extends ConstructorLearning
{
	int age;
	String name;
	String company;

	ClassTwoForConstructor(int age,String name, String company)
	{
		super(age, name, company);
		System.out.println("Child class contructor");
	}
	public static void main(String[] args)
	{
		ClassTwoForConstructor consLearning=new ClassTwoForConstructor(45,"Sanjay","IBM");
	
		consLearning.display();

	}
}
