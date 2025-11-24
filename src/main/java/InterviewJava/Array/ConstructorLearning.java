package InterviewJava.Array;

public class ConstructorLearning 
{
int age;
String name;
String company;
ConstructorLearning(int age,String name)
{
	this.age=age;
	this.name=name;
}
ConstructorLearning(int age,String name, String company)
{
	this.age=age;
	this.name=name;
	this.company=company;
}
	void display()
	{
		System.out.println("Values print from contructor "+ age);
		System.out.println("Values print from contructor "+ name);
		System.out.println("Values print from contructor "+ company);
	}
	


	
}

