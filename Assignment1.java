package HelloWorld;

import java.util.Scanner;

public class Assignment1 {
	
	public static int mtdh1(int ui) {
		if(1==ui) {
			System.out.println(ui+"is euqal to"+1);
			
		}
		if(2==ui) {
			System.out.println(ui+"is euqal to"+2);
		}
		if(3==ui) {
			System.out.println(ui+"is euqal to"+3);
		}
		if(ui!=1 && ui!=2 && ui!=3) {
			System.out.println("Not found");
		}
		return (0);
		
	}
	
	
	public static int mtdh2(int ui) {
		if(1==ui) {
			System.out.println(ui+"is euqal to"+1);
			
		}
		else if(2==ui) {
			System.out.println(ui+"is euqal to"+2);
		}
		else if(3==ui) {
			System.out.println(ui+"is euqal to"+3);
		}
		else {
			System.out.println("Not Found 2");
		}
		return (0);
		
	}
	
	public static int mtdh3(int ui) {
		if(1==ui) {
			System.out.println(ui+"is euqal to"+1);
			
		}
		else{
			if(2==ui) {
		
			System.out.println(ui+"is euqal to"+2);
			}
			else if(3==ui) {
			System.out.println(ui+"is euqal to"+3);
			}
			else {
			System.out.println("Not Found 3");
		}
		
		}
			
		return (0);
		
	}
	
	public static int mtdh4(int ui) {

		int i,f=0;
		for(i=1;i<=3;i++) {
			if(i==ui) {
				System.out.println(ui+"is equal to"+i);
				f=1;
				break;
			}
		}
			if(f==0) {
				System.out.println("Not found 4");
			}
			
		
		return 0;
	}
	
	public static int mtdh5(int ui) {
		int i=1,f=0;
		while(i<=3) {
			if(i==ui) {
				System.out.println(ui+"is equal to"+i);
				f=1;
				break;
			}
			i++;
		}
			if(f==0) {
				System.out.println("Not found 5");
			}
			
		
		return 0;
			
		}
	
	
	public static int mtdh6(int ui) {
		int arr[]= {1,2,3},f=0;
		for(int i:arr) {
			if(i==ui) {
				System.out.println(ui+"is equal to"+i);
				f=1;
				break;
			}
			i++;
		}
			if(f==0) {
				System.out.println("Not found 6");
			}
		
		return 0;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1=scan.nextInt();
		scan.close();
		
		mtdh1(num1);
		mtdh2(num1);
		mtdh3(num1);
		mtdh4(num1);
		mtdh5(num1);
		mtdh6(num1);
		
		
	}

	

}
