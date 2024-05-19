import java.util.*;
class jp28
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,j,n,p=0;
System.out.println("Enter Size");
n=sc.nextInt();
int a[][]=new int[n][n];
System.out.println("Enter Elements in the MATRIX");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=sc.nextInt();
}
}
System.out.println("--ENTERED MATRIX--");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
int b[]=new int[n*n];

for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
b[p]=a[i][j];
p++;
}
}
System.out.println("SINGLE DIMENSIONAL ARRAY");
for(i=0;i<n*n;i++)
{
System.out.print(b[i]+" ");
}
for(i=0;i<(n*n);i++)
{
for(j=0;j<(n*n)-1-i;j++)
{
if(b[j]>b[j+1])
{
int c=b[j];
b[j]=b[j+1];
b[j+1]=c;
}
}
}
p=0;
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=b[p];
p++;
}
}
System.out.println();
System.out.println("--SORTED MATRIX--");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
}
}