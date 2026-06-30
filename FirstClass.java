package afternoon;
import java.util.Scanner;
public class FirstClass {

	public static void main(String[] args)
	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter  user name");
//		String s=sc.nextLine();
//		if(s.equals("Java"))
//		{
//			System.out.println("Enter the Password..");
//			String s1=sc.nextLine();
//			if(s1.equals("12345"))
//			{
//				System.out.println("Login success");
//			}
//			else
//			{
//				System.out.println("invalid password..");
//			}
//		}
//		else
//		{
//			System.out.println("invalid user name..");
//		}
		
	/*
	 * loop 2 types
	 * 1.Entry checked loop
	 *  2 types
	 *  1.for
	 *  2.while
	 * 2.Exit checked loop
	 * 1.do-while loop
	 * 
	 * for syntax
	 * for(initialization;condition;inc/dec)
	 * {
	 * 		//block
	 * }
	 * 1.initialization(start value)
	 * 2.condition(stop value)
	 * 3.block 
	 * 4.inc/dec(step values)
	 * 
	 */
//		for(int i=1;i<=10;i++)
//		{
//			System.out.println(i);
//		}
		/*
		 *   1      2       3       4
		 *   i=1   1<=10    1      i=1+1=2
		 *   i=2   2<=10    2      2+1=3
		 *   i=3   3<=10    3      3+1=4
		 *   .
		 *   .
		 *   .
		 *   
		 *   i=10  10<=10   10    10+1=11
		 *   i=11  11<=10(false)
		 */
		
//		for(int i=10;i>=1;i--)
//		{
//			System.out.println(i);
//		}
		/*
		 *   1     2     3      4
		 *   i=10 10>=1  10     10-1=9
		 *   i=9  9>=1   9      9-1=8
		 *   i=8  8>=1   8      8-1=7
		 *   .
		 *   .
		 *   .
		 *   i=1  1>=1   1     1-1=0
		 *   i=0  0>=1(false)
		 * 
		 */
//		int i=1;
//		for(;i<=10;)
//		{
//			System.out.println(i);
//		}
//		int sum=0;
//		for(int i=1;i<=10;i++)
//		{
//			sum+=i;//sum=sum+i
//		}
//		System.out.println(sum);
		/*
		 *    1     2        3           4
		 *    i=1  1<=10   sum=0+1-->1  1+1=2
		 *    i=2  2<=10   sum=1+2-->3  2+1=3
		 *    i=3  3<=10   sum=3+3-->6  3+1=4
		 *    i=4  4<=10   sum=6+4-->10 4+1=5
		 *    i=5  5<=10   sum=10+5-->15 5+1=6
		 *    i=6  6<=10   sum=15+6-->21 6+1=7
		 *    i=7  7<=10   sum=21+7-->28 7+1=8
		 *    i=8  8<=10   sum=28+8-->36 8+1=9
		 *    i=9  9<=10   sum=36+9-->45 9+1=10
		 *    i=10 10<=10  sum=45+10-->55 10+1=11
		 *    i=11 11<=10(false)
		 */
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number...");
//		int a=sc.nextInt();
//		int fact=1;
//		for(int i=1;i<=a;i++)
//		{
//		fact*=i;	
//		}
//		System.out.println(fact);
		
		/*
		 *     1      2      3            4
		 *     i=1   1<=4  fact=1*1-->1  1+1=2
		 *     i=2   2<=4  fact=1*2-->2  2+1=3
		 *     i=3   3<=4  fact=2*3-->6  3+1=4
		 *     i=4   4<=4  fact=6*4-->24 4+1=5
		 *     i=5   5<=4(false)
		 *     
		 *     
		 */
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number...");
//		int a=sc.nextInt();
//		int count=0;
//		for(int i=1;i<=a;i++)
//		{
//			if(a%i==0)
//			{
//				count++;
//			}
//		}
//		System.out.println(count);
//		if(count==2)
//		{
//			System.out.println("Prime number...");
//		}
//		else
//		{
//			System.out.println("not prime number");
//		}
		/*
		 * i=1  1<=6
		 * if(6%1==0)-->1     1+1=2
		 * i=2  2<=6
		 * if(6%2==0)-->2     2+1=3
		 * i=3  3<=6
		 * if(6%3==0)-->3     3+1=4
		 * i=4   4<=6
		 * if(6%4==0)(false)  4+1=5
		 * i=5   5<=6    
		 * if(6%5==0)(false)  5+1=6
		 * i=6  6<=6
		 * if(6%6==0)-->6    
		 * 
		 */
		
//		for(int i=1;i<=4;i++)//outer loop,no of row
//		{
//			for(int j=1;j<=i;j++)//inner loop,no of column
//			{
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		/*
		 *1) i=1   1<=4
		 *   j=1   1<=1-->*
		 *   j=2   2<=1(false)
		 *2)i=2  2<=4
		 *   j=1 1<=2-->* *
		 *   j=2 2<=2-->
		 *   j=3 3<=2(false)
		 *3) i=3  3<=4
		 *   j=1  1<=3-->* * *
		 *   j=2  2<=3-->
		 *   j=3  3<=3-->
		 *   j=4  4<==3(false)
		 *4)i=4  4<=4
		 *   j=1  1<=4-->* * * *
		 *   j=2  2<=4-->
		 *   j=3  3<=4-->
		 *   j=4  4<=4-->
		 *   j=5  5<=4(false)
		 *5)i=5  5<=4(false)
		 *
		 *
		 *
		 *
		 *
		 */
//		int a=65;
//		for(int i=1;i<=7;i++)//outer loop,no of row
//		{
//			for(int j=1;j<=i;j++)//inner loop,no of column
//			{
//				System.out.print((char)a+" ");
//				a++;
//				if(a>90)
//				{
//					a=65;
//				}
//			}
//			System.out.println();
//		}
//		
		
