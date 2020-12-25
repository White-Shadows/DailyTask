package HelloWorld;

public class Operators {
	
	public static int post(int num1) {
		return num1++;
	}
	public static int add(int num1, int num2) {
		int sum;
		sum=num1+num2;
		return sum;
	}
	public static void main(String[] args) {
	
		int a=10, b=10,c;
		String op;
		++a;  		//prefix
		--b;
		c=a+b;					//Assignment
		System.out.println(a);
		System.out.println(b);
	
		c=post(a);
		System.out.println();	//postfix
		c=add(a,b);
		System.out.println(c);	//Aditive
		System.out.println(c);
		System.out.println(a*b);	//multiplicative
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println(a>b);	//Relational
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a<b);
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a|b);		//Bitwise
		System.out.println(a^b);
		System.out.println(a&b);
		System.out.println(c*=2);   //Assignment
		System.out.println(c/=2);
		System.out.println(c);
		System.out.println(c%=2);
		System.out.println(c-=2);
		System.out.println(c+=2);
		
		op=(a%2==0)?"Even":"Odd";	//Ternary
		System.out.println(op);
		
		int q=3;
		System.out.println(a>>1);
		
		
		
	}

}
