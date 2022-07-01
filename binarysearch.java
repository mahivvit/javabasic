import java.util.Scanner;
import java.util.Arrays;


class test{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] x=new int[5];
		int mid=2;
		int counter=0;
		System.out.println("enter array");
		for(int i=0;i<5;i++){
			x[i]=sc.nextInt();
		}
		System.out.println("enter element");
		int num=sc.nextInt();
		if(x[mid]>num){
			for(int i=0;i<=mid;i++){
				if(num==x[i]){
					System.out.println("data found and imndex is "+i);
		counter++;
				}
			}
		}
		if(x[mid]<num){
			for(int i=mid+1;i<5;i++){
				if(num==x[i]){
					System.out.println("data found and imndex is "+i);
		counter++;
				}
			}
		}
		if(x[mid]==num){
			System.out.println("data found"+mid);
		}
		if(counter==0){
			System.out.println("not found");
		}
		
		
	
		}
		
		}