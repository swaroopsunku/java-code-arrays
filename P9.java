package arrays;
import java.util.*;
public class P9 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the size of an array :");
		int size=scan.nextInt();
		int[] a=new int[size];
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter the "+(i+1)+" element :");
			a[i]=scan.nextInt();
		}
		System.out.print('[');
		for(int j=a.length/2; j<a.length;j++) {
			System.out.print(a[j]+",");
		}
		System.out.println(']');
	}
}
