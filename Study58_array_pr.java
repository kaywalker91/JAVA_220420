package Study0420;

import java.util.Scanner;

public class Study58_array_pr 
{

	public static void main(String[] args) 
	{
		
		String name[] = {"ȫ�浿","ȫ�浿1","ȫ�浿2","ȫ�浿3"};
		
		int score[][] = 
		{
			{100,100,100},
			{90,90,90},
			{11,11,11},
			{40,50,60}
				
		};
		
		System.out.println("1��1�� "+ name[0]+ ": ���� " + (score[0][0]+score[0][1]+score[0][2]));
		System.out.println("1��2�� "+ name[1]+ ": ���� " + (score[1][0]+score[1][1]+score[1][2]));
		System.out.println("2��1�� "+ name[2]+ ": ���� " + (score[2][0]+score[2][1]+score[2][2]));
		System.out.println("2��2�� "+ name[3]+ ": ���� " + (score[3][0]+score[3][1]+score[3][2]));
	}

}
