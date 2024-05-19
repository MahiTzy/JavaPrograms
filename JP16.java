import java.util.*;

public class JP16 {
    public static void main(String[] args) {
	
		/*for(int i = 2; i <= 100; i+=2)
		{
			System.out.print(i+" ");
		}*/
		/*for(int i = 5; i <= 100; i+=5)
		{
			System.out.print(i+" ");
		}*/
		/*for(int i = 7; i <= 100; i+=7)
		{
			sum += i;
		}
		System.out.print("Sum is = "+sum);*/
		/*for(int i = 1; i <= 3; i++)
		{
			sum += Math.pow(i,2);
		}
		System.out.print("Sum is = "+sum);*/
		/*for(int i = 1; i <= 3;i++)
		{
			sum += Math.pow(i,2)+1;
		}
		System.out.print("Sum is = "+sum);*/
		/*double sum = 0;
		for(int i = 1; i <= 10;i++)
		{
			double res = Math.pow(i,2)-1;
			sum += res;
			System.out.print(res+" ");
		}
		System.out.print("Sum is = "+sum);*/
		/*for(int i = 1; i <= 1000000;i=i*10+1)
		{
			System.out.print(i+" ");
		}*/
		/*double sum = 0;
		double x = 3;
		for(double i = 2;i<=10;i+=2)
		{
			sum += Math.pow(x,i);
			System.out.print(Math.pow(x,i)+" ");
		}
		System.out.print("Sum is: "+sum);*/
		/*double even = 0;
		double odd = 0;
		double x = 2;
		for(double i = 1;i<=5;i++)
		{
			if(i%2==0){
			even += Math.pow(x,i);
			}
			else{
				odd += Math.pow(x,i);
			}
			//System.out.print(Math.pow(x,i)+" ");
		}
		System.out.print("Sum is: "+(odd-even));*/
		/*int n = 5;
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				System.out.println("Not a Prime");
				return;
			}
		}
		System.out.println("Prime");*/
		/*int n = 496;
		int sum = 0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		if(sum==n)
		{
			System.out.println(n+" is a Perfect Number");
		}
		else{
			System.out.println(n+" is Not a Perfect Number");
		}*/
		/*int n = 153;
		//int dig = Math.log10(n)+1;
		int temp = n;
		double sum = 0;
		while(temp>0)
		{
			double rem = temp%10;
			sum = sum + Math.pow(rem,3);
			temp = temp/10;
		}
		if(sum==n){
			System.out.println("Armstrong Number");
		}
		else{
			System.out.println("not a Armstrong Number");
		}*/
		/*int n = 152;
		//double dig = Math.log10(n)+1;
		int temp = n;
		double rev = 0;
		while(temp>0)
		{
			double rem = temp%10;
			rev = rev*10 + rem;
			temp = temp/10;
		}
		if(rev==n){
			System.out.println("Palindrome Number");
		}
		else{
			System.out.println("not a Palindrome Number");
		}*/
		/*int n = 25;
		int sq = n*n;
		int temp = n;
		int count = 0;
		while(temp>0)
		{
			int rem = temp%10;
			count++;
			temp = temp/10;
		}
		double dig = Math.pow(10,count);
		if(sq%dig==n){
			System.out.println("Automorphic Number");
		}
		else{
			System.out.println("not a Automorphic Number");
		}*/
		/*int i,j;
		for(i=1;i<=5;i++)
		{
			char k = 'A';
			for(j=1;j<=i;j++)
			{
					System.out.print(k+" ");
					k++;
			}
			System.out.println();
		}*/
		/*int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5-i;j++)
			{
					System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
					System.out.print(j);
			}
			System.out.println();
		}*/
		/*int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i-1;j++)
			{
					System.out.print(" ");
			}
			for(j=1;j<=5-i+1;j++)
			{
					System.out.print(j);
			}
			System.out.println();
		}*/
		/*int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5-i;j++)
			{
					System.out.print(" ");
			}
			int k = 5;
			for(j=1;j<=i;j++)
			{
					System.out.print(k);
					k--;
			}
			System.out.println();
		}*/
		/*int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i-1;j++)
			{
					System.out.print(" ");
			}
			int l = 5;
			for(j=1;j<=5-i+1;j++)
			{
					System.out.print(l);
					l--;
					
			}
			System.out.println();
		}*/
		/*System.out.println("B"+"C");
		System.out.println('B'+'C');*/
		/*int i,j;
		for(i=1;i<=5;i++)
		{
			char k = 'A';
			for(j=5;j>=i;j--)
			{
					System.out.print(k+" ");
					k++;
			}
			System.out.println();
		}*/
		/*String s = "Mohit";
		for(int i = 0; i < 5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(s.charAt(j));
			}
			System.out.println();
		}*/
		/*String s = "BlueJ";
		for(int i = 0; i<=4;i++)
		{
			for(int j=0;j<=4-i;j++)
			{
				System.out.print(s.charAt(j));
			}
			System.out.println();
		}*/
		int end = 100;
		
		for(int start = 2; start<=end; start++)
		{ 
			for(int i=2;i<=start/2;i++)
			{
				if(start%i==0)
				{
					break;
				}
				System.out.print(start);
				}
			}
		}
    }