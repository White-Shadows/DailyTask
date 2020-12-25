package HelloWorld;

import java.text.DecimalFormat;

public class IntToString {
	
	public static int mtdh1(int num1) {
		String str1 = Integer.toString(num1);

	    System.out.println("String str1 = " + str1);
		return 0; 

	}
	public static int mtdh2(int num1) {
		String str2 =String.valueOf(num1);

	    System.out.println("String str2 = " + str2);
		return 0; 

	}
	public static int mtdh3(int num1) {
		DecimalFormat df = new DecimalFormat("#");
	    String str3 = df.format(num1);
	    System.out.println("String str3 = " + str3);
	    return 0; 
	}
	public static int mtdh4(int num1) {
		StringBuffer sb = new StringBuffer();
	    sb.append(num1);
	    String str4 = sb.toString();
	    System.out.println("String str4 = " + str4);

	    return 0; 
	}
	public static int mtdh5(int num1) {
		 String str5 = new StringBuffer().append(1234).toString();
		    System.out.println("String str5 = " + str5);
		    return 0;
		    
	}
		
	
	
	public static void main(String[] args) {
		 int a = 1234;
		 mtdh1(a);
		 mtdh2(a);
		 mtdh3(a);
		 mtdh4(a);
		 mtdh5(a);
	}
	
	

}
