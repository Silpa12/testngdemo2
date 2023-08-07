package Training_Tasks;

import java.util.Scanner;

public class Swapnumbers {
	int a ,b;
	
	
	public void  SwapNumber(int a,int b) {
		int temp = a;
		a=b;
		b=temp;
		System.out.println("a= "+a+"b= "+b);
		
		
	}
	
	public static  void main(String args[]) {
		
		Swapnumbers s1=new Swapnumbers();
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		s1.SwapNumber(a,b);
		
	
	}

}
