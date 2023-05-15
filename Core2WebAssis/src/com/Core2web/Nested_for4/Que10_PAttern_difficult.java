package com.Core2web.Nested_for4;

public class Que10_PAttern_difficult 
{

	public static void main(String[] args) 
	{
		int n = 4;
		for (int i = 1; i <= n; i++) 
		{
			int temp = i;
			for (int j = 1; j <= i; j++) 
			{
				if (i % 2 != 0) 
				{
					if (j % 2 == 0) 
					{
						System.out.print(temp * temp * temp + "\t");
					} 
					else 
					{
						System.out.print(temp * temp + "\t");
					}
				} 
				else 
				{
					if (j % 2 != 0) 
					{
						System.out.print(temp * temp * temp + "\t");
					} 
					else 
					{
						System.out.print(temp * temp + "\t");
					}
				}
			temp++;
			}
			System.out.println();
		}

	}

}
