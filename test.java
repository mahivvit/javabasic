import java.util.Scanner;
import java.lang.Math;
  
class test{
	 public static void main(String[] args){
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter your octal :- ");
		double num=sc.nextDouble();
	    int counter=0;
		int decimal=0;
		while(num>0){
			 double temp=num%10;
			 decimal+=temp*Math.pow(8,counter);
					
			num=num/10;
		counter++;
					
	}
		System.out.println(decimal);
		
	}
}
