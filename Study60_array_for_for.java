package Study0420;

import java.util.Scanner;

public class Study60_array_for_for 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String name[][] = new String[2][2];
		int kor[][] = new int[2][2];
		int eng[][] = new int[2][2];
		int mat[][] = new int[2][2];
		int sum[][] = new int[2][2];
		
		for(int i = 0; i<=1; i++)
		{
			for(int j = 0; j<=1; j++)
			{
				System.out.print(i+1+"반"+(j+1)+"번학생이름:");
				name[i][j] = sc.next();
				System.out.print(i+1+"반"+(j+1)+"번학생국어:");
				kor[i][j] = sc.nextInt();
				System.out.print(i+1+"반"+(j+1)+"번학생영어:");
				eng[i][j] = sc.nextInt();
				System.out.print(i+1+"반"+(j+1)+"번학생수학:");
				mat[i][j] = sc.nextInt();
				sum[i][j] = kor[i][j]+eng[i][j]+mat[i][j];
				System.out.println();
			}
			
		}
		
		for(int i = 0; i<2; i++)
		{
			for(int j = 0; j<2; j++)
			{
			System.out.println((i+1)+"반" +(j+1)+"번 "+ name[i][j]+ ": 총점 " + sum[i][j]);
			}
		}

	}

}
