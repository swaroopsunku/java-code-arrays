package arrays;
import java.util.*;
public class P20 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the size of an array :");
		int size=scan.nextInt();
		int[] a=new int[size];
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter the "+(i+1)+" element :");
			a[i]=scan.nextInt();
		}
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 1; j < a.length-i; j++) {
				if (a[j-1]>a[j]) {
					int temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[0]<a[i+1]) {
				System.out.println("the second lowest element of an array is :"+a[i+1]);
				break;
			}
		}
	}
}
