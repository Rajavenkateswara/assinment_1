package Assignment_1;

public class swap_task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		
		System.out.println("Before swapping of two number");
		System.out.println("a " + a);
		System.out.println("b " + b);
		/*
		//logic -1 By using another variable c ;
		
		int c=a;
		a=b;
		b=c;
		
		System.out.println("After swapping of two number");
		System.out.println("a " + a);
		System.out.println("b " + b);
		*/
		
		//Without using external varaiable we can swap the number;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swapping of two numbers");
		System.out.println("a " + a);
		System.out.println("b " + b);
		
		
		// if Variable not having the zero value we can use this approach
		/*
		a=a*b;
		b=a/b;
		a=a/b;
		
		System.out.println("After swapping of two numbers");
		System.out.println("a " + a);
		System.out.println("b " + b);
		*/
		// using BODMAS CONCEPTS
		 /* 
		b=a+b-(a=b);
		System.out.println("After swapping of two numbers");
		System.out.println("a " + a);
		System.out.println("b " + b);
		 
		 */
		
		
		
		
		
	}

}
