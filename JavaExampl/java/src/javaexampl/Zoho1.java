package javaexampl;

import java.util.Scanner;

public class Zoho1 {
	
	public static char letter_combination(int n1) {
		String num[]= {"0","1",  "a,b,c",   "d,e,f",   "g,h,i",   "j,k,l",  "m,n,o",   "p,q,r,s",   "t,u,v",  "w,x,y,z"};
		switch(n1) {
		
		case 2 : System.out.println(num[2]);break;
		case 3 : System.out.println(num[3]);break;
		case 4 : System.out.println(num[4]);break;
		case 5 : System.out.println(num[5]);break;
		case 6 : System.out.println(num[6]);break;
		case 7 : System.out.println(num[7]);break;
		case 8 : System.out.println(num[8]);break;
		case 9 : System.out.println(num[9]);break;
		}
		return 0;
	}
	public static  void letter_combination2(int x2,int x1) {
		String num[]= {"0","1","abc","def","ghi","jkl","mno","pqrs"
				,"tuv","wxyz"};
		String n1=num[x2];
		String n2=num[x1];
		String result="";
		for(int i=0;i<n1.length();i++)
		{
			for(int j=0;j<n2.length();j++)
			{
				result=""+n1.charAt(i)+n2.charAt(j)+",";
				System.out.print(result);
			}
		}		
	}

	public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=obj.nextInt();
	
	if(n>1 && n<=9)
	{
		System.out.println(letter_combination(n)); 	
	}
	else if(n>20 && n<=99)
	{
		int rem=n%10, que=n/10;
		if(rem!=0 && rem!=1 && que!=1)
		{
			int n1=rem,   n2=que;
			letter_combination2(n2,n1);
		}else
		{
			System.out.println("can not find letter combinations");
		}
	}
	else
	{
		System.out.println("Invalid Input");
	}
		
}
}
