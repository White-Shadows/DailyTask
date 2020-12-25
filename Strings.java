package HelloWorld;

public class Strings {

	public static void main(String[] args) {
		String a= "Hello";
		String str1="Hello";
		String s1= new String("World");
		String s2= new String(" Hello");
		System.out.println(a);
		System.out.println(s1);

		String str2=str1;
		System.out.println(str2);
		
		a=a.concat(s1);				//Concatination using concat() method
		System.out.println(a);
		str1="Hello"+s1;		//Concatination using + operator
		System.out.println(str1);
		
		boolean b = a.equals(s1);		//Comparison Using Equals() method
		System.out.println(b);
		b = a.equals(str1);
		System.out.println(b);
		
		b = (str1 == a);			//Comparison Using == operator
		System.out.println(b); 
		
		b = (str1 == s2);			//Comparison Using == operator
		System.out.println(b); 
		
		int g=a.compareTo(str1);		//Comparison Using compareTo() method
		System.out.println(g);
		
	}

}
