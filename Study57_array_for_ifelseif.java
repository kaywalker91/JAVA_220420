package Study0420;

import java.util.Scanner;

public class Study57_array_for_ifelseif 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int kor[] = new int[3];
		int eng[] = new int[3];
		int math[] = new int[3];
		int sum[] = new int[3];
		double avg[] = new double[3];
		String hak[] = new String[3];
		
		System.out.println("3�� �л��� ������ ó���Ͻÿ�.");
		
		for(int i=0; i<3; i++)
		{
			System.out.print(i+1+"���л���������:");
			kor[i] = sc.nextInt();
			System.out.print(i+1+"���л���������:");
			eng[i] = sc.nextInt();
			System.out.print(i+1+"���л���������:");
			math[i] = sc.nextInt();
			System.out.println();
			sum[i] = kor[i] + eng[i] + math[i];
			avg[i] = sum[i] / 3.0;
			
			if(avg[i]>=90 && avg[i]<=100)
			{
				hak[i] = "A";
			}
			else if(avg[i]>=80 && avg[i]<90)
			{
				hak[i] = "B";
			}
			else if(avg[i]>=70 && avg[i]<80)
			{
				hak[i] = "C";
			}
			else
			{
				hak[i] = "F";
			}
		}
		
		for(int i=0; i<3; i++)
		{
		
			if(avg[i]>=90 && avg[i]<=100)
			{
				System.out.println(i+1+"���л� ���:" +avg[i]+ " / ���� " + hak[i]);
			}
			else if(avg[i]>=80 && avg[i]<90)
			{
				System.out.println(i+1+"���л� ���:" +avg[i]+ " / ���� " + hak[i]);
			}
			else if(avg[i]>=70 && avg[i]<80)
			{
				System.out.println(i+1+"���л� ���:" +avg[i]+ " / ���� " + hak[i]);
			}
			else
			{
				System.out.println(i+1+"���л� ���:" +avg[i]+ " / ���� " + hak[i]);
			}
		}

	}

}
