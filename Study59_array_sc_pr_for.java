package Study0420;

import java.util.Scanner;

public class Study59_array_sc_pr_for 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String name[] = new String[4];
		int score[][] = new int[4][3];
		int sum[] = new int[4];
			
		System.out.print("1��1���л��̸�:");
		name[0] = sc.next();
		System.out.print("1��1���л�����:");
		score[0][0] = sc.nextInt();
		System.out.print("1��1���л�����:");
		score[0][1] = sc.nextInt();
		System.out.print("1��1���л�����:");
		score[0][2] = sc.nextInt();
		sum[0] = score[0][0]+score[0][1]+score[0][2];
		System.out.println();
		
		System.out.print("1��2���л��̸�:");
		name[1] = sc.next();
		System.out.print("1��2���л�����:");
		score[1][0] = sc.nextInt();
		System.out.print("1��2���л�����:");
		score[1][1] = sc.nextInt();
		System.out.print("1��2���л�����:");
		score[1][2] = sc.nextInt();
		sum[1] = score[1][0]+score[1][1]+score[1][2];
		System.out.println();
		
		System.out.print("2��1���л��̸�:");
		name[2] = sc.next();
		System.out.print("2��1���л�����:");
		score[2][0] = sc.nextInt();
		System.out.print("2��1���л�����:");
		score[2][1] = sc.nextInt();
		System.out.print("2��1���л�����:");
		score[2][2] = sc.nextInt();
		sum[2] = score[2][0]+score[2][1]+score[2][2];
		System.out.println();
		
		System.out.print("2��2���л��̸�:");
		name[3] = sc.next();
		System.out.print("2��2���л�����:");
		score[3][0] = sc.nextInt();
		System.out.print("2��2���л�����:");
		score[3][1] = sc.nextInt();
		System.out.print("2��2���л�����:");
		score[3][2] = sc.nextInt();
		sum[3] = score[3][0]+score[3][1]+score[3][2];
		System.out.println();
		
		for(int i = 0; i<=1; i++)
		{
			
			System.out.println("1��" +(i+1)+"�� "+ name[i]+ ": ���� " + sum[i]);
			
		}
		
		for(int i = 2; i<=3; i++)
		{
			
			System.out.println("2��" +(i-1)+"�� "+ name[i]+ ": ���� " + sum[i]);
			
		}			
			
	}

}
