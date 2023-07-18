package sample;

import java.util.Scanner;

public class Maindiagonal {
	public static int Diagonal(int[][] a,int n) {
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+a[i][i];
		}
		return sum;
	}
	public static void main(String[] arg) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] a=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();			}
		}
	}
	int value=Diagonal(a,n);
	System.out.println(value);
	

}
