package HelloWorld;
import java.util.Scanner;

public class LOOPS {

	public static void main(String[] args) {
		
		System.out.println("1. if else");
		System.out.println("2. for loop");
		System.out.println("3. while");
		System.out.println("4. Do while");
		
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter your choice ");
        int num = scan.nextInt();
        scan.close();
        
        switch(num) {
        case 1:
        	int a=10, b=20, c=30, i;
    		
    		if(a==b && b==c) {
    			System.out.println("All are same");
    		}
    		else if(a==b && b!=c) {
    			if(a<c) {
    			System.out.println("A and B is same and smaller than c");
    			}
    			else if(a>c) {
    				System.out.println("A and B is same and greter than c");
    			}
    			
    		}
    		else if(a==c && b!=c) {
    			if(a<b) {
    			System.out.println("A and C is same and smaller than B");
    			}
    			else if(a>b) {
    				System.out.println("A and C is same and greter than B");
    			}
    			
    		}
    		else if(c==b && b!=a) {
    			if(c<a) {
    			System.out.println("A and B is same and smaller than c");
    			}
    			else if(c>a) {
    				System.out.println("A and B is same and greter than c");
    			}
    			
    		}
    		else if(a>b && a>c)
    		{
    			System.out.println("A is greter");
    			if(b>c) {
    				System.out.println("B is middel");
    				System.out.println("C is smaller");
    			}
    			else {
    				System.out.println("C is middel");
    				System.out.println("B is smaller");
    			}
    		}
    		else if(b>a && b>c)
    		{
    			System.out.println("B is greter");
    			if(a>c) {
    				System.out.println("A is middel");
    				System.out.println("c is smaller");
    			}
    			else {
    				System.out.println("C is middel");
    				System.out.println("A is smaller");
    			}
    		}
    		else if(c>a && c>b)
    		{
    			System.out.println("C is greter");
    			if(a>b) {
    				System.out.println("A is middel");
    				System.out.println("B is smaller");
    			}
    			else {
    				System.out.println("B is middel");
    				System.out.println("A is smaller");
    			}
    		}
        	
    		
    		
        case 2:
        	for(i=0;i<=9;i++) {
        		System.out.println(i);
        	}
        	
        case 3:
        	i=0;
        	while(i<=10) {
        		System.out.println(i);
        		i++;
        	}
        	
        case 4:
        	i=0;
        	do {
        		System.out.println(i);
        		i++;
        	}
        	while(i<=10);
        }
		
		
		
		
		

	}

}
