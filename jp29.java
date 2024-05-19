import java.util.*;
class jp29
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String i;
int j;
System.out.println("Enter String");
i = sc.nextLine();
j = i.length();
for(int k = 0;k<j;k++){
System.out.print(i.charAt(k));
}
} 
}
