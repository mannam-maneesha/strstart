/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
	 int n;
	 Scanner sc=new Scanner(System.in);
	 String s=sc.next();
	 n=sc.nextInt();
	 char a[]=s.toCharArray();
	 for(int i=0;i<n;i++)
	 {
	 	System.out.print(a[i]);
	 }
	}
}
