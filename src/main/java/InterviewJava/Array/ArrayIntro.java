package InterviewJava.Array;

import java.util.Arrays;

public class ArrayIntro
{
public static void main(String[] args)
{
	//declartion of String Array
	String[] givenArr= {"Vaishnavi", "Sanjay","Priya","Muruga","Nimalan","Guhan","IBM","Tiruchendhur"};
	
	
	//Make a copy of Original Array to avaoid losing order
	int[] mainOrder={67,68,335,79,24,87,3,7,3332,152,6};
	int[] cloneArray=mainOrder.clone();
	
	//find the  size of Array - arrayName.length
	System.out.println("Size of Array : "+givenArr.length);
	
	//Printing an array while 
	System.out.println("*************************Printing an Array using by While***************************");
	int i=0;
	while(i<givenArr.length)
	{
	System.out.println(givenArr[i]);
	i++;
	}
	
	// add the element is not working Array because it fixed the array size once you declare 
	
	//the size of the array is created the moment you declare it.
	
	//Arrays do start from 0.
	
	// Array not growable : For example we have 8 elements in the given Array. But I need to update the 9th element as 8th index as below
	//givenArr[8]="Mahilan";
	// I was getting this error 
	/*	Size of Array : 8
	Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
		at InterviewJava.Array.ArrayIntro.main(ArrayIntro.java:18) */
	
	
	System.out.println("*************************Printing an Array using by for each after inbuilt  sort***************************");

	//Sorting Array using by inbuilt
	Arrays.sort(givenArr);
	
	//Printing an array foreach after sort
	for(String string : givenArr )
	{
		System.out.println(string);
	}
	System.out.println("*************************Printing an mainorder Array using by for each before user defind the order sort***************************");
	
	i=0;
	while(i<mainOrder.length)
	{
		System.out.println(mainOrder[i]);
		i++;
	}
	
	System.out.println("*************************Printing an mainorder Array using by for each after user defind the order sort***************************");
	
	for(i=0;i<mainOrder.length;i++)
	{
		for(int j=i+1;j<mainOrder.length;j++)
		{
			if(mainOrder[i]<mainOrder[j])
			{
				int temp=mainOrder[i];
				mainOrder[i]=mainOrder[j];
				mainOrder[j]=temp;
				
			}
		}
	}
	
	i=0;
	while(i<mainOrder.length)
	{
		System.out.println(mainOrder[i]);
		i++;
	}
	mainOrder=cloneArray;
	System.out.println("*************************Printing an mainOrder Array using by for for loop :  Find the smallest and largest ***************************");
	int largestOne=mainOrder[0],smallestOne=mainOrder[0];
	System.out.println("Largest one : "+largestOne);
	System.out.println("Smallest one : "+smallestOne);
	for(i=0;i<mainOrder.length;i++)
	{
 	if(mainOrder[i]>largestOne)
	{
		largestOne=mainOrder[i];
	}
	if(mainOrder[i]<smallestOne)
	{
		smallestOne=mainOrder[i];
	}
	
		
	}
	System.out.println("Largest one : "+largestOne);
	System.out.println("Smallest one : "+smallestOne);
}
}
