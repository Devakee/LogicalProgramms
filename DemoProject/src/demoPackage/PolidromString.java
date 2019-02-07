package demoPackage;

public class PolidromString {

	public static void main(String[] args) {
			//Rotator
		
		String strinput="Rotation";
		
		strinput=strinput.toLowerCase();
		
		char[] charString=strinput.toCharArray();
		
		int count=0;
		int forward=0;
		int backword=charString.length-1;
		
		while(forward <= backword) {
			
			if(charString[forward]==charString[backword]) {

				backword--;
				forward++;
				count++;
			}
			else
			{
				System.out.println("String is not polydrom");
				break;
			}
			
		}
		
		if(count>0) {
			System.out.println("String is polydrom");
		}
		
	}

}
