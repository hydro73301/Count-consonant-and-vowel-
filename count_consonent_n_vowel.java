import java.util.*;
public class count_consonent_n_vowel
{
public static void main()
{
System.out.print(" ");
Scanner sc =new Scanner (System.in);
String s=sc.nextLine();
s=s.replace(" ","");
int l=s.length();
int j=0,e=0,i;
 
String a="aeiou";
for(i=0;i<l;i++)
{char c=s.charAt(i);
if(a.indexOf(c)>0)
{
j++;
}
else 
{
e++;
}
}
System.out.print("c="+j+"v="+e);}
}