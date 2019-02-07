package demoPackage;

import java.util.Scanner;

public class NumberInPulseMinusOrder {

	public static void main(String[] args) 
	{
		Scanner input= new Scanner(System.in);
		
		
		System.out.println("Enter the size");
		int size=input.nextInt();
		int Totalsize=size*2+1;
		System.out.println("Totak size is "+Totalsize);
		
		int count=size;
		boolean flage;
		
		for (int i = 1; i < Totalsize; i++) 
		{
		  if(i<= size) 
		  {
			  System.out.print("-"+count+",");
			  --count;
			  
			  			  
		  }	
		  if(i>= size) {
			  
			 System.out.print(count+",");
			  count++;
			 
		  }
		}
		
	}

}
