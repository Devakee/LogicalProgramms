package demoPackage;

public class RemoveWhiteSpace {

	public static void main(String[] args) 
	{
		String str= "OneSpace TwoSpaces  ThreeSpaces   FourSpaces    Tab        End";
		int str_len=str.length();
		char inputstring[]=str.toCharArray();
		for (int i = 0; i < str_len; i++) {
			
			if((inputstring[i]!=' ') )
			{
				System.err.print(inputstring[i]);
			}
		
				System.out.println("checking");
		}
		
	}

}