		/*
		 * while loop syntax
		 * initialization-->1
		 * while(condition)-->2
		 * {
		 * 		//block-->3
		 * 		inc/dec-->4
		 * }
		 */
		
//		int a=1;
//		while(a<=10)
//		{
//			a++;
//			System.out.println(a);
//		}
		
//		int a=10;
//		while(a>=1)
//		{
//			a--;
//			System.out.println(a);
//		}
		
//		int a=1;
//		while(true)
//		{
//			System.out.println(a);
//			a+=2;
//		}
		
		
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		int temp=a;
//		int b=0;
//		while(a>0)
//		{
//			int c=a%10;
//			b=b*10+c;
//			a=a/10;
//		}
//		System.out.println(b);
//		if(temp==b)
//		{
//			System.out.println("Palindrome");
//		}
//		else
//		{
//			System.out.println("Not Palindrome");
//		}
		/*
		 * a=123
		 * b=0
		 * 1)123>0
		 * c=123%10-->c=3
		 * b=0*10+3-->b=3
		 * a=123/10-->a=12
		 * 
		 * 2)12>0
		 * c=12%10-->c=2
		 * b=3*10+2-->b=32
		 * a=12/10-->a=1
		 * 
		 * 3)1>0
		 * c=1%10-->c=1
		 * b=32*10+1-->b=321
		 * a=1/10-->a=0
		 * 
		 * 4)0>0(false)
		 */
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		int sum=0;
//		int mul=1;
//		while(a>0)
//		{
//			int c=a%10;
//			sum+=c;	
//			mul*=c;
//			a=a/10;
//		}
//		System.out.println(sum+" "+mul);
		/*
		 * a=123
		 * count=0
		 * 1)123>0
		 *   count=1
		 *   a=123/10-->a=12
		 * 2)12>0
		 *   count=2
		 *   a=12/10-->a=1
		 * 3)1>0
		 *   count=3
		 *   a=1/10-->a=0
		 *  4)0>0(false)
		 */
		
		/*
		 *do - while syntax 
		 *initialization;-->1
		 *do
		 *{
		 *		//block-->2
		 *		inc/dec-->3
		 *}
		 *while(condition);-->4
		 */
		
//		int a=1;
//		do
//		{
//			System.out.println(a);
//			a++;
//		}while(a>=10);
		
//		for(int i=1;i<=10;i++)
//		{
//			if(i==5)
//			{
//				System.out.println("spo");
//				continue;
//			}
//			System.out.println(i);
//		}
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter 2 numbers..");
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		System.out.println("enter the operator..");
//		char c=sc.next().charAt(0);
//		switch(c)
//		{
//		case '+':System.out.println(a+b);break;
//		case '-':System.out.println(a-b);break;
//		case '*':System.out.println(a*b);break;
//		case '/':System.out.println(a/b);break;
//		default:
//			System.out.println("Enter correct operator");
//		}
		
		
//		int a=10;
//		a=20;
//		a=45;
//		a=78;
//		System.out.println(a);
		
		
//		int a[]= {5,96,39,3,8,9,2};
//		/*
//		 *   5  96  39  3  8  9  2
//		 *   0   1   2  3  4  5  6
//		 */
//		System.out.println(a.length);
//		System.out.println(a[2]);
//		
//	for(int i=0;0;i++)
//	{
//		System.out.println("Welcome");
//	}
//		String s=new String("Welcome");
//		String s1=new String("Welcome");
//		String s="Welcome";
//		String s1="Welcome";
//		if(s==s1)
//		{
//			System.out.println("hello");
//		}
//		else
//		{
//			System.out.println("bye");
//		}
		
		/*
		 * While loop
		 * initialization--->1 
		 * while(coondition)-->2
		 * {
		 * 		//block-->3
		 * 		inc/dec-->4
		 * }
		 */
		
//		int a=10;
//		while(a>=1)
//		{
//			a--;
//			System.out.println(a);
//			
//		}
		/*
		 *      1        2       3       4
		 *      a=10    10>=1   10-1=9   9
		 *      a=9     9>=1    9-1=8    8
		 *      .
		 *      .
		 *      .
		 *      a=1     1>=1    1-1=0    0
		 *      a=0     0>0(false)     
		 */
		
//		int a=1;
//		while(a<=10)
//		{
//			System.out.println(a);
////			a++;
//			
//		}
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		int fact=1;
//		for(int i=1;i<=a;i++)
//		{
//			fact=fact*i;
//		}
//		System.out.println(fact);
		/*
		 * 1234
		 * 4321
		 * 
		 * 123
		 * 321
		 */
		
		
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		int b=0;
//		int temp=a;
//		while(a>0)
//		{
//			int c=a%10;
//			b=b*10+c;
//			a=a/10;
//		}
//		System.out.println(b+" "+a);
//		if(b==temp)
//		{
//			System.out.println("Palindrome");
//		}
//		else
//		{
//			System.out.println("not palindrome");
//		}
//		
		
//		for(int i=0;i<=10;i++)
//		{
//			if(i==5)
//			{
//				continue;
//			}
//			System.out.println(i);
//		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 numbers...");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Enter the operator");
		char c=sc.next().charAt(0);
		switch(c)
		{
		case '+':System.out.println(a+b);break;
		case '-':System.out.println(a-b);break;
		case '*':System.out.println(a*b);break;
		case '/':System.out.println(a/b);break;
		default:
			System.out.println("invalid operator");
		}
		
	}

}
