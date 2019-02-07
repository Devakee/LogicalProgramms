package demoPackage;

public class DuplicateChar {

	public static void main(String[] args) 
	{
		String str="BetterButter";
		
		System.out.println(str.length());
		char[] inputstr=str.toCharArray();
		System.out.println(inputstr.length);
		
		int count = 0;
		char[] dubinput = null;
		for(int i=0;i<inputstr.length;i++) 
		{
			count=1;
			for(int j=i+1;j<inputstr.length;j++)
			{
				if(inputstr[i]==inputstr[j]) 
				{
					count=count+1;
					System.out.println(inputstr[i]+" "+count +"  times");
					dubinput[i]=inputstr[i];
					
				}
			}
			
			//count=0;
		}
		
	}

}
