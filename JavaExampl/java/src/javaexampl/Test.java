package javaexampl;


import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a String");
		String s=obj.nextLine();
		//System.out.println(s.length());
		if(s.length()%2==0)
		{
			System.out.println("Please assume  the string is of"
					+ " odd length ");
		}
		else
		{
			
			for(int row=0;row<s.length();row++)
			{
				for(int col=0;col<s.length();col++)
				{
					if(row==col || row==s.length()/2)
						{
							System.out.print(s.charAt(col)+" ");
						}
					else if(row+col==s.length()-1 || col==s.length()/2 )
					{
						System.out.print(s.charAt(row)+" ");
					}	
					
					else
						{
							System.out.print("  ");
						}
						
				
					
				}
				System.out.println();
			}
			 
		}
}
}