import java.util.Scanner;
class Traverse{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of an array:-");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("enter your array element- ");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
			
			
		}
		System.out.println("Traversal array ");
		for(int i=0;i<size;i++){
		System.out.println("array["+i+"]="+arr[i]);
		}
	}
}