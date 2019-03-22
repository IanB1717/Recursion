import java.util.Scanner;
public class count8
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		long Num= sc.nextLong();
		int count1=0;
		count1=count1+count(Num);
		System.out.println(count1);
	}
	public static int count(Long n)
	{
		if(n<=0)
		{
			return 0;
		}
		int last;
		if(n%100==88)
		{
			last=2;
		}
		else if(n%10 ==8)
		{
			last=1;
		}
		else
		{
			last=0;
		}
		long withoutLast=n/10;
		return last+count(withoutLast);
	}
}