package demoPackage;

public class FindHeightesNumber {

	public static void main(String[] args) 
	{
		int[] input= {23,11,94,5,20,22};
		
		int smallnumber=input[0];
		
		for (int i = 1; i < input.length; i++)
		{
			if(input[i]<smallnumber) 
			{
				smallnumber=input[i];
			}
		}
		
		System.out.println("Small number is "+smallnumber);
	}

}
