import java.io.*;
import java.util.*;

class Subarr
{
	public static void main(String agrs[])
	{
		int i,j,n,sum,arr[];
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		n=s.nextInt();
		arr=new int[n];
		System.out.println("Enter the elements: ");
		for(i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Enter sum: ");
		sum=s.nextInt();
		int end,start=0,csum=0;
		boolean found= false;
		for(end=0;end<n;end++)
		{
			csum+=arr[end];
			while(csum>sum && start<=end)
			{
				csum-=arr[start++];
			}
			if(csum==sum)
			{
				System.out.println((start+1)+" "+(end+1));
				found=true;
				break;
			}
		}
		if(!found)
		{
			System.out.println("-1");
		}
	}
}