package demoPackage;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.ListIterator;

public class Test1 {

	public static void main(String[] args) throws Exception
	{
		  ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
          list.add("Ravi");//Adding object in arraylist  
          list.add("Vijay");  
          list.add("Ravi");  
          list.add("Ajay");  
          
          Object[] arr= list.toArray();
          
          for(Object obj : arr)
          {
        	  System.out.println("converting ArrayList to Array "+ obj);
          }
           
          System.out.println("Traversing list through List Iterator:");  
          //Here, element iterates in reverse order  
          
//          Iterator list1=list.iterator();  
             ListIterator<String> list1=list.listIterator(list.size()); 
             System.out.print(list1);
             
             while(list1.hasPrevious())  
             {  
                 String str=list1.previous();  
                 System.out.println(str);  
             }  
        
             System.out.println("Traversing list through for loop:");  
             for(int i=0;i<list.size();i++)  
             {  
              System.out.println(list.get(i));     
             }  
        

	}

}
