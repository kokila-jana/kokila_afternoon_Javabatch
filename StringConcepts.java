package afternoon;

import java.util.Arrays;
import java.util.Scanner;

public class StringConcepts {

	public static void main(String[] args) {
//		char a[]= {'H','e','l','l','o'};
//		String s=new String(a);
//		System.out.println(s);
		
//		String s="Java";
//		String s1="Java";
//		String s2=new String("Java");
//		System.out.println(s==s1);//t
//		System.out.println(s1==s2);//f
//		System.out.println(s.equals(s2));//t
		
//		String s="Java";
//		String s1=new String("Hello");
//		/*
//		 *    J   a   v   a
//		 *    0   1   2   3
//		 *    
//		 *    H  e  l  l  o
//		 *    0  1  2  3  4
//		 */
//		
//		System.out.println(s);
//		System.out.println(s.charAt(2));
//		System.out.println(s.codePointAt(0));
//		System.out.println(s.codePointBefore(3));
//		System.out.println(s.compareTo(s1));
//		/*
//		 * J-->74   H-->72  a-->97
//		 * H-->72   J-->74  A-->65
//		 *     02      -02      32
//		 */
//		System.out.println(s1.compareTo(s));
//		System.out.println(s.compareTo("JavA"));
//		System.out.println(s.compareToIgnoreCase("JavA"));
//		System.out.println(s.concat(s1));
//		System.out.println(s1.contains("llo"));
//		System.out.println(s.contentEquals("Java"));
//		System.out.println(s.endsWith("va"));
//		System.out.println(s.equals("Java"));
//		System.out.println(s.equalsIgnoreCase("jAVA"));
//		System.out.println(s.indent(5));
//		System.out.println(s.indexOf('a'));
//		System.out.println(s.lastIndexOf('a'));
//		System.out.println(s.length());
//		System.out.println(s.replace('a', 'o'));
//		System.out.println(s.startsWith("J"));
//		System.out.println(s1.substring(3));
//		System.out.println(s1.substring(0, 3));
//		String s2=" ";
//		System.out.println(s2.isBlank());
//		System.out.println(s2.isEmpty());
//		System.out.println(s.toLowerCase());
//		System.out.println(s.toUpperCase());
//		String s3="       Java Developer       ";
//		System.out.println(s3.strip());
//		System.out.println(s3.stripLeading());
//		System.out.println(s3.stripTrailing());
//		String s4="Hii I am java developer";
//		String a[]=s4.split(" ");
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		}
//			
//		for(String i:a)
//		{
//			System.out.println(i);
//		}
//		
//		char b[]=s.toCharArray();
//		for(char i:b)
//		{
//			System.out.println(i);
//		}
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter your string...");
//		String s=sc.nextLine();
//		System.out.println("enter your char");
//		char c=sc.next().charAt(0);
//		char a[]=s.toCharArray();
//		int count=0;
//		for(char i:a)
//		{
//			if(i==c)
//			{
//				count++;
//			}
//		}
//		System.out.println(count);
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter your string...");
//		String s=sc.nextLine();
//		String s1="";
//		for(int i=0;i<s.length();i++)
//		{
//			s1=s.charAt(i)+s1;
//		}
//		System.out.println(s1);
//		if(s.equals(s1))
//		{
//			System.out.println("Palindrome");
//		}
//		else
//		{
//			System.out.println("not palindrome");
//		}
		
		/*
		 * j a v a
		 * s1=j+""-->j
		 * s1=a+j-->aj
		 * s1=v+aj-->vaj
		 * s1=a+vaj-->avaj
		 */
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter your string...");
//		String s=sc.nextLine();
//		boolean b=false;
//		char a[]=s.toCharArray();
//		for(int i=0;i<a.length/2;i++)
//		{
//			if(a[i]==a[a.length-i-1])
//			{
//				b=true;
//			}
//		}
//		if(b==true)
//		{
//			System.out.println("palindrome");
//		}
//		else
//		{
//			System.out.println("not palindrome");
//		}
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter your string...");
//		String s=sc.nextLine();
		
		/*
		 * race   care
		 * acer   acer
		 */
		
//		String s="race",s1="care";
//		char a[]=s.toCharArray();
//		for(int i=0;i<a.length-1;i++)
//		{
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(a[i]>a[j])
//				{
//					char temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//		}
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		}
//		String s2=new String(a);
//		System.out.println(s2);
		
//		String s="race",s1="care";
//		char a[]=s.toCharArray();
//		char b[]=s1.toCharArray();
//		Arrays.sort(a);
//		Arrays.sort(b);
//		if(Arrays.equals(a, b))
//		{
//			System.out.println("String Anagram");
//		}
//		else
//		{
//			System.out.println("not anagram");
//		}
		
		StringBuffer s=new StringBuffer("Hello");
		System.out.println(s);
		System.out.println(s.capacity());
		s.ensureCapacity(25);
		System.out.println(s.capacity());
		/*
		 * 16+5-->21
		 * 21*2+2-->44
		 * 
		 */
		/*
		 * H  e  l  l  o
		 * 0  1  2  3  4
		 */
		s.append(" Java");
		System.out.println(s);
		/*
		 * H  e  l  l  o     J  a  v  a
		 * 0  1  2  3  4  5  6  7  8  9 
		 */
		s.insert(5, "@");
		/*
		 * H  e  l  l  o  @     J  a  v  a
		 * 0  1  2  3  4  5  6  7  8  9  10
		 */
		System.out.println(s);
		s.deleteCharAt(5);
		/*
		 * H  e  l  l  o     J  a  v  a
		 * 0  1  2  3  4  5  6  7  8  9 
		 */
		System.out.println(s);
		s.replace(6, 10, "Python");
		/*
		 * H  e  l  l  o     P  y  t  h  o  n
		 * 0  1  2  3  4  5  6  7  8  9  10 11
		 */
		System.out.println(s);
		s.delete(6, 12);
		/*
		 * H  e  l  l  o     
		 * 0  1  2  3  4  5  
		 */
		System.out.println(s);
		s.setCharAt(5, '@');
		/*
		 * H  e  l  l  o  @   
		 * 0  1  2  3  4  5  
		 */
		System.out.println(s);
		/*
		 * H  e  l  l  o  @   
		 * 0  1  2  3  4  5  
		 */
		System.out.println(s.length());
		s.setLength(10);
		System.out.println(s);
		s.reverse();
		
		System.out.println(s);
		
	}

}
