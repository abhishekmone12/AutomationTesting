package Strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args)
	{
     String reversedStr = "";
	 Scanner sc =new Scanner(System.in);
	 
	 System.out.println("Enter a String");
	  String orginalStr = sc.nextLine();
	  
	  for(int i = orginalStr.length()-1 ;i >= 0 ; i--)
	  {
		  
		  reversedStr = reversedStr + orginalStr.charAt(i);
;	  }
	  System.out.println("Rversed String is :" +reversedStr);
	    
	}

}
