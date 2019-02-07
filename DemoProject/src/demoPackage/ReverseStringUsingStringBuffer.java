package demoPackage;

public class ReverseStringUsingStringBuffer {

	public static void main(String[] args) {
		 	String[] reverse = null;
			String str="abc_def_ghi";
			String[] arrstr=str.split("_");
			for(int i=0;i<arrstr.length;i++) {
				System.out.println(arrstr[i]);
			}
			StringBuilder input1 = new StringBuilder(); 
			 input1.append(str); 
			 input1 = input1.reverse(); 
			 System.out.println(input1); 
		
	
		}

}
