package ch02;

public class FunctionTest {
	public static int addnum(int num1, int num2)
	{
		int result;
		result = num1 + num2;
		return result;
	}
	
	public static void sayHello(String greeting)
	{
		System.out.println(greeting);
	}
	
	public static int calcSum()
	{
		int sum = 0;
		int i;
		
		for(i = 0; i <= 100; ++i)
		{
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args)
	{
		int n1 = 10;
		int n2 = 20;
		
		int total = addnum(n1, n2);
				
		sayHello("안녕하세요");
		int num = calcSum();
		
		System.out.println(total);
		System.out.println(num);
		
	}
}
