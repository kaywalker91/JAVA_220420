package Study0420;

import java.util.Scanner;

public class Study58_array_pr 
{

	public static void main(String[] args) 
	{
		
		String name[] = {"È«±æµ¿","È«±æµ¿1","È«±æµ¿2","È«±æµ¿3"};
		
		int score[][] = 
		{
			{100,100,100},
			{90,90,90},
			{11,11,11},
			{40,50,60}
				
		};
		
		System.out.println("1¹Ý1¹ø "+ name[0]+ ": ÃÑÁ¡ " + (score[0][0]+score[0][1]+score[0][2]));
		System.out.println("1¹Ý2¹ø "+ name[1]+ ": ÃÑÁ¡ " + (score[1][0]+score[1][1]+score[1][2]));
		System.out.println("2¹Ý1¹ø "+ name[2]+ ": ÃÑÁ¡ " + (score[2][0]+score[2][1]+score[2][2]));
		System.out.println("2¹Ý2¹ø "+ name[3]+ ": ÃÑÁ¡ " + (score[3][0]+score[3][1]+score[3][2]));
	}

}
