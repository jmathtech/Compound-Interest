package compoundInterest;

import java.util.*; 

import static java.lang.Math.pow;

class CompoundInterest {
	
	public static void main(String args[]) {
 
		double amount=0, principle, rate, time, ci, t=1;		
	 
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter principle:  ");
			
			principle = sc.nextDouble();
			
			System.out.println("Enter rate: ");
		 
			rate = sc.nextDouble();
			
			System.out.println("Enter time: ");
			
			time = sc.nextDouble();
			
			rate = (1+rate/100);
	        
	    for (int i=0; i<time; i++)
	        	t*=rate;
		 
	 
			amount = principle * t;
			
			System.out.println("");		 
			System.out.println("Here is the Amount: " + amount);
		 
			ci = amount-principle;
		 
			System.out.println("The Compound Interest: " + ci);
 
	}
}