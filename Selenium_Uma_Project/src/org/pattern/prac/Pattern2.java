package org.pattern.prac;

public class Pattern2 {
	public static void main(String[] args) {
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=4-i;j++)
			{
				System.out.print(" "+" ");
			}
			for(int k=0;k<=i;k++)
			{
				
				if(i==1)
				{
					System.out.print("#"+" ");
				}
				
				
				else if(i==3)
				{
					System.out.print("#"+" ");
				} 
				else
				{
				System.out.print("*"+" ");
				}
			}								
			System.out.println();
			}
		
		}
}
	
	


