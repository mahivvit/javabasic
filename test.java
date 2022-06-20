import java.util.Scanner;
import java.lang.Math;
  
class test{
	
	 public static void main(String[] args){
		 int[] x=new int[5];
		 
		 
		 Scanner sc =new Scanner(System.in);
		 System.out.println("enter array 5 digit  ");
		 		 for(int i=0;i<5;i++){
			 x[i]=sc.nextInt();
		 
		 }
System.out.println("enter the element you want to search");
		 
		 int num=sc.nextInt();
		
		 for(int i=0;i<5;i++){
			 if(num==x[i]){
				 System.out.println("index:-"+i);
				 
				 
			 }
				 
		
		 }
		 
		 

		 
		 
		 
		 
		
	
	}
}
