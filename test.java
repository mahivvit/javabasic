import java.util.Scanner;
import java.util.Arrays;

class test{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		System.out.println("enter index of group ");
		int k=sc.nextInt();
		int[] arr=new int[n];
		int[] arr1=new int[n];
		int temp=0;
		System.out.println("enter element:-");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			
		}
		System.out.println("group1 reverse= ");
		
		for(int i=k;i>=0;i--){
	
			System.out.println(arr[i]);
		}
			
			System.out.println("group2 reverse= ");
		
		
		for(int i=n-1;i>k;i--){
			System.out.println(arr[i]);
		
		}
		}
	
}